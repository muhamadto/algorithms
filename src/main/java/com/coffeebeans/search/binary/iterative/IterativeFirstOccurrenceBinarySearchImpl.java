package com.coffeebeans.search.binary.iterative;

 class IterativeFirstOccurrenceBinarySearchImpl<T extends Comparable<T>> extends IterativeOccurrenceBinarySearch<T> {
    @Override
    public int search(T t, T[] values) {
        return searchIteratively(t, values, true);
    }
}