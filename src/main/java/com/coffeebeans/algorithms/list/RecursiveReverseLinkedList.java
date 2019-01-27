package com.coffeebeans.algorithms.list;

public class RecursiveReverseLinkedList<E> extends LinkedList<E> {

    public Node reverse(final Node head) {
        if (head == null || head.link == null) {
            return head;
        }

        Node next = head.link;
        Node newHead = reverse(next);

        next.link = head;
        head.link = null;

        return newHead;
    }
}