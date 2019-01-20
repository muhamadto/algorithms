package com.coffeebeans.search.binary;

public class RecursiveBinarySearchImpl<T extends Comparable<T>> implements BinarySearch<T> {

    @Override
    public int search(T t, T[] values) {
        if (values == null || t == null) {
            return -1;
        }

        return doSearch(t, values, 0, values.length - 1);
    }

    private int doSearch(final T t, final T[] values, final int start, final int end) {
        if (start > end) {
            return -1;
        }

        // Unsigned right shit, shifting to the right with zero.
        int mid = (start + end) >>> 1; // ((start + end) / 2) may produce overflow exception, example start = (Integer.MAX_VALUE - 9) and end = Integer.MAX_VALUE

        if (t.compareTo(values[mid]) == 0) {
            return mid;
        } else if (t.compareTo(values[mid]) > 0) {
            return doSearch(t, values, mid + 1, end);
        } else {
            return doSearch(t, values, start, mid - 1);
        }
    }
}
