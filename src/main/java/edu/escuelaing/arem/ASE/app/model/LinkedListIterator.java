package edu.escuelaing.arem.ASE.app.model;

import java.util.Iterator;

public class LinkedListIterator<E> implements Iterator<E> {
    Node<E> current;

    /**
     * Constructor del LinkedListIterator
     *
     * @param actual
     */
    public LinkedListIterator(Node<E> actual) {
        current = actual;
    }

    /**
     * Rectifica si el actual nodo tiene un siguiente nodo
     *
     * @return boolean
     */
    public boolean hasNext() {
        return current != null;
    }

    /**
     * Retorna el valor del nodo actual
     *
     * @return E
     */
    public E next() {
        E data = current.getData();
        current = current.getNext();
        return data;
    }

    public void remove() {

    }
}
