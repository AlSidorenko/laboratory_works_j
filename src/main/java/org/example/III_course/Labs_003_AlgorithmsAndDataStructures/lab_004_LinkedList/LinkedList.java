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
    public void insertNth(E e, int position) {
        Node<E> node = new Node<>();
        node.item = e;
        Node<E> current = this.head;
        if (this.head != null && position <= this.size) {
            for (int i = 1; i < position; i++) {
                current = current.nextElement;
            }
            node.nextElement = current.nextElement;
            current.nextElement = node;
            this.size += 1;
        } else {
            System.out.println("Exceeded the linked list size. Current Size: " + size);
        }
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
    public void deleteLastNode() {
        Node<E> currentNode = this.head;
        if (size == 1) {
            head = null;
            size = 0;
        } else {
            Node<E> prevNode = null;
            while (currentNode.nextElement != null) {
                prevNode = currentNode;
                currentNode = currentNode.nextElement;
            }
            prevNode.nextElement = null;
            this.size--;
        }
    }

    @Override
    public void deleteNthNode(int position) {
        if (position <= this.size && this.head != null) {
            Node<E> currentNode = this.head;
            Node<E> prevNode = null;
            for (int i = 0; i < position; i++) {
                prevNode = currentNode;
                currentNode = currentNode.nextElement;
            }
            prevNode.nextElement = currentNode.nextElement;
            this.size--;
        } else {
            System.out.println("No node exist at location: " + position);
        }
    }

    @Override
    public void findNode(E e) {
        Node<E> node = this.head;
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (node.item.equals(e)) {
                System.out.println("Item " + e + " was found at location " + i + " in the linked list");
                found = true;
            }
            node = node.nextElement;
        }

        if (!found)
            System.out.println("Item " + e + " was not found in the Linked list");
    }

    @Override
    public void findNodeAt(int location) {
        Node<E> node = this.head;
        if (head != null && location <= size) {
            for (int i = 0; i < location; i++) {
                node = node.nextElement;
            }
            System.out.println("Node item at location " + location + " is " + node.item);
        }
    }

    /**
     * Find the item at the last location
     */
    @Override
    public void findLastNode() {
        Node<E> node = this.head;
        if (head != null) {
            for (int i = 0; i < size - 1; i++) {
                node = node.nextElement;
            }
            System.out.println("Node item at last location is " + node.item);
        }
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
     * @return
     */
    @Override
    public int getListSize() {
        return size;
    }
}
