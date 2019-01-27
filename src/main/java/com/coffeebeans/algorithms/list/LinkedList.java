package com.coffeebeans.algorithms.list;

public class LinkedList<E> {

    class Node {

        protected E element;
        protected Node link;

        Node(final E element, final Node link) {
            this.element = element;
            this.link = link;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node getLink() {
            return link;
        }

        public void setLink(Node link) {
            this.link = link;
        }
    }
}
