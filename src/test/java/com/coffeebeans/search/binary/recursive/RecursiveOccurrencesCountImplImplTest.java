package com.coffeebeans.search.binary.recursive;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecursiveOccurrencesCountImplImplTest {
    private RecursiveOccurrencesCountImpl recursiveOccurrencesCountImpl;

    @Before
    public void setup() {
        recursiveOccurrencesCountImpl = new RecursiveOccurrencesCountImpl();
    }

    @Test
    public void should_find_the_correct_count_when_object_exists_multiple_times_in_odd_size_search_space(){
        final Integer[] input = new Integer[]{1, 1, 3, 3, 5, 5, 5, 5, 5, 9, 9, 11, 12};
        assertEquals(5, recursiveOccurrencesCountImpl.count(5, input));
    }

    @Test
    public void should_find_the_correct_count_when_object_exists_multiple_times_on_right_side_in_odd_size_search_space(){
        final Integer[] input = new Integer[]{1, 1, 3, 3, 5, 5, 5, 5, 5, 9, 9, 11, 12};
        assertEquals(2, recursiveOccurrencesCountImpl.count(3, input));
    }

    @Test
    public void should_find_the_correct_count_when_object_exists_multiple_times_on_right_left_in_odd_size_search_space(){
        final Integer[] input = new Integer[]{1, 1, 3, 3, 5, 5, 5, 5, 5, 9, 9, 11, 12};
        assertEquals(2, recursiveOccurrencesCountImpl.count(9, input));
    }

    @Test
    public void should_find_the_correct_count_when_object_exists_only_once_on_right_size_in_odd_size_search_space(){
        final Integer[] input = new Integer[]{1, 2, 3, 3, 5, 5, 5, 5, 5, 9, 9, 11, 12};
        assertEquals(1, recursiveOccurrencesCountImpl.count(1, input));
    }

    @Test
    public void should_find_the_correct_count_when_object_exists_only_once_on_right_left_in_odd_size_search_space(){
        final Integer[] input = new Integer[]{1, 2, 3, 3, 5, 5, 5, 5, 5, 9, 9, 11, 12};
        assertEquals(1, recursiveOccurrencesCountImpl.count(12, input));
    }

    @Test
    public void should_return_negative_one_when_object_does_not_exist_in_odd_size_search_space(){
        final Integer[] input = new Integer[]{1, 1, 3, 3, 5, 5, 5, 5, 5, 9, 9, 11, 12};
        assertEquals(0, recursiveOccurrencesCountImpl.count(6, input));
    }

    @Test
    public void should_find_the_correct_count_when_object_exists_multiple_times_in_even_size_search_space(){
        final Integer[] input = new Integer[]{1, 1, 3, 3, 5, 5, 5, 5, 5, 9, 9, 11};
        assertEquals(5, recursiveOccurrencesCountImpl.count(5, input));
    }

    @Test
    public void should_find_the_correct_count_when_object_exists_multiple_times_on_right_side_in_even_size_search_space(){
        final Integer[] input = new Integer[]{1, 1, 3, 3, 5, 5, 5, 5, 5, 9, 9, 11};
        assertEquals(2, recursiveOccurrencesCountImpl.count(3, input));
    }

    @Test
    public void should_find_the_correct_count_when_object_exists_multiple_times_on_right_left_in_even_size_search_space(){
        final Integer[] input = new Integer[]{1, 1, 3, 3, 5, 5, 5, 5, 5, 9, 9, 11};
        assertEquals(2, recursiveOccurrencesCountImpl.count(9, input));
    }

    @Test
    public void should_find_the_correct_count_when_object_exists_only_once_on_right_size_in_even_size_search_space(){
        final Integer[] input = new Integer[]{1, 2, 3, 3, 5, 5, 5, 5, 5, 9, 9, 11};
        assertEquals(1, recursiveOccurrencesCountImpl.count(1, input));
    }

    @Test
    public void should_find_the_correct_count_when_object_exists_only_once_on_right_left_in_odd_even_search_space(){
        final Integer[] input = new Integer[]{1, 2, 3, 3, 5, 5, 5, 5, 5, 9, 9, 11};
        assertEquals(1, recursiveOccurrencesCountImpl.count(11, input));
    }

    @Test
    public void should_return_negative_one_when_object_does_not_exist_in_even_size_search_space(){
        final Integer[] input = new Integer[]{1, 1, 3, 3, 5, 5, 5, 5, 5, 9, 9, 11};
        assertEquals(0, recursiveOccurrencesCountImpl.count(6, input));
    }
}
