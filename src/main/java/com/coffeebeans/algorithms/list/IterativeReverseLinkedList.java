package com.coffeebeans.algorithms.list;

public class IterativeReverseLinkedList<E> {

  class Node {

    private E element;
    private Node link;

    Node(final E element, final Node link){
      this.element = element;
      this.link = link;
    }

    public Node getLink() {
      return link;
    }

    public void setLink(Node link) {
      this.link = link;
    }
  }

  public void reverse(final Node head) {
    if(head == null || head.link == null){
      return;
    }

    Node previous = null;
    Node current = head;

    while (current.link != null) {
      final Node next = current.link;
      current.link = previous;

      previous = current;
      current = next;
    }
  }
}
