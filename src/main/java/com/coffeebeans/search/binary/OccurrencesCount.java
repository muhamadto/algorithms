package com.coffeebeans.search.binary;

public abstract class OccurrencesCount<T extends Comparable<T>> {
    protected BinarySearch<T> firstOccurrenceBinarySearch;
    protected BinarySearch<T> lastOccurrenceBinarySearch;

    public int count(T t, T[] values) {
        int firstOccurrence = this.firstOccurrenceBinarySearch.search(t, values);
        if(firstOccurrence == -1 ){
            // no occurrence so no need to calculate last occurrence
            return 0;
        }

        int lastOccurrence = this.lastOccurrenceBinarySearch.search(t, values);
        return lastOccurrence -  firstOccurrence + 1;
    }
}
