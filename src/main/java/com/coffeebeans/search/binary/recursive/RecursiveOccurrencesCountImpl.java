package com.coffeebeans.search.binary.recursive;

import com.coffeebeans.search.binary.OccurrencesCount;

 class RecursiveOccurrencesCountImpl<T extends Comparable<T>> extends OccurrencesCount<T> {

     RecursiveOccurrencesCountImpl(){
        this.firstOccurrenceBinarySearch = new RecursiveFirstOccurrenceBinarySearchImpl();
        this.lastOccurrenceBinarySearch = new RecursiveLastOccurrenceBinarySearchImpl();
    }
}
