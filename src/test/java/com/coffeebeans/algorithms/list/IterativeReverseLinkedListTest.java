package com.coffeebeans.algorithms.list;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class IterativeReverseLinkedListTest {

  private IterativeReverseLinkedList<Integer> iterativeReverseLinkedList;

  @Before
  public void setup(){
    iterativeReverseLinkedList = new IterativeReverseLinkedList<>();
  }

  @Test
  public void should_reverse_linked_list(){
    IterativeReverseLinkedList.Node node3 = iterativeReverseLinkedList.new Node(5, null);
    IterativeReverseLinkedList.Node node2 = iterativeReverseLinkedList.new Node(6, node3);
    IterativeReverseLinkedList.Node node1 = iterativeReverseLinkedList.new Node(4, node2);
    IterativeReverseLinkedList.Node head = iterativeReverseLinkedList.new Node(2, node1);

    iterativeReverseLinkedList.reverse(head);

    assertThat(head.getLink(), is(equals(null)));
  }

}