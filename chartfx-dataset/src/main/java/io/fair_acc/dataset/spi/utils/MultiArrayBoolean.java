// This file has been generated automatically by chartfx-generate. Do not modify!
// autogenerated code for boolean - boolean from double
//// codegen container: boolean -> boolean, float, char, short, int, long, boolean, byte, U
package io.fair_acc.dataset.spi.utils;

import java.util.Arrays;

import io.fair_acc.dataset.utils.AssertUtils;

/**
 * Implementation of MultiArray for boolean values. Also contains subtypes for 1D and 2D Arrays which allow more convenient and more efficient access.
 * <p>
 * The data is stored in row-major in a flat boolean array.
 * <p>
 *
 * @author Alexander Krimm
 */
public class MultiArrayBoolean extends MultiArray<boolean[]> { //// codegen: subst:U:Boolean:Boolean<U>
    /**
     * @param elements Elements for the new MultiArray
     * @return A MultiArrayBoolean1D with the supplied elements
     */
    public static MultiArrayBoolean wrap(final boolean[] elements) { //// codegen: subst:U:U[]:T[] //// subst:U:static:static <T>
        return wrap(elements, 0, elements.length);
    }

    /**
     * @param elements Elements for the new MultiArray
     * @param offset where in the backing array the element data starts
     * @param length number of elements to use from the elements array
     * @return A MultiArrayBoolean1D with the supplied elements
     */
    public static MultiArrayBoolean wrap(final boolean[] elements, final int offset, final int length) { //// codegen: subst:U:U[]:T[] //// subst:U:static:static <T>
        return new MultiArray1DBoolean(elements, new int[] { length }, offset);
    }

    /**
     * @param dimensions The size of the new MultiArrayBoolean
     * @param elements   The element data of the MultiArrayBoolean in row-major storage
     * @return A MultiArrayBoolean or specialisation of it for the 1D and 2D case
     */
    public static MultiArrayBoolean wrap(final boolean[] elements, final int[] dimensions) { //// codegen: subst:U:U[]:T[] //// subst:U:static:static <T>
        return wrap(elements, 0, dimensions);
    }

    /**
     * @param elements   The element data of the MultiArrayBoolean in row-major storage
     * @param offset where in the backing array the element data starts
     * @param dimensions The size of the new MultiArrayBoolean
     * @return A MultiArrayBoolean or specialisation of it for the 1D and 2D case
     */
    public static MultiArrayBoolean wrap(final boolean[] elements, final int offset, final int[] dimensions) { //// codegen: subst:U:U[]:T[] //// subst:U:static:static <T>
        int nElements = 1;
        for (int ni : dimensions) {
            nElements *= ni;
        }
        AssertUtils.gtOrEqual("Array size", nElements + offset, elements.length);
        switch (dimensions.length) {
        case 1:
            return new MultiArray1DBoolean(elements, dimensions, offset);
        case 2:
            return new MultiArray2DBoolean(elements, dimensions, offset);
        default:
            return new MultiArrayBoolean(elements, dimensions, offset);
        }
    }

    /**
     * @param dimensions Dimensions for the new MultiArray
     * @return A new MultiArrayBoolean with a new empty backing array
     */
    public static MultiArrayBoolean allocate(final int[] dimensions) { //// codegen: subst:U:) {:, final Class<T[]> clazz) { //// subst:U:static:static <T>
        switch (dimensions.length) {
        case 1:
            //*// try { //// codegen: subst:U://*// :
            //*//     return new MultiArray1DBoolean(clazz.getConstructor(int.class).newInstance(dimensions[0]), dimensions, 0); //// codegen: subst:U://*// :
            //*// } catch (InstantiationException | NoSuchMethodException | IllegalAccessException | java.lang.reflect.InvocationTargetException e) { //// codegen: subst:U://*// :
            //*//     throw new IllegalArgumentException("Could not allocate array for given type", e); //// codegen: subst:U://*// :
            //*// } //// codegen: subst:U://*// :
            return new MultiArray1DBoolean(new boolean[dimensions[0]], dimensions, 0); //// codegen: subst:U:return://*// return
        case 2:
            //*// try { //// codegen: subst:U://*// :
            //*//     return new MultiArray2DBoolean(clazz.getConstructor(int.class).newInstance(dimensions[0] * dimensions[1]), dimensions, 0); //// codegen: subst:U://*// :
            //*// } catch (InstantiationException | NoSuchMethodException | IllegalAccessException | java.lang.reflect.InvocationTargetException e) { //// codegen: subst:U://*// :
            //*//     throw new IllegalArgumentException("Could not allocate array for given type", e); //// codegen: subst:U://*// :
            //*// } //// codegen: subst:U://*// :
            //*// try {
            return new MultiArray2DBoolean(new boolean[dimensions[1] * dimensions[0]], dimensions, 0); //// codegen: subst:U:return://*// return
        default:
            int nElements = 1;
            for (int ni : dimensions) {
                nElements *= ni;
            }
            //*// try { //// codegen: subst:U://*// :
            //*//     return new MultiArrayBoolean(clazz.getConstructor(int.class).newInstance(nElements), dimensions, 0); //// codegen: subst:U://*// :
            //*// } catch (InstantiationException | NoSuchMethodException | IllegalAccessException | java.lang.reflect.InvocationTargetException e) { //// codegen: subst:U://*// :
            //*//     throw new IllegalArgumentException("Could not allocate array for given type", e); //// codegen: subst:U://*// :
            //*// } //// codegen: subst:U://*// :
            return new MultiArrayBoolean(new boolean[nElements], dimensions, 0); //// codegen: subst:U:return://*// return
        }
    }

