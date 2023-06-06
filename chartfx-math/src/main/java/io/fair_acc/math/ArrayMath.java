// This file has been generated automatically by chartfx-generate. Do not modify!
package io.fair_acc.math;

import io.fair_acc.dataset.utils.AssertUtils;

/**
 * Utility class containing static functions for working with arrays of
 * different types.
 *
 * @author rstein
 * @author Florian Enner
 * @author Alexander Krimm
 * @since 07 Jun 2020
 */
public class ArrayMath {
    protected static final String DIVISOR = "divisor";
    protected static final String IN = "in";
    protected static final String MULTIPLICATOR = "multiplicator";
    protected static final String VALUE = "value";

    ArrayMath() { // NOPMD - package private
        throw new IllegalStateException("Utility class");
    }

    //// codegen: double -> float, int, long, short
    public static double[] add(final double[] in, final double value) {
        return add(in, 0, value, in.length);
    }

    public static double[] add(final double[] in, final double[] value) {
        return add(in, 0, value, 0, in.length);
    }

    public static double[] add(final double[] in, final int offsetIn, final double[] value, final int offsetValue, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(VALUE, value);
        AssertUtils.gtOrEqual(VALUE, length + offsetValue, value.length);

        final double[] ret = new double[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (double) (in[i + offsetIn] + value[i + offsetValue]);
        }

        return ret;
    }

    public static double[] add(final double[] in, final int offset, final double value, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        final double[] ret = new double[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (double) (in[i + offset] + value);
        }

        return ret;
    }

    public static double[] addInPlace(final double[] in, final double value) {
        return addInPlace(in, 0, value, in.length);
    }

    public static double[] addInPlace(final double[] in, final double[] value) {
        return addInPlace(in, 0, value, 0, in.length);
    }

    public static double[] addInPlace(final double[] in, final int offsetIn, final double[] value, final int offsetValue, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(VALUE, value);
        AssertUtils.gtOrEqual(VALUE, length + offsetValue, value.length);

        for (int i = 0; i < length; i++) {
            in[i + offsetIn] += value[i + offsetValue];
        }
        return in;
    }

    public static double[] addInPlace(final double[] in, final int offset, final double value, final int length) {
        AssertUtils.notNull(IN, in);

        for (int i = offset; i < length + offset; i++) {
            in[i] += value;
        }
        return in;
    }
    // start: float
    public static float[] add(final float[] in, final float value) {
        return add(in, 0, value, in.length);
    }

    public static float[] add(final float[] in, final float[] value) {
        return add(in, 0, value, 0, in.length);
    }

    public static float[] add(final float[] in, final int offsetIn, final float[] value, final int offsetValue, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(VALUE, value);
        AssertUtils.gtOrEqual(VALUE, length + offsetValue, value.length);

        final float[] ret = new float[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (float) (in[i + offsetIn] + value[i + offsetValue]);
        }

        return ret;
    }

    public static float[] add(final float[] in, final int offset, final float value, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        final float[] ret = new float[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (float) (in[i + offset] + value);
        }

        return ret;
    }

    public static float[] addInPlace(final float[] in, final float value) {
        return addInPlace(in, 0, value, in.length);
    }

    public static float[] addInPlace(final float[] in, final float[] value) {
        return addInPlace(in, 0, value, 0, in.length);
    }

    public static float[] addInPlace(final float[] in, final int offsetIn, final float[] value, final int offsetValue, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(VALUE, value);
        AssertUtils.gtOrEqual(VALUE, length + offsetValue, value.length);

        for (int i = 0; i < length; i++) {
            in[i + offsetIn] += value[i + offsetValue];
        }
        return in;
    }

    public static float[] addInPlace(final float[] in, final int offset, final float value, final int length) {
        AssertUtils.notNull(IN, in);

        for (int i = offset; i < length + offset; i++) {
            in[i] += value;
        }
        return in;
    }
    // end: float

    // start: int
    public static int[] add(final int[] in, final int value) {
        return add(in, 0, value, in.length);
    }

    public static int[] add(final int[] in, final int[] value) {
        return add(in, 0, value, 0, in.length);
    }

    public static int[] add(final int[] in, final int offsetIn, final int[] value, final int offsetValue, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(VALUE, value);
        AssertUtils.gtOrEqual(VALUE, length + offsetValue, value.length);

        final int[] ret = new int[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (int) (in[i + offsetIn] + value[i + offsetValue]);
        }

        return ret;
    }

    public static int[] add(final int[] in, final int offset, final int value, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        final int[] ret = new int[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (int) (in[i + offset] + value);
        }

        return ret;
    }

    public static int[] addInPlace(final int[] in, final int value) {
        return addInPlace(in, 0, value, in.length);
    }

    public static int[] addInPlace(final int[] in, final int[] value) {
        return addInPlace(in, 0, value, 0, in.length);
    }

    public static int[] addInPlace(final int[] in, final int offsetIn, final int[] value, final int offsetValue, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(VALUE, value);
        AssertUtils.gtOrEqual(VALUE, length + offsetValue, value.length);

        for (int i = 0; i < length; i++) {
            in[i + offsetIn] += value[i + offsetValue];
        }
        return in;
    }

    public static int[] addInPlace(final int[] in, final int offset, final int value, final int length) {
        AssertUtils.notNull(IN, in);

        for (int i = offset; i < length + offset; i++) {
            in[i] += value;
        }
        return in;
    }
    // end: int

    // start: long
    public static long[] add(final long[] in, final long value) {
        return add(in, 0, value, in.length);
    }

    public static long[] add(final long[] in, final long[] value) {
        return add(in, 0, value, 0, in.length);
    }

    public static long[] add(final long[] in, final int offsetIn, final long[] value, final int offsetValue, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(VALUE, value);
        AssertUtils.gtOrEqual(VALUE, length + offsetValue, value.length);

        final long[] ret = new long[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (long) (in[i + offsetIn] + value[i + offsetValue]);
        }

        return ret;
    }

    public static long[] add(final long[] in, final int offset, final long value, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        final long[] ret = new long[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (long) (in[i + offset] + value);
        }

        return ret;
    }

