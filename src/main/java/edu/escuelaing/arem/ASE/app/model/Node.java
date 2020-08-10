package edu.escuelaing.arem.ASE.app.model;

public class Node<E> {
    private E data;
    private Node<E> next = null;
    private Node<E> prior = null;

    public Node() {
    }

    public Node(E data) {
        this.data = data;
    }


    public void setData(E data) {
        this.data = data;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public Node<E> getNext() {
        return next;
    }

    /**
     * Obtiene el anterior nodo
     *
     * @return
     */
    public Node<E> getPrior() {
        return prior;
    }

    /**
     * Cambia el nodo apuntado anterior
     *
     * @param prior
     */
    public void setPrior(Node<E> prior) {
        this.prior = prior;
    }
}
