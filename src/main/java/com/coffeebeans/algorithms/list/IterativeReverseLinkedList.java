package com.coffeebeans.algorithms.list;

public class IterativeReverseLinkedList<E> extends LinkedList<E> {
    public Node reverse(final Node head) {
        if (head == null || head.link == null) {
            return head;
        }

        Node previous = null;
        Node current = head;

        while (current != null) {
            final Node next = current.link;
            current.link = previous;

            previous = current;
            current = next;
        }

        return previous; // new head
    }
}
