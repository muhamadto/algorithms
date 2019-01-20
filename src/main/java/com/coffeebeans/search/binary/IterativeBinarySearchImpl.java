package com.coffeebeans.search.binary;

public class IterativeBinarySearchImpl<T extends Comparable<T>> implements BinarySearch<T> {

    @Override
    public long search(T t, T[] values) {
        if (values == null || t == null) {
            return -1;
        }

        int start = 0;
        int end = values.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // ((start + end) / 2) may produce overflow exception, example start = (Integer.MAX_VALUE - 9) and end = Integer.MAX_VALUE
            if (t.compareTo(values[mid]) == 0) {
                return mid;
            } else if (t.compareTo(values[mid]) > 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
