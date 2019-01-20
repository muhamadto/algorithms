package com.coffeebeans.search.binary.iterative;

import com.coffeebeans.search.binary.OccurrencesCount;

class IterativeOccurrencesCountImpl<T extends Comparable<T>> extends OccurrencesCount<T> {

    IterativeOccurrencesCountImpl() {
        this.firstOccurrenceBinarySearch = new IterativeFirstOccurrenceBinarySearchImpl<>();
        this.lastOccurrenceBinarySearch = new IterativeLastOccurrenceBinarySearchImpl<>();
    }

}
