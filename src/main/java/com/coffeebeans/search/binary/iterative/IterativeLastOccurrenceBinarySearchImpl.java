package com.coffeebeans.search.binary.iterative;

class IterativeLastOccurrenceBinarySearchImpl<T extends Comparable<T>> extends IterativeOccurrenceBinarySearch<T> {

    @Override
    public int search(T t, T[] values) {
        return searchIteratively(t, values, false);
    }
}