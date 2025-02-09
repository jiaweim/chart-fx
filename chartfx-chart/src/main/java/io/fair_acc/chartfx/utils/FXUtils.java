package io.fair_acc.chartfx.utils;

import javafx.application.Platform;
import javafx.scene.Scene;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Small tool to execute/call JavaFX GUI-related code from potentially non-JavaFX thread (equivalent to old:
 * SwingUtilities.invokeLater(...) ... invokeAndWait(...) tools)
 *
 * @author rstein
 */
public final class FXUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(FXUtils.class);

    /**
     * assert in JavaFX Thread
     */
    public static void assertJavaFxThread() {
        if (!Platform.isFxApplicationThread()) {
            throw new IllegalStateException("access JavaFX from non-JavaFX thread - please fix");
        }
    }

    /**
     * If you run into any situation where all of your scenes end, the thread managing all of this will just peter out.
     * To prevent this from happening, add this line.
     * <p>
     * As a side effect, JavaFX does not exit after closing all javafx windows.
     */
    public static void keepJavaFxAlive() {
        Platform.setImplicitExit(false);
    }

    /**
     * Invokes a Runnable in JFX Thread and waits while it's finished. Like SwingUtilities.invokeAndWait does for EDT.
     *
     * @param function Runnable function that should be executed within the JavaFX thread
     * @throws Exception if a exception is occurred in the run method of the Runnable
     * @author hendrikebbers
     * @author rstein
     */
    public static void runAndWait(final Runnable function) throws Exception {
        runAndWait("runAndWait(Runnable)", t -> {
            function.run();
            return "FXUtils::runAndWait - null Runnable return";
        });
    }

    /**
     * Invokes a Runnable in JFX Thread and waits while it's finished. Like SwingUtilities.invokeAndWait does for EDT.
     *
     * @param function Supplier function that should be executed within the JavaFX thread
     * @param <R>      generic for return type
     * @return function result of type R
     * @throws Exception if a exception is occurred in the run method of the Runnable
     * @author hendrikebbers
     * @author rstein
     */
    public static <R> R runAndWait(final Supplier<R> function) throws Exception {
        return runAndWait("runAndWait(Supplier<R>)", t -> function.get());
    }

    /**
     * Invokes a Runnable in JFX Thread and waits while it's finished. Like SwingUtilities.invokeAndWait does for EDT.
     *
     * @param argument function argument
     * @param function transform function that should be executed within the JavaFX thread
     * @param <T>      generic for argument type
     * @param <R>      generic for return type
     * @return function result of type R
     * @throws Exception if an exception is occurred in the run method of the Runnable
     * @author hendrikebbers, original author
     * @author rstein, extension to Function, Supplier, Runnable
     */
    public static <T, R> R runAndWait(final T argument, final Function<T, R> function) throws Exception {
        if (Platform.isFxApplicationThread()) {
            return function.apply(argument);
        } else {
            final AtomicBoolean runCondition = new AtomicBoolean(true);
            final Lock lock = new ReentrantLock();
            final Condition condition = lock.newCondition();
            final ExceptionWrapper throwableWrapper = new ExceptionWrapper();

            final RunnableWithReturn<R> run = new RunnableWithReturn<>(() -> {
                R returnValue = null;
                lock.lock();
                try {
                    returnValue = function.apply(argument);
                } catch (final Exception e) {
                    throwableWrapper.t = e;
                } finally {
                    try {
                        runCondition.set(false);
                        condition.signal();
                    } finally {
                        runCondition.set(false);
                        lock.unlock();
                    }
                }
                return returnValue;
            });
            lock.lock();
            try {
                Platform.runLater(run);
                while (runCondition.get()) {
                    condition.await();
                }
                if (throwableWrapper.t != null) {
                    throw throwableWrapper.t;
                }
            } finally {
                lock.unlock();
            }
            return run.getReturnValue();
        }
    }

    public static void runFX(final Runnable run) {
        FXUtils.keepJavaFxAlive();
        if (Platform.isFxApplicationThread()) {
            run.run();
        } else {
            Platform.runLater(run);
        }
    }

    public static boolean waitForFxTicks(final Scene scene, final int nTicks) {
        return waitForFxTicks(scene, nTicks, -1);
    }

    public static boolean waitForFxTicks(final Scene scene, final int nTicks, final long timeoutMillis) { // NOPMD
        if (Platform.isFxApplicationThread()) {
            for (int i = 0; i < nTicks; i++) {
                Platform.requestNextPulse();
            }
            return true;
        }
        final Timer timer = new Timer("FXUtils-thread", true);
        final AtomicBoolean run = new AtomicBoolean(true);
        final AtomicInteger tickCount = new AtomicInteger(0);
        final Lock lock = new ReentrantLock();
        final Condition condition = lock.newCondition();

        final Runnable tickListener = () -> {
            if (tickCount.incrementAndGet() >= nTicks) {
                lock.lock();
                try {
                    run.getAndSet(false);
                    condition.signal();
                } finally {
                    run.getAndSet(false);
                    lock.unlock();
                }
            }
            Platform.requestNextPulse();
        };

        lock.lock();
        try {
            FXUtils.runAndWait(() -> scene.addPostLayoutPulseListener(tickListener));
        } catch (final Exception e) {
            // cannot occur: tickListener is always non-null and
            // addPostLayoutPulseListener through 'runaAndWait' always executed in JavaFX thread
            LOGGER.atError().setCause(e).log("addPostLayoutPulseListener interrupted");
        }
        try {
            Platform.requestNextPulse();
            if (timeoutMillis > 0) {
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        LOGGER.atWarn().log("FXUtils::waitForTicks(..) interrupted by timeout");

                        lock.lock();
                        try {
                            run.getAndSet(false);
                            condition.signal();
                        } finally {
                            run.getAndSet(false);
                            lock.unlock();
                        }
                    }
                }, timeoutMillis);
            }
            while (run.get()) {
                condition.await();
            }
        } catch (final InterruptedException e) {
            LOGGER.atError().setCause(e).log("await interrupted");
        } finally {
            lock.unlock();
            timer.cancel();
        }
        try {
            FXUtils.runAndWait(() -> scene.removePostLayoutPulseListener(tickListener));
        } catch (final Exception e) {
            // cannot occur: tickListener is always non-null and
            // removePostLayoutPulseListener through 'runaAndWait' always executed in JavaFX thread
            LOGGER.atError().setCause(e).log("removePostLayoutPulseListener interrupted");
        }

        return tickCount.get() >= nTicks;
    }

    private static class ExceptionWrapper {

        private Exception t;
    }

    private static class RunnableWithReturn<R> implements Runnable {

        private final Supplier<R> internalRunnable;
        private final Object lock = new Object();
        private R returnValue;

        public RunnableWithReturn(final Supplier<R> run) {
            internalRunnable = run;
        }

        public R getReturnValue() {
            synchronized (lock) {
                return returnValue;
            }
        }

        @Override
        public void run() {
            synchronized (lock) {
                returnValue = internalRunnable.get();
            }
        }
    }
}
