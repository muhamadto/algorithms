package com.coffeebeans.algorithms.list;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IterativeReverseLinkedListTest {

    private IterativeReverseLinkedList<Integer> iterativeReverseLinkedList;

    @Before
    public void setup() {
        iterativeReverseLinkedList = new IterativeReverseLinkedList<>();
    }

    @Test
    public void should_reverse_linked_list() {
        IterativeReverseLinkedList<Integer>.Node node3 = iterativeReverseLinkedList.new Node(5, null);
        IterativeReverseLinkedList<Integer>.Node node2 = iterativeReverseLinkedList.new Node(6, node3);
        IterativeReverseLinkedList<Integer>.Node node1 = iterativeReverseLinkedList.new Node(4, node2);
        IterativeReverseLinkedList<Integer>.Node head = iterativeReverseLinkedList.new Node(2, node1);

        final IterativeReverseLinkedList.Node newHead = iterativeReverseLinkedList.reverse(head);

        assertThat(newHead.getElement())
                .isEqualTo(5);

        assertThat(newHead.getLink().getElement())
                .isEqualTo(6);

        assertThat(newHead.getLink().getLink().getElement())
                .isEqualTo(4);

        assertThat(newHead.getLink().getLink().getLink().getElement())
                .isEqualTo(2);

        assertThat(newHead.getLink().getLink().getLink().getLink())
                .isNull();
    }

    @Test
    public void should_terminate_gracefully_when_head_is_null() {
        final IterativeReverseLinkedList.Node newHead = iterativeReverseLinkedList.reverse(null);

        assertThat(newHead)
                .isNull();
    }

    @Test
    public void should_terminate_gracefully_when_list_has_only_one_element() {
        IterativeReverseLinkedList<Integer>.Node head = iterativeReverseLinkedList.new Node(5, null);

        final IterativeReverseLinkedList<Integer>.Node newHead = iterativeReverseLinkedList.reverse(head);

        assertThat(newHead)
                .isNotNull();

        assertThat(newHead.getLink())
                .isNull();

        assertThat(newHead.getElement())
                .isEqualTo(5);
    }
}