package com.coffeebeans.search.binary;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecursiveBinarySearchImplTest {
    private RecursiveBinarySearchImpl recursiveBinarySearch;

    @Before
    public void setup() {
        recursiveBinarySearch = new RecursiveBinarySearchImpl();
    }

    @Test
    public void should_return_mid_position_when_size_is_odd_and_required_object_at_middle_of_list() {
        final Integer[] input = new Integer[]{2, 6, 13, 21, 36, 47, 63, 81, 97};

        assertEquals(4l, recursiveBinarySearch.search(36, input));
    }


    @Test
    public void should_return_mid_position_when_size_is_odd_and_required_object_less_that_value_at_middle() {
        final Integer[] input = new Integer[]{2, 6, 13, 21, 36, 47, 63, 81, 97};

        assertEquals(2, recursiveBinarySearch.search(13, input));
    }

    @Test
    public void should_return_mid_position_when_size_is_odd_and_required_object_larger_that_value_at_middle() {
        final Integer[] input = new Integer[]{2, 6, 13, 21, 36, 47, 63, 81, 97};

        assertEquals(8, recursiveBinarySearch.search(97, input));
    }


    @Test
    public void should_return_mid_position_when_size_is_even_and_required_object_at_middle_of_list() {
        final Integer[] input = new Integer[]{2, 6, 13, 21, 36, 47, 63, 81};

        assertEquals(3, recursiveBinarySearch.search(21, input));
    }

    @Test
    public void should_return_mid_position_when_size_is_even_and_required_object_less_that_value_at_middle() {
        final Integer[] input = new Integer[]{2, 6, 13, 21, 36, 47, 63, 81};

        assertEquals(2, recursiveBinarySearch.search(13, input));
    }

    @Test
    public void should_return_mid_position_when_size_is_even_and_required_object_larger_that_value_at_middle() {
        final Integer[] input = new Integer[]{2, 6, 13, 21, 36, 47, 63, 81};

        assertEquals(7, recursiveBinarySearch.search(81, input));
    }
}