    public static long[] addInPlace(final long[] in, final long value) {
        return addInPlace(in, 0, value, in.length);
    }

    public static long[] addInPlace(final long[] in, final long[] value) {
        return addInPlace(in, 0, value, 0, in.length);
    }

    public static long[] addInPlace(final long[] in, final int offsetIn, final long[] value, final int offsetValue, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(VALUE, value);
        AssertUtils.gtOrEqual(VALUE, length + offsetValue, value.length);

        for (int i = 0; i < length; i++) {
            in[i + offsetIn] += value[i + offsetValue];
        }
        return in;
    }

    public static long[] addInPlace(final long[] in, final int offset, final long value, final int length) {
        AssertUtils.notNull(IN, in);

        for (int i = offset; i < length + offset; i++) {
            in[i] += value;
        }
        return in;
    }
    // end: long

    // start: short
    public static short[] add(final short[] in, final short value) {
        return add(in, 0, value, in.length);
    }

    public static short[] add(final short[] in, final short[] value) {
        return add(in, 0, value, 0, in.length);
    }

    public static short[] add(final short[] in, final int offsetIn, final short[] value, final int offsetValue, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(VALUE, value);
        AssertUtils.gtOrEqual(VALUE, length + offsetValue, value.length);

        final short[] ret = new short[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (short) (in[i + offsetIn] + value[i + offsetValue]);
        }

        return ret;
    }

    public static short[] add(final short[] in, final int offset, final short value, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        final short[] ret = new short[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (short) (in[i + offset] + value);
        }

        return ret;
    }

    public static short[] addInPlace(final short[] in, final short value) {
        return addInPlace(in, 0, value, in.length);
    }

    public static short[] addInPlace(final short[] in, final short[] value) {
        return addInPlace(in, 0, value, 0, in.length);
    }

    public static short[] addInPlace(final short[] in, final int offsetIn, final short[] value, final int offsetValue, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(VALUE, value);
        AssertUtils.gtOrEqual(VALUE, length + offsetValue, value.length);

        for (int i = 0; i < length; i++) {
            in[i + offsetIn] += value[i + offsetValue];
        }
        return in;
    }

    public static short[] addInPlace(final short[] in, final int offset, final short value, final int length) {
        AssertUtils.notNull(IN, in);

        for (int i = offset; i < length + offset; i++) {
            in[i] += value;
        }
        return in;
    }
    // end: short

    //// end codegen

    //// codegen: double -> float
    public static double[] decibel(final double[] in) {
        return decibel(in, 0, in.length);
    }

    public static double[] decibel(final double[] in, final int offset, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        final double[] ret = new double[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (20 * MathBase.log10(in[i + offset])); //// codegen: returncast all
        }

        return ret;
    }

    public static double[] decibelInPlace(final double[] in) {
        return decibelInPlace(in, 0, in.length);
    }

    public static double[] decibelInPlace(final double[] in, final int offset, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length, in.length);

