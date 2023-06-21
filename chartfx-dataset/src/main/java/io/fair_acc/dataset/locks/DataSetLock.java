package io.fair_acc.dataset.locks;

import io.fair_acc.dataset.DataSet;

import java.io.Serializable;
import java.util.function.Supplier;

/**
 * A Simple ReadWriteLock for the DataSet interface and its fluent-design approach
 * <p>
 * Some implementation recommendation: write lock guards behave the same as ReentrantLock with the additional
 * functionality, that a <code>writeLock()</code> and subsequent <code>writeUnLock()</code> mute and, respectively,
 * un-mute the given DataSet's auto-notification states, e.g. example:
 *
 * <pre>
 *  lock.writeLock(); // stores isAutoNotification state
 *     [..] some other code [..]
 *  lock.writeUnLock(); // restores isAutoNotification state
 * </pre>
 * <p>
 * However, the recommended usage is using the lock guard primitives, e.g.
 *
 * <pre>
 * lock.readLockGuard(() -&gt; {
 *    [..] some read-lock protected code [..]
 *    return retVal; // N.B. optional return - here: assumes Objects or boxed primitives
 * });
 * </pre>
 * <p>
 * Alternatively the best performing option for frequent simple reads without major data processing
 *
 * <pre>
 * Result ret = lock.readLockGuardOptimistic(() -&gt; {
 *    [..] some read-lock protected code [..]
 * 	  return retVal; // N.B. optional return - here: assumes Objects or boxed primitives
 * });
 * </pre>
 * <p>
 * The latter assumes infrequent writes (e.g. a single writer thread) and frequent unobstructed reads (ie. many reader
 * threads). The lock internally acquires the data w/o explicitly locking, checks afterwards if the data has potentially
 * changed a write-lock acquiring thread, and as a automatic fall-back uses the guaranteed (but more expensive) read
 * lock to assure that the read data structure is consistent.
 *
 * @param <D> generics reference, usually to <code>&lt;? extends DataSet&gt;</code>
 * @author rstein
 */
@SuppressWarnings({"PMD.DoNotUseThreads", "PMD.CommentSize"}) // Runnable used as functional interface
public interface DataSetLock<D extends DataSet> extends Serializable {

    /**
     * reentrant read-lock
     *
     * @return supporting DataSet (fluent design)
     */
    D readLock();

    /**
     * @param reading typ. lambda expression that is executed with read lock
     * @return supporting DataSet (fluent design)
     */
    D readLockGuard(final Runnable reading);

    /**
     * @param <R>     generic return type
     * @param reading typ. lambda expression that is executed with read lock
     * @return supporting DataSet (fluent design)
     */
    <R> R readLockGuard(final Supplier<R> reading);

    /**
     * @param reading lambda expression that is executed with read lock
     * @return supporting DataSet (fluent design)
     */
    D readLockGuardOptimistic(final Runnable reading);

    /**
     * @param <R>     generic return type
     * @param reading typ. lambda expression that is executed with read lock
     * @return supporting DataSet (fluent design)
     */
    <R> R readLockGuardOptimistic(final Supplier<R> reading);

    /**
     * @return supporting DataSet (fluent design)
     */
    D readUnLock();

    /**
     * require a write lock
     *
     * @return supporting DataSet (fluent design)
     */
    D writeLock();

    /**
     * @param writing typ. lambda expression that is executed with write lock
     * @return supporting DataSet (fluent design)
     */
    D writeLockGuard(final Runnable writing);

    /**
     * @param <R>     generic return type
     * @param writing lambda expression that is executed with write lock
     * @return supporting DataSet (fluent design)
     */
    <R> R writeLockGuard(final Supplier<R> writing);

    /**
     * @return supporting DataSet (fluent design)
     */
    D writeUnLock();

}