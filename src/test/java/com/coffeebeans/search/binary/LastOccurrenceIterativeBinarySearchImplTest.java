package com.coffeebeans.search.binary;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LastOccurrenceIterativeBinarySearchImplTest {
    private LastOccurrenceIterativeBinarySearchImpl lastOccurrenceIterativeBinarySearch;

    @Before
    public void setup() {
        lastOccurrenceIterativeBinarySearch = new LastOccurrenceIterativeBinarySearchImpl();
    }

    @Test
    public void should_return_position_when_size_is_odd_and_first_occurrence_of_required_object_at_the_right_part_of_list() {
        final Integer[] input = new Integer[]{2, 6, 13, 13, 13, 47, 63, 81, 97};

        assertEquals(4, lastOccurrenceIterativeBinarySearch.search(13, input));
    }

    @Test
    public void should_return_position_when_size_is_odd_and_required_object_at_middle_of_list() {
        final Integer[] input = new Integer[]{2, 6, 13, 21, 36, 47, 63, 81, 97};

        assertEquals(4, lastOccurrenceIterativeBinarySearch.search(36, input));
    }

    @Test
    public void should_return_position_when_size_is_odd_and_required_object_less_that_value_at_middle() {
        final Integer[] input = new Integer[]{2, 6, 13, 21, 36, 47, 63, 81, 97};
        assertEquals(2, lastOccurrenceIterativeBinarySearch.search(13, input));
    }

    @Test
    public void should_return_position_when_size_is_odd_and_required_object_larger_that_value_at_middle() {
        final Integer[] input = new Integer[]{2, 6, 13, 21, 36, 47, 63, 81, 97};

        assertEquals(8, lastOccurrenceIterativeBinarySearch.search(97, input));
    }

    @Test
    public void should_return_position_when_size_is_even_and_first_occurrence_of_required_object_at_the_right_part_of_list() {
        final Integer[] input = new Integer[]{2, 6, 13, 13, 13, 47, 63, 81};

        assertEquals(4, lastOccurrenceIterativeBinarySearch.search(13, input));
    }

    @Test
    public void should_return_position_when_size_is_even_and_required_object_at_middle_of_list() {
        final Integer[] input = new Integer[]{2, 6, 13, 21, 36, 47, 63, 81};

        assertEquals(3, lastOccurrenceIterativeBinarySearch.search(21, input));
    }

    @Test
    public void should_return_position_when_size_is_even_and_required_object_less_that_value_at_middle() {
        final Integer[] input = new Integer[]{2, 6, 13, 21, 36, 47, 63, 81};

        assertEquals(2, lastOccurrenceIterativeBinarySearch.search(13, input));
    }

    @Test
    public void should_return_position_when_size_is_even_and_required_object_larger_that_value_at_middle() {
        final Integer[] input = new Integer[]{2, 6, 13, 21, 36, 47, 63, 81};

        assertEquals(7, lastOccurrenceIterativeBinarySearch.search(81, input));
    }
}