    protected MultiArrayBoolean(final boolean[] elements, final int[] dimensions, final int offset) { //// codegen: subst:U:boolean[]:U[]
        super(elements, dimensions, offset);
    }

    /**
     * Set a value in the backing array using linear indexing.
     *
     * @param value the new value for the element
     * @param index the index of the element to set
     */
    public void setStrided(final int index, final boolean value) {
        elements[index + offset] = value; //// codegen: subst:U:boolean:U
    }

    /**
     * Set a value in the MultiArray for given indices
     *
     * @param value   The new value for the element
     * @param indices Indices for every dimension of the MultiArray
     */
    public void set(final int[] indices, final boolean value) {
        elements[getIndex(indices)] = value;
    }

    /**
     * Get a value in the backing array using linear indexing.
     *
     * @param index the index of the element to set
     * @return The element value
     */
    public boolean getStrided(final int index) {
        return elements[index + offset];
    }

    /**
     * Get a value in the MultiArray.
     *
     * @param indices the indices of the element to set
     * @return The element value
     */
    public boolean get(final int[] indices) {
        return elements[getIndex(indices)];
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (!(o instanceof MultiArrayBoolean)) //// codegen: subst:U:MultiArrayU:MultiArrayObject
            return false;
        final MultiArrayBoolean that = (MultiArrayBoolean) o; //// codegen: subst:U:MultiArrayU:MultiArrayObject<U>
        return Arrays.equals(dimensions, that.dimensions) && Arrays.equals(elements, offset, offset + getElementsCount(), that.elements, that.offset, that.offset + getElementsCount());
    }

    @Override
    public int hashCode() {
        // hash of relevant subsection of the array
        int result = 1;
        for (int i = offset; i < offset + getElementsCount(); i++) {
            result = 31 * result + Boolean.hashCode(elements[i]); //// codegen: subst:int:Int:Integer //// subst:char:Char:Character //// subst:U:U.hashCode(elements[i]):elements[i].hashCode()
        }
        // hash of the dimensions
        result = 31 * result + Arrays.hashCode(dimensions);
        return result;
    }

    /**
     * Specialisation for the 1D case to allow for easier and more efficient usage
     */
    public static class MultiArray1DBoolean extends MultiArrayBoolean { //// codegen: subst:U:Boolean:Boolean<U>
        protected MultiArray1DBoolean(final boolean[] elements, final int[] dimensions, final int offset) { //// codegen: subst:U:boolean[]:U[]
            super(elements, dimensions, offset);
        }

        public boolean get(final int index) {
            return getStrided(index);
        }

        public void set(final int index, final boolean value) {
            setStrided(index, value);
        }
    }

    /**
     * Specialisation for the 2D case to allow for easier and more efficient usage
     */
    public static class MultiArray2DBoolean extends MultiArrayBoolean { //// codegen: subst:U:Boolean:Boolean<U>
        private final int stride;

        protected MultiArray2DBoolean(final boolean[] elements, final int[] dimensions, final int offset) { //// codegen: subst:U:boolean[]:U[]
            super(elements, dimensions, offset);
            stride = dimensions[1];
        }

        /**
         *
         * @param row rowIndex
         * @param column columnIndex
         * @return value at M(rowIndex,columnIndex)
         */
        public boolean get(final int row, final int column) {
            return elements[offset + column + row * stride];
        }

        /**
         *
         * @param row rowIndex
         * @param column columnIndex
         * @param value new value: M(rowIndex,columnIndex) == value
         */
        public void set(final int row, final int column, final boolean value) {
            elements[offset + column + row * stride] = value;
        }

        public boolean[] getRow(final int row) {
            final int index = row * stride + offset;
            return Arrays.copyOfRange(elements, index, index + stride);
        }
    }
}
