package edu.escuelaing.arem.ASE.app.model;
import java.util.Iterator;

public class LinkedList<E> implements Iterable<E> {
    private Node<E> head = new Node<E>();
    private int size = 0;

    public boolean add(E node) {
        Node<E> actual = new Node<E>(node);
        if (size == 0) {
            head.setPrior(actual);
            head.setNext(actual);
        } else {
            head.getNext().setNext(actual);
            head.setNext(actual);
        }
        size++;
        return true;
    }

    public E get(int index) {
        if (index < 0 || index < size) {
            int pos = 0;
            Iterator<E> iterador = iterator();
            while (pos != index) {
                iterador.next();
                pos++;
            }
            return iterador.next();
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public int getSize() {
        return size;
    }

    // return Iterator instance
    public Iterator<E> iterator()
    {
        return new LinkedListIterator<E>(head.getPrior());
    }
}