        for (int i = offset; i < length + offset; i++) {
            in[i] = (20 * MathBase.log10(in[i])); //// codegen: returncast all
        }
        return in;
    }
    // start: float
    public static float[] decibel(final float[] in) {
        return decibel(in, 0, in.length);
    }

    public static float[] decibel(final float[] in, final int offset, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        final float[] ret = new float[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (float) (20 * MathBase.log10(in[i + offset])); //// codegen: returncast all
        }

        return ret;
    }

    public static float[] decibelInPlace(final float[] in) {
        return decibelInPlace(in, 0, in.length);
    }

    public static float[] decibelInPlace(final float[] in, final int offset, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length, in.length);

        for (int i = offset; i < length + offset; i++) {
            in[i] = (float) (20 * MathBase.log10(in[i])); //// codegen: returncast all
        }
        return in;
    }
    // end: float

    //// end codegen

    //// codegen: double -> float
    public static double[] divide(final double[] in, final double divisor) {
        return divide(in, 0, divisor, in.length);
    }

    public static double[] divide(final double[] in, final double[] divisor) {
        return divide(in, 0, divisor, 0, in.length);
    }

    public static double[] divide(final double[] in, final int offsetIn, final double[] divisor, final int offsetDiv, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(DIVISOR, divisor);
        AssertUtils.gtOrEqual(DIVISOR, length + offsetDiv, divisor.length);

        final double[] ret = new double[in.length];

        for (int i = 0; i < in.length; i++) {
            if (divisor[i + offsetDiv] == 0.0) {
                ret[i] = Double.NaN;
            } else {
                ret[i] = in[i + offsetIn] / divisor[i + offsetDiv];
            }
        }

        return ret;
    }

    public static double[] divide(final double[] in, final int offset, final double divisor, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        final double[] ret = new double[length];
        if (divisor == 0.0) {
            return notANumberInPlace(ret);
        }
        final double invDivisor = 1.0 / divisor; //// codegen: subst:float:1.0:1.0f
        for (int i = 0; i < length; i++) {
            ret[i] = in[i + offset] * invDivisor;
        }
        return ret;
    }

    public static double[] divideInPlace(final double[] in, final double divisor) {
        return divideInPlace(in, 0, divisor, in.length);
    }

    public static double[] divideInPlace(final double[] in, final double[] divisor) {
        return divideInPlace(in, 0, divisor, 0, in.length);
    }

    public static double[] divideInPlace(final double[] in, final int offsetIn, final double[] divisor, final int offsetDiv, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(DIVISOR, divisor);
        AssertUtils.gtOrEqual(DIVISOR, length + offsetDiv, divisor.length);

        for (int i = 0; i < length; i++) {
            if (divisor[i + offsetIn] == 0.0) {
                in[i] = Double.NaN;
            } else {
                in[i + offsetIn] /= divisor[i + offsetDiv];
            }
        }
        return in;
    }

    public static double[] divideInPlace(final double[] in, final int offset, final double divisor, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        if (divisor == 0.0) {
            return ArrayMath.notANumberInPlace(in);
        }
        final double invDivisor = 1.0 / divisor; //// codegen: subst:float:1.0:1.0f //// subst:int,long,short:final:// final
        for (int i = offset; i < length + offset; i++) {
            in[i] *= invDivisor; //// subst:int,long,short:*= invDivisor:/= divisor
        }
        return in;
    }
    // start: float
    public static float[] divide(final float[] in, final float divisor) {
        return divide(in, 0, divisor, in.length);
    }

    public static float[] divide(final float[] in, final float[] divisor) {
        return divide(in, 0, divisor, 0, in.length);
    }

    public static float[] divide(final float[] in, final int offsetIn, final float[] divisor, final int offsetDiv, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(DIVISOR, divisor);
        AssertUtils.gtOrEqual(DIVISOR, length + offsetDiv, divisor.length);

        final float[] ret = new float[in.length];

        for (int i = 0; i < in.length; i++) {
            if (divisor[i + offsetDiv] == 0.0) {
                ret[i] = Float.NaN;
            } else {
                ret[i] = in[i + offsetIn] / divisor[i + offsetDiv];
            }
        }

        return ret;
    }

    public static float[] divide(final float[] in, final int offset, final float divisor, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        final float[] ret = new float[length];
        if (divisor == 0.0) {
            return notANumberInPlace(ret);
        }
        final float invDivisor = 1.0f / divisor; //// codegen: subst:float:1.0f:1.0ff
        for (int i = 0; i < length; i++) {
            ret[i] = in[i + offset] * invDivisor;
        }
        return ret;
    }

    public static float[] divideInPlace(final float[] in, final float divisor) {
        return divideInPlace(in, 0, divisor, in.length);
    }

    public static float[] divideInPlace(final float[] in, final float[] divisor) {
        return divideInPlace(in, 0, divisor, 0, in.length);
    }

    public static float[] divideInPlace(final float[] in, final int offsetIn, final float[] divisor, final int offsetDiv, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(DIVISOR, divisor);
        AssertUtils.gtOrEqual(DIVISOR, length + offsetDiv, divisor.length);

        for (int i = 0; i < length; i++) {
            if (divisor[i + offsetIn] == 0.0) {
                in[i] = Float.NaN;
            } else {
                in[i + offsetIn] /= divisor[i + offsetDiv];
            }
        }
        return in;
    }

    public static float[] divideInPlace(final float[] in, final int offset, final float divisor, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        if (divisor == 0.0) {
            return ArrayMath.notANumberInPlace(in);
        }
        final float invDivisor = 1.0f / divisor; //// codegen: subst:float:1.0f:1.0ff //// subst:int,long,short:final:// final
        for (int i = offset; i < length + offset; i++) {
            in[i] *= invDivisor; //// subst:int,long,short:*= invDivisor:/= divisor
        }
        return in;
    }
    // end: float

    //// end codegen
    //// codegen: long -> int, short
    public static long[] divide(final long[] in, final long divisor) {
        return divide(in, 0, divisor, in.length);
    }

    public static long[] divide(final long[] in, final long[] divisor) {
        return divide(in, 0, divisor, 0, in.length);
    }

    public static long[] divide(final long[] in, final int offsetIn, final long[] divisor, final int offsetDiv, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(DIVISOR, divisor);
        AssertUtils.gtOrEqual(DIVISOR, length + offsetDiv, divisor.length);

        final long[] ret = new long[in.length];

        for (int i = 0; i < in.length; i++) {
            if (divisor[i + offsetDiv] == 0.0) {
                throw new ArithmeticException("Division by zero");
            } else {
                ret[i + offsetIn] = (in[i + offsetIn] / divisor[i + offsetDiv]); //// codegen: returncast short
            }
        }

        return ret;
    }

    public static long[] divide(final long[] in, final int offset, final long divisor, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        final long[] ret = new long[length];
        if (divisor == 0.0) {
            throw new ArithmeticException("Division by zero");
        }
        for (int i = 0; i < length; i++) {
            ret[i + offset] = (in[i + offset] / divisor); //// codegen: returncast short
        }
        return ret;
    }

    public static long[] divideInPlace(final long[] in, final long divisor) {
        return divideInPlace(in, 0, divisor, in.length);
    }

    public static long[] divideInPlace(final long[] in, final long[] divisor) {
        return divideInPlace(in, 0, divisor, 0, in.length);
    }

    public static long[] divideInPlace(final long[] in, final int offsetIn, final long[] divisor, final int offsetDiv, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(DIVISOR, divisor);
        AssertUtils.gtOrEqual(DIVISOR, length + offsetDiv, divisor.length);

        for (int i = 0; i < length; i++) {
            if (divisor[i + offsetDiv] == 0.0) {
                throw new ArithmeticException("Division by zero");
            } else {
                in[i + offsetIn] /= divisor[i + offsetDiv];
            }
        }
        return in;
    }

    public static long[] divideInPlace(final long[] in, final int offset, final long divisor, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length, in.length);

        if (divisor == 0.0) {
            throw new ArithmeticException("Division by zero");
        }
        for (int i = offset; i < length + offset; i++) {
            in[i] /= divisor;
        }
        return in;
    }
    // start: int
    public static int[] divide(final int[] in, final int divisor) {
        return divide(in, 0, divisor, in.length);
    }

    public static int[] divide(final int[] in, final int[] divisor) {
        return divide(in, 0, divisor, 0, in.length);
    }

    public static int[] divide(final int[] in, final int offsetIn, final int[] divisor, final int offsetDiv, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(DIVISOR, divisor);
        AssertUtils.gtOrEqual(DIVISOR, length + offsetDiv, divisor.length);

        final int[] ret = new int[in.length];

        for (int i = 0; i < in.length; i++) {
            if (divisor[i + offsetDiv] == 0.0) {
                throw new ArithmeticException("Division by zero");
            } else {
                ret[i + offsetIn] = (in[i + offsetIn] / divisor[i + offsetDiv]); //// codegen: returncast short
            }
        }

        return ret;
    }

    public static int[] divide(final int[] in, final int offset, final int divisor, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        final int[] ret = new int[length];
        if (divisor == 0.0) {
            throw new ArithmeticException("Division by zero");
        }
        for (int i = 0; i < length; i++) {
            ret[i + offset] = (in[i + offset] / divisor); //// codegen: returncast short
        }
        return ret;
    }

    public static int[] divideInPlace(final int[] in, final int divisor) {
        return divideInPlace(in, 0, divisor, in.length);
    }

    public static int[] divideInPlace(final int[] in, final int[] divisor) {
        return divideInPlace(in, 0, divisor, 0, in.length);
    }

    public static int[] divideInPlace(final int[] in, final int offsetIn, final int[] divisor, final int offsetDiv, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(DIVISOR, divisor);
        AssertUtils.gtOrEqual(DIVISOR, length + offsetDiv, divisor.length);

        for (int i = 0; i < length; i++) {
            if (divisor[i + offsetDiv] == 0.0) {
                throw new ArithmeticException("Division by zero");
            } else {
                in[i + offsetIn] /= divisor[i + offsetDiv];
            }
        }
        return in;
    }

    public static int[] divideInPlace(final int[] in, final int offset, final int divisor, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length, in.length);

        if (divisor == 0.0) {
            throw new ArithmeticException("Division by zero");
        }
        for (int i = offset; i < length + offset; i++) {
            in[i] /= divisor;
        }
        return in;
    }
    // end: int

    // start: short
    public static short[] divide(final short[] in, final short divisor) {
        return divide(in, 0, divisor, in.length);
    }

    public static short[] divide(final short[] in, final short[] divisor) {
        return divide(in, 0, divisor, 0, in.length);
    }

    public static short[] divide(final short[] in, final int offsetIn, final short[] divisor, final int offsetDiv, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(DIVISOR, divisor);
        AssertUtils.gtOrEqual(DIVISOR, length + offsetDiv, divisor.length);

        final short[] ret = new short[in.length];

        for (int i = 0; i < in.length; i++) {
            if (divisor[i + offsetDiv] == 0.0) {
                throw new ArithmeticException("Division by zero");
            } else {
                ret[i + offsetIn] = (short) (in[i + offsetIn] / divisor[i + offsetDiv]); //// codegen: returncast short
            }
        }

        return ret;
    }

    public static short[] divide(final short[] in, final int offset, final short divisor, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        final short[] ret = new short[length];
        if (divisor == 0.0) {
            throw new ArithmeticException("Division by zero");
        }
        for (int i = 0; i < length; i++) {
            ret[i + offset] = (short) (in[i + offset] / divisor); //// codegen: returncast short
        }
        return ret;
    }

    public static short[] divideInPlace(final short[] in, final short divisor) {
        return divideInPlace(in, 0, divisor, in.length);
    }

    public static short[] divideInPlace(final short[] in, final short[] divisor) {
        return divideInPlace(in, 0, divisor, 0, in.length);
    }

    public static short[] divideInPlace(final short[] in, final int offsetIn, final short[] divisor, final int offsetDiv, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(DIVISOR, divisor);
        AssertUtils.gtOrEqual(DIVISOR, length + offsetDiv, divisor.length);

        for (int i = 0; i < length; i++) {
            if (divisor[i + offsetDiv] == 0.0) {
                throw new ArithmeticException("Division by zero");
            } else {
                in[i + offsetIn] /= divisor[i + offsetDiv];
            }
        }
        return in;
    }

    public static short[] divideInPlace(final short[] in, final int offset, final short divisor, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length, in.length);

        if (divisor == 0.0) {
            throw new ArithmeticException("Division by zero");
        }
        for (int i = offset; i < length + offset; i++) {
            in[i] /= divisor;
        }
        return in;
    }
    // end: short

    //// end codegen

    //// codegen: double -> float
    public static double[] inverseDecibel(final double[] in) {
        return inverseDecibel(in, 0, in.length);
    }

    public static double[] inverseDecibel(final double[] in, final int offset, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        final double[] ret = new double[length];

        for (int i = 0; i < length; i++) {
            ret[i + offset] = Math.pow(10, in[i] / 20); //// codegen: returncast all
        }

        return ret;
    }

    public static double[] inverseDecibelInPlace(final double[] in) {
        return inverseDecibelInPlace(in, 0, in.length);
    }

    public static double[] inverseDecibelInPlace(final double[] in, final int offset, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        for (int i = offset; i < length + offset; i++) {
            in[i] = Math.pow(10, in[i] / 20); //// codegen: returncast all
        }
        return in;
    }
    // start: float
    public static float[] inverseDecibel(final float[] in) {
        return inverseDecibel(in, 0, in.length);
    }

    public static float[] inverseDecibel(final float[] in, final int offset, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        final float[] ret = new float[length];

        for (int i = 0; i < length; i++) {
            ret[i + offset] = (float) Math.pow(10, in[i] / 20); //// codegen: returncast all
        }

        return ret;
    }

    public static float[] inverseDecibelInPlace(final float[] in) {
        return inverseDecibelInPlace(in, 0, in.length);
    }

    public static float[] inverseDecibelInPlace(final float[] in, final int offset, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        for (int i = offset; i < length + offset; i++) {
            in[i] = (float) Math.pow(10, in[i] / 20); //// codegen: returncast all
        }
        return in;
    }
    // end: float

    //// end codegen

    //// codegen: double -> float, int, long, short
    public static double[] multiply(final double[] in, final double multiplicator) {
        return multiply(in, 0, multiplicator, in.length);
    }

    public static double[] multiply(final double[] in, final double[] multiplicator) {
        return multiply(in, 0, multiplicator, 0, in.length);
    }

    public static double[] multiply(final double[] in, final int offsetIn, final double[] multiplicator, final int offsetMul, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(MULTIPLICATOR, multiplicator);
        AssertUtils.gtOrEqual(MULTIPLICATOR, length + offsetMul, multiplicator.length);

        final double[] ret = new double[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (in[i + offsetIn] * multiplicator[i + offsetMul]); //// codegen: returncast short
        }

        return ret;
    }

    public static double[] multiply(final double[] in, final int offset, final double multiplicator, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        final double[] ret = new double[length];
        for (int i = 0; i < length; i++) {
            ret[i] = (in[i + offset] * multiplicator); //// codegen: returncast short
        }

        return ret;
    }

    public static double[] multiplyInPlace(final double[] in, final double multiplicator) {
        return multiplyInPlace(in, 0, multiplicator, in.length);
    }

    public static double[] multiplyInPlace(final double[] in, final double[] multiplicator) {
        return multiplyInPlace(in, 0, multiplicator, 0, in.length);
    }

    public static double[] multiplyInPlace(final double[] in, final int offsetIn, final double[] multiplicator, final int offsetMul, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(MULTIPLICATOR, multiplicator);
        AssertUtils.gtOrEqual(MULTIPLICATOR, length + offsetMul, multiplicator.length);

        for (int i = 0; i < length; i++) {
            in[i + offsetIn] *= multiplicator[i + offsetMul];
        }
        return in;
    }

    public static double[] multiplyInPlace(final double[] in, final int offset, final double multiplicator, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        for (int i = offset; i < length + offset; i++) {
            in[i] *= multiplicator;
        }
        return in;
    }
    // start: float
    public static float[] multiply(final float[] in, final float multiplicator) {
        return multiply(in, 0, multiplicator, in.length);
    }

    public static float[] multiply(final float[] in, final float[] multiplicator) {
        return multiply(in, 0, multiplicator, 0, in.length);
    }

    public static float[] multiply(final float[] in, final int offsetIn, final float[] multiplicator, final int offsetMul, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(MULTIPLICATOR, multiplicator);
        AssertUtils.gtOrEqual(MULTIPLICATOR, length + offsetMul, multiplicator.length);

        final float[] ret = new float[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (in[i + offsetIn] * multiplicator[i + offsetMul]); //// codegen: returncast short
        }

        return ret;
    }

    public static float[] multiply(final float[] in, final int offset, final float multiplicator, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        final float[] ret = new float[length];
        for (int i = 0; i < length; i++) {
            ret[i] = (in[i + offset] * multiplicator); //// codegen: returncast short
        }

        return ret;
    }

    public static float[] multiplyInPlace(final float[] in, final float multiplicator) {
        return multiplyInPlace(in, 0, multiplicator, in.length);
    }

    public static float[] multiplyInPlace(final float[] in, final float[] multiplicator) {
        return multiplyInPlace(in, 0, multiplicator, 0, in.length);
    }

    public static float[] multiplyInPlace(final float[] in, final int offsetIn, final float[] multiplicator, final int offsetMul, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(MULTIPLICATOR, multiplicator);
        AssertUtils.gtOrEqual(MULTIPLICATOR, length + offsetMul, multiplicator.length);

        for (int i = 0; i < length; i++) {
            in[i + offsetIn] *= multiplicator[i + offsetMul];
        }
        return in;
    }

    public static float[] multiplyInPlace(final float[] in, final int offset, final float multiplicator, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        for (int i = offset; i < length + offset; i++) {
            in[i] *= multiplicator;
        }
        return in;
    }
    // end: float

    // start: int
    public static int[] multiply(final int[] in, final int multiplicator) {
        return multiply(in, 0, multiplicator, in.length);
    }

    public static int[] multiply(final int[] in, final int[] multiplicator) {
        return multiply(in, 0, multiplicator, 0, in.length);
    }

    public static int[] multiply(final int[] in, final int offsetIn, final int[] multiplicator, final int offsetMul, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(MULTIPLICATOR, multiplicator);
        AssertUtils.gtOrEqual(MULTIPLICATOR, length + offsetMul, multiplicator.length);

        final int[] ret = new int[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (in[i + offsetIn] * multiplicator[i + offsetMul]); //// codegen: returncast short
        }

        return ret;
    }

    public static int[] multiply(final int[] in, final int offset, final int multiplicator, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        final int[] ret = new int[length];
        for (int i = 0; i < length; i++) {
            ret[i] = (in[i + offset] * multiplicator); //// codegen: returncast short
        }

        return ret;
    }

    public static int[] multiplyInPlace(final int[] in, final int multiplicator) {
        return multiplyInPlace(in, 0, multiplicator, in.length);
    }

    public static int[] multiplyInPlace(final int[] in, final int[] multiplicator) {
        return multiplyInPlace(in, 0, multiplicator, 0, in.length);
    }

    public static int[] multiplyInPlace(final int[] in, final int offsetIn, final int[] multiplicator, final int offsetMul, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(MULTIPLICATOR, multiplicator);
        AssertUtils.gtOrEqual(MULTIPLICATOR, length + offsetMul, multiplicator.length);

        for (int i = 0; i < length; i++) {
            in[i + offsetIn] *= multiplicator[i + offsetMul];
        }
        return in;
    }

    public static int[] multiplyInPlace(final int[] in, final int offset, final int multiplicator, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        for (int i = offset; i < length + offset; i++) {
            in[i] *= multiplicator;
        }
        return in;
    }
    // end: int

    // start: long
    public static long[] multiply(final long[] in, final long multiplicator) {
        return multiply(in, 0, multiplicator, in.length);
    }

    public static long[] multiply(final long[] in, final long[] multiplicator) {
        return multiply(in, 0, multiplicator, 0, in.length);
    }

    public static long[] multiply(final long[] in, final int offsetIn, final long[] multiplicator, final int offsetMul, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(MULTIPLICATOR, multiplicator);
        AssertUtils.gtOrEqual(MULTIPLICATOR, length + offsetMul, multiplicator.length);

        final long[] ret = new long[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (in[i + offsetIn] * multiplicator[i + offsetMul]); //// codegen: returncast short
        }

        return ret;
    }

    public static long[] multiply(final long[] in, final int offset, final long multiplicator, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        final long[] ret = new long[length];
        for (int i = 0; i < length; i++) {
            ret[i] = (in[i + offset] * multiplicator); //// codegen: returncast short
        }

        return ret;
    }

    public static long[] multiplyInPlace(final long[] in, final long multiplicator) {
        return multiplyInPlace(in, 0, multiplicator, in.length);
    }

    public static long[] multiplyInPlace(final long[] in, final long[] multiplicator) {
        return multiplyInPlace(in, 0, multiplicator, 0, in.length);
    }

    public static long[] multiplyInPlace(final long[] in, final int offsetIn, final long[] multiplicator, final int offsetMul, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(MULTIPLICATOR, multiplicator);
        AssertUtils.gtOrEqual(MULTIPLICATOR, length + offsetMul, multiplicator.length);

        for (int i = 0; i < length; i++) {
            in[i + offsetIn] *= multiplicator[i + offsetMul];
        }
        return in;
    }

    public static long[] multiplyInPlace(final long[] in, final int offset, final long multiplicator, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        for (int i = offset; i < length + offset; i++) {
            in[i] *= multiplicator;
        }
        return in;
    }
    // end: long

    // start: short
    public static short[] multiply(final short[] in, final short multiplicator) {
        return multiply(in, 0, multiplicator, in.length);
    }

    public static short[] multiply(final short[] in, final short[] multiplicator) {
        return multiply(in, 0, multiplicator, 0, in.length);
    }

    public static short[] multiply(final short[] in, final int offsetIn, final short[] multiplicator, final int offsetMul, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(MULTIPLICATOR, multiplicator);
        AssertUtils.gtOrEqual(MULTIPLICATOR, length + offsetMul, multiplicator.length);

        final short[] ret = new short[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (short) (in[i + offsetIn] * multiplicator[i + offsetMul]); //// codegen: returncast short
        }

        return ret;
    }

    public static short[] multiply(final short[] in, final int offset, final short multiplicator, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        final short[] ret = new short[length];
        for (int i = 0; i < length; i++) {
            ret[i] = (short) (in[i + offset] * multiplicator); //// codegen: returncast short
        }

        return ret;
    }

    public static short[] multiplyInPlace(final short[] in, final short multiplicator) {
        return multiplyInPlace(in, 0, multiplicator, in.length);
    }

    public static short[] multiplyInPlace(final short[] in, final short[] multiplicator) {
        return multiplyInPlace(in, 0, multiplicator, 0, in.length);
    }

    public static short[] multiplyInPlace(final short[] in, final int offsetIn, final short[] multiplicator, final int offsetMul, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(MULTIPLICATOR, multiplicator);
        AssertUtils.gtOrEqual(MULTIPLICATOR, length + offsetMul, multiplicator.length);

        for (int i = 0; i < length; i++) {
            in[i + offsetIn] *= multiplicator[i + offsetMul];
        }
        return in;
    }

    public static short[] multiplyInPlace(final short[] in, final int offset, final short multiplicator, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        for (int i = offset; i < length + offset; i++) {
            in[i] *= multiplicator;
        }
        return in;
    }
    // end: short

    //// end codegen

    //// codegen: double -> float
    public static double[] notANumber(final int length) { //// codegen: subst:float:notANumber:notANumberFloat
        final double[] ret = new double[length];
        ArrayUtils.fillArray(ret, 0, length, Double.NaN);

        return ret;
    }

    public static double[] notANumberInPlace(final double[] in) {
        return notANumberInPlace(in, 0, in.length);
    }

    public static double[] notANumberInPlace(final double[] in, final int offset, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        ArrayUtils.fillArray(in, offset, offset + length, Double.NaN);
        return in;
    }
    // start: float
    public static float[] notANumberFloat(final int length) { //// codegen: subst:float:notANumberFloat:notANumberFloatFloat
        final float[] ret = new float[length];
        ArrayUtils.fillArray(ret, 0, length, Float.NaN);

        return ret;
    }

    public static float[] notANumberInPlace(final float[] in) {
        return notANumberInPlace(in, 0, in.length);
    }

    public static float[] notANumberInPlace(final float[] in, final int offset, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        ArrayUtils.fillArray(in, offset, offset + length, Float.NaN);
        return in;
    }
    // end: float

    //// end codegen

    //// codegen: double -> float, int, long, short
    public static double[] sqr(final double[] in) {
        return sqr(in, 0, in.length);
    }

    public static double[] sqr(final double[] in, final int offset, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        final double[] ret = new double[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (in[i + offset] * in[i + offset]); //// codegen: returncast short
        }

        return ret;
    }

    public static double[] sqrInPlace(final double[] in) {
        return sqrInPlace(in, 0, in.length);
    }

    public static double[] sqrInPlace(final double[] in, final int offset, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        for (int i = offset; i < length + offset; i++) {
            in[i] = (in[i] * in[i]); //// codegen: returncast short
        }
        return in;
    }
    // start: float
    public static float[] sqr(final float[] in) {
        return sqr(in, 0, in.length);
    }

    public static float[] sqr(final float[] in, final int offset, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        final float[] ret = new float[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (in[i + offset] * in[i + offset]); //// codegen: returncast short
        }

        return ret;
    }

    public static float[] sqrInPlace(final float[] in) {
        return sqrInPlace(in, 0, in.length);
    }

    public static float[] sqrInPlace(final float[] in, final int offset, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        for (int i = offset; i < length + offset; i++) {
            in[i] = (in[i] * in[i]); //// codegen: returncast short
        }
        return in;
    }
    // end: float

    // start: int
    public static int[] sqr(final int[] in) {
        return sqr(in, 0, in.length);
    }

    public static int[] sqr(final int[] in, final int offset, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        final int[] ret = new int[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (in[i + offset] * in[i + offset]); //// codegen: returncast short
        }

        return ret;
    }

    public static int[] sqrInPlace(final int[] in) {
        return sqrInPlace(in, 0, in.length);
    }

    public static int[] sqrInPlace(final int[] in, final int offset, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        for (int i = offset; i < length + offset; i++) {
            in[i] = (in[i] * in[i]); //// codegen: returncast short
        }
        return in;
    }
    // end: int

    // start: long
    public static long[] sqr(final long[] in) {
        return sqr(in, 0, in.length);
    }

    public static long[] sqr(final long[] in, final int offset, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        final long[] ret = new long[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (in[i + offset] * in[i + offset]); //// codegen: returncast short
        }

        return ret;
    }

    public static long[] sqrInPlace(final long[] in) {
        return sqrInPlace(in, 0, in.length);
    }

    public static long[] sqrInPlace(final long[] in, final int offset, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        for (int i = offset; i < length + offset; i++) {
            in[i] = (in[i] * in[i]); //// codegen: returncast short
        }
        return in;
    }
    // end: long

    // start: short
    public static short[] sqr(final short[] in) {
        return sqr(in, 0, in.length);
    }

    public static short[] sqr(final short[] in, final int offset, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        final short[] ret = new short[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (short) (in[i + offset] * in[i + offset]); //// codegen: returncast short
        }

        return ret;
    }

    public static short[] sqrInPlace(final short[] in) {
        return sqrInPlace(in, 0, in.length);
    }

    public static short[] sqrInPlace(final short[] in, final int offset, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        for (int i = offset; i < length + offset; i++) {
            in[i] = (short) (in[i] * in[i]); //// codegen: returncast short
        }
        return in;
    }
    // end: short

    //// end codegen

    //// codegen: double -> float
    public static double[] sqrt(final double[] in) {
        return sqrt(in, 0, in.length);
    }

    public static double[] sqrt(final double[] in, final int offset, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        final double[] ret = new double[length];

        for (int i = 0; i < length; i++) {
            ret[i] = MathBase.sqrt(in[i + offset]); //// codegen: returncast all
        }

        return ret;
    }

    public static double[] sqrtInPlace(final double[] in) {
        return sqrtInPlace(in, 0, in.length);
    }

    public static double[] sqrtInPlace(final double[] in, final int offset, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);
        for (int i = offset; i < length + offset; i++) {
            in[i] = MathBase.sqrt(in[i]); //// codegen: returncast all
        }
        return in;
    }
    // start: float
    public static float[] sqrt(final float[] in) {
        return sqrt(in, 0, in.length);
    }

    public static float[] sqrt(final float[] in, final int offset, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        final float[] ret = new float[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (float) MathBase.sqrt(in[i + offset]); //// codegen: returncast all
        }

        return ret;
    }

    public static float[] sqrtInPlace(final float[] in) {
        return sqrtInPlace(in, 0, in.length);
    }

    public static float[] sqrtInPlace(final float[] in, final int offset, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);
        for (int i = offset; i < length + offset; i++) {
            in[i] = (float) MathBase.sqrt(in[i]); //// codegen: returncast all
        }
        return in;
    }
    // end: float

    //// end codegen

    //// codegen: double -> float, int, long, short
    public static double[] subtract(final double[] in, final double value) {
        return subtract(in, 0, value, in.length);
    }

    public static double[] subtract(final double[] in, final double[] value) {
        return subtract(in, 0, value, 0, in.length);
    }

    public static double[] subtract(final double[] in, final int offsetIn, final double[] value, final int offsetValue, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(VALUE, value);
        AssertUtils.gtOrEqual(VALUE, length + offsetValue, value.length);

        final double[] ret = new double[length];

        for (int i = 0; i < in.length; i++) {
            ret[i] = (in[i + offsetIn] - value[i + offsetValue]); //// codegen: returncast short
        }

        return ret;
    }

    public static double[] subtract(final double[] in, final int offset, final double value, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);
        final double[] ret = new double[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (in[i + offset] - value); //// codegen: returncast short
        }

        return ret;
    }

    public static double[] subtractInPlace(final double[] in, final double value) {
        return subtractInPlace(in, 0, value, in.length);
    }

    public static double[] subtractInPlace(final double[] in, final double[] value) {
        return subtractInPlace(in, 0, value, 0, in.length);
    }

    public static double[] subtractInPlace(final double[] in, final int offsetIn, final double[] value, final int offsetVal, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(VALUE, value);
        AssertUtils.gtOrEqual(VALUE, length + offsetVal, value.length);

        for (int i = 0; i < length; i++) {
            in[i + offsetIn] -= value[i + offsetVal];
        }
        return in;
    }

    public static double[] subtractInPlace(final double[] in, final int offset, final double value, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        for (int i = offset; i < length + offset; i++) {
            in[i] -= value;
        }
        return in;
    }
    // start: float
    public static float[] subtract(final float[] in, final float value) {
        return subtract(in, 0, value, in.length);
    }

    public static float[] subtract(final float[] in, final float[] value) {
        return subtract(in, 0, value, 0, in.length);
    }

    public static float[] subtract(final float[] in, final int offsetIn, final float[] value, final int offsetValue, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(VALUE, value);
        AssertUtils.gtOrEqual(VALUE, length + offsetValue, value.length);

        final float[] ret = new float[length];

        for (int i = 0; i < in.length; i++) {
            ret[i] = (in[i + offsetIn] - value[i + offsetValue]); //// codegen: returncast short
        }

        return ret;
    }

    public static float[] subtract(final float[] in, final int offset, final float value, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);
        final float[] ret = new float[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (in[i + offset] - value); //// codegen: returncast short
        }

        return ret;
    }

    public static float[] subtractInPlace(final float[] in, final float value) {
        return subtractInPlace(in, 0, value, in.length);
    }

    public static float[] subtractInPlace(final float[] in, final float[] value) {
        return subtractInPlace(in, 0, value, 0, in.length);
    }

    public static float[] subtractInPlace(final float[] in, final int offsetIn, final float[] value, final int offsetVal, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(VALUE, value);
        AssertUtils.gtOrEqual(VALUE, length + offsetVal, value.length);

        for (int i = 0; i < length; i++) {
            in[i + offsetIn] -= value[i + offsetVal];
        }
        return in;
    }

    public static float[] subtractInPlace(final float[] in, final int offset, final float value, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        for (int i = offset; i < length + offset; i++) {
            in[i] -= value;
        }
        return in;
    }
    // end: float

    // start: int
    public static int[] subtract(final int[] in, final int value) {
        return subtract(in, 0, value, in.length);
    }

    public static int[] subtract(final int[] in, final int[] value) {
        return subtract(in, 0, value, 0, in.length);
    }

    public static int[] subtract(final int[] in, final int offsetIn, final int[] value, final int offsetValue, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(VALUE, value);
        AssertUtils.gtOrEqual(VALUE, length + offsetValue, value.length);

        final int[] ret = new int[length];

        for (int i = 0; i < in.length; i++) {
            ret[i] = (in[i + offsetIn] - value[i + offsetValue]); //// codegen: returncast short
        }

        return ret;
    }

    public static int[] subtract(final int[] in, final int offset, final int value, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);
        final int[] ret = new int[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (in[i + offset] - value); //// codegen: returncast short
        }

        return ret;
    }

    public static int[] subtractInPlace(final int[] in, final int value) {
        return subtractInPlace(in, 0, value, in.length);
    }

    public static int[] subtractInPlace(final int[] in, final int[] value) {
        return subtractInPlace(in, 0, value, 0, in.length);
    }

    public static int[] subtractInPlace(final int[] in, final int offsetIn, final int[] value, final int offsetVal, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(VALUE, value);
        AssertUtils.gtOrEqual(VALUE, length + offsetVal, value.length);

        for (int i = 0; i < length; i++) {
            in[i + offsetIn] -= value[i + offsetVal];
        }
        return in;
    }

    public static int[] subtractInPlace(final int[] in, final int offset, final int value, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        for (int i = offset; i < length + offset; i++) {
            in[i] -= value;
        }
        return in;
    }
    // end: int

    // start: long
    public static long[] subtract(final long[] in, final long value) {
        return subtract(in, 0, value, in.length);
    }

    public static long[] subtract(final long[] in, final long[] value) {
        return subtract(in, 0, value, 0, in.length);
    }

    public static long[] subtract(final long[] in, final int offsetIn, final long[] value, final int offsetValue, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(VALUE, value);
        AssertUtils.gtOrEqual(VALUE, length + offsetValue, value.length);

        final long[] ret = new long[length];

        for (int i = 0; i < in.length; i++) {
            ret[i] = (in[i + offsetIn] - value[i + offsetValue]); //// codegen: returncast short
        }

        return ret;
    }

    public static long[] subtract(final long[] in, final int offset, final long value, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);
        final long[] ret = new long[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (in[i + offset] - value); //// codegen: returncast short
        }

        return ret;
    }

    public static long[] subtractInPlace(final long[] in, final long value) {
        return subtractInPlace(in, 0, value, in.length);
    }

    public static long[] subtractInPlace(final long[] in, final long[] value) {
        return subtractInPlace(in, 0, value, 0, in.length);
    }

    public static long[] subtractInPlace(final long[] in, final int offsetIn, final long[] value, final int offsetVal, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(VALUE, value);
        AssertUtils.gtOrEqual(VALUE, length + offsetVal, value.length);

        for (int i = 0; i < length; i++) {
            in[i + offsetIn] -= value[i + offsetVal];
        }
        return in;
    }

    public static long[] subtractInPlace(final long[] in, final int offset, final long value, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        for (int i = offset; i < length + offset; i++) {
            in[i] -= value;
        }
        return in;
    }
    // end: long

    // start: short
    public static short[] subtract(final short[] in, final short value) {
        return subtract(in, 0, value, in.length);
    }

    public static short[] subtract(final short[] in, final short[] value) {
        return subtract(in, 0, value, 0, in.length);
    }

    public static short[] subtract(final short[] in, final int offsetIn, final short[] value, final int offsetValue, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(VALUE, value);
        AssertUtils.gtOrEqual(VALUE, length + offsetValue, value.length);

        final short[] ret = new short[length];

        for (int i = 0; i < in.length; i++) {
            ret[i] = (short) (in[i + offsetIn] - value[i + offsetValue]); //// codegen: returncast short
        }

        return ret;
    }

    public static short[] subtract(final short[] in, final int offset, final short value, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);
        final short[] ret = new short[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (short) (in[i + offset] - value); //// codegen: returncast short
        }

        return ret;
    }

    public static short[] subtractInPlace(final short[] in, final short value) {
        return subtractInPlace(in, 0, value, in.length);
    }

    public static short[] subtractInPlace(final short[] in, final short[] value) {
        return subtractInPlace(in, 0, value, 0, in.length);
    }

    public static short[] subtractInPlace(final short[] in, final int offsetIn, final short[] value, final int offsetVal, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offsetIn, in.length);
        AssertUtils.notNull(VALUE, value);
        AssertUtils.gtOrEqual(VALUE, length + offsetVal, value.length);

        for (int i = 0; i < length; i++) {
            in[i + offsetIn] -= value[i + offsetVal];
        }
        return in;
    }

    public static short[] subtractInPlace(final short[] in, final int offset, final short value, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        for (int i = offset; i < length + offset; i++) {
            in[i] -= value;
        }
        return in;
    }
    // end: short

    //// end codegen

    //// codegen: double -> float
    public static double[] tenLog10(final double[] in) {
        return tenLog10(in, 0, in.length);
    }

    public static double[] tenLog10(final double[] in, final int offset, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        final double[] ret = new double[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (10 * MathBase.log10(in[i + offset])); //// codegen: returncast float
        }

        return ret;
    }

    public static double[] tenLog10InPlace(final double[] in) {
        return tenLog10InPlace(in, 0, in.length);
    }

    public static double[] tenLog10InPlace(final double[] in, final int offset, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        for (int i = offset; i < length + offset; i++) {
            in[i] = (10 * MathBase.log10(in[i])); //// codegen: returncast float
        }
        return in;
    }
    // start: float
    public static float[] tenLog10(final float[] in) {
        return tenLog10(in, 0, in.length);
    }

    public static float[] tenLog10(final float[] in, final int offset, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        final float[] ret = new float[length];

        for (int i = 0; i < length; i++) {
            ret[i] = (float) (10 * MathBase.log10(in[i + offset])); //// codegen: returncast float
        }

        return ret;
    }

    public static float[] tenLog10InPlace(final float[] in) {
        return tenLog10InPlace(in, 0, in.length);
    }

    public static float[] tenLog10InPlace(final float[] in, final int offset, final int length) {
        AssertUtils.notNull(IN, in);
        AssertUtils.gtOrEqual(IN, length + offset, in.length);

        for (int i = offset; i < length + offset; i++) {
            in[i] = (float) (10 * MathBase.log10(in[i])); //// codegen: returncast float
        }
        return in;
    }
    // end: float

    //// end codegen
}
