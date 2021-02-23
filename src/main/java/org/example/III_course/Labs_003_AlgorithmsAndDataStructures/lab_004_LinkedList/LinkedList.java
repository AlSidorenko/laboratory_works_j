package org.example.III_course.Labs_003_AlgorithmsAndDataStructures.lab_004_LinkedList;

/**
 * Created on 23.02.2021 12:39.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
class LinkedList<E> implements Linked<E> {

    private int size;
    private Node<E> head;

    public LinkedList() {
        this.size = 0;
        this.head = null;
    }

    @Override
    public void insertNode(E e) {
        Node<E> node = new Node<>();
        node.item = e;
        Node<E> current = this.head;

        if (this.head == null) {
            this.head = node;
            this.head.nextElement = null;
            this.size = 1;
            System.out.println(this.head.toString());
        } else {

            while (current.nextElement != null) {
                current = current.nextElement;
            }
            current.nextElement = node;
            node.nextElement = null;
            this.size += 1;
        }
    }

    @Override
    public void insertFirst(E e) {
        Node<E> node = new Node<>();
        node.item = e;
        node.nextElement = this.head;
        this.head = node;
        this.size++;
    }

    @Override
    public void deleteFirstNode() {
        if (head != null) {
            this.head = this.head.nextElement;
            this.size--;
        } else {
            System.out.println("Linked list is empty");
        }
    }

    @Override
    public void deleteAll() {
        head = null;
        size = 0;
        System.out.println("Linked list is empty");
    }

    /**
     * Printing all the items in the list
     */
    @Override
    public void printNodes() {
        if (this.size < 1)
            System.out.println("There are no nodes in the linked list");
        else {
            Node<E> current = this.head;
            for (int i = 0; i < this.size; i++) {
                System.out.println("Node " + current.item + " is at location " + i);
                current = current.nextElement;
            }
        }
    }

    /**
     * Obtain the current size of the list
     *
     * @return size;
     */
    @Override
    public int getListSize() {
        return size;
    }
}
