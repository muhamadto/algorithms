package com.coffeebeans.search.binary;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IterativeBinarySearchImplTest {

    private IterativeBinarySearchImpl iterativeBinarySearch;

    @Before
    public void setup() {
        iterativeBinarySearch = new IterativeBinarySearchImpl();
    }

    @Test
    public void should_return_position_when_size_is_odd_and_required_object_at_middle_of_list() {
        final Integer[] input = new Integer[]{2, 6, 13, 21, 36, 47, 63, 81, 97};

        assertEquals(4, iterativeBinarySearch.search(36, input));
    }

    @Test
    public void should_return_position_when_size_is_odd_and_required_object_less_that_value_at_middle() {
        final Integer[] input = new Integer[]{2, 6, 13, 21, 36, 47, 63, 81, 97};
        assertEquals(2, iterativeBinarySearch.search(13, input));
    }

    @Test
    public void should_return_position_when_size_is_odd_and_required_object_larger_that_value_at_middle() {
        final Integer[] input = new Integer[]{2, 6, 13, 21, 36, 47, 63, 81, 97};

        assertEquals(8, iterativeBinarySearch.search(97, input));
    }

    @Test
    public void should_return_position_when_size_is_even_and_required_object_at_middle_of_list() {
        final Integer[] input = new Integer[]{2, 6, 13, 21, 36, 47, 63, 81};

        assertEquals(3, iterativeBinarySearch.search(21, input));
    }

    @Test
    public void should_return_position_when_size_is_even_and_required_object_less_that_value_at_middle() {
        final Integer[] input = new Integer[]{2, 6, 13, 21, 36, 47, 63, 81};

        assertEquals(2, iterativeBinarySearch.search(13, input));
    }

    @Test
    public void should_return_position_when_size_is_even_and_required_object_larger_that_value_at_middle() {
        final Integer[] input = new Integer[]{2, 6, 13, 21, 36, 47, 63, 81};

        assertEquals(7, iterativeBinarySearch.search(81, input));
    }

    @Test
    public void should_return_negative_one_when_size_is_odd_and_required_object_not_in_list() {
        final Integer[] input = new Integer[]{2, 6, 13, 21, 36, 47, 63, 81};

        assertEquals(-1, iterativeBinarySearch.search(90, input));
    }

    @Test
    public void should_return_negative_one_when_size_is_even_and_required_object_not_in_list() {
        final Integer[] input = new Integer[]{2, 6, 13, 13, 13, 47, 63, 81, 97};

        assertEquals(-1, iterativeBinarySearch.search(90, input));
    }
}
