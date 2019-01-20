package com.coffeebeans.search.binary.iterative;

import com.coffeebeans.search.binary.BinarySearch;

abstract class IterativeOccurrenceBinarySearch<T extends Comparable<T>>  implements BinarySearch<T> {
    protected int searchIteratively(final T t, final T[] values, final boolean firstOccurrence){
        if (values == null || t == null) {
            return -1;
        }

        int retval = -1;
        int start = 0;
        int end = values.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // ((start + end) / 2) may produce overflow exception, example start = (Integer.MAX_VALUE - 9) and end = Integer.MAX_VALUE
            if (t.compareTo(values[mid]) == 0) {
                retval =  mid;
                if(firstOccurrence){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            } else if (t.compareTo(values[mid]) > 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return retval;
    }
}
