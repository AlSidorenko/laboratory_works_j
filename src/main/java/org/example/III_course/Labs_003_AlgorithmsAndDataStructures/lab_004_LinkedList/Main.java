package org.example.III_course.Labs_003_AlgorithmsAndDataStructures.lab_004_LinkedList;

/**
 * Created on 23.02.2021 12:42.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */

class Main {

    public static void main(String[] args) {
        LinkedList<Person> list = new LinkedList<>();

        System.out.println("Current Size of the list is: " + list.getListSize());

        list.insertNode(new Person("Ivan", "Ivanov"));
        list.insertNode(new Person("Petr", "Petrov"));
        list.insertNode(new Person("Arseniy", "Arsentev"));
        list.insertNode(new Person("Sidor", "Sidorov"));
        list.insertNode(new Person("Anna", "Sid"));
        list.printNodes();

        System.out.println();

        System.out.println("Finding item Petr Petrov in the Linked list");
        list.findNode(new Person("Petr", "Petrov"));
        System.out.println("Finding item nonExist in the Lineked list");
        list.findNode(new Person("Alec", "Syd"));

        System.out.println();

        System.out.println("Finding item at location 3");
        list.findNodeAt(3);

        System.out.println();
        System.out.println("Finding item at last location ");
        list.findLastNode();

        System.out.println();

        System.out.println("Current Size of the list is: " + list.getListSize());
        System.out.println("Adding David Sid at start of the Node");
        list.insertFirst(new Person("David", "Sid"));
        list.printNodes();

        System.out.println();

        System.out.println("Current Size of the list is: " + list.getListSize());
        System.out.println("Adding testNth at 2nd Location");
        list.insertNth(new Person("Roman", "Denyneka"), 2);
        list.printNodes();

        System.out.println();

        System.out.println("Current Size of the list is: " + list.getListSize());
        System.out.println("Deleting first node");
        list.deleteFirstNode();
        list.printNodes();

        System.out.println();

        System.out.println("Current Size of the list is: " + list.getListSize());
        System.out.println("Deleting last node");
        list.deleteLastNode();
        list.printNodes();

        System.out.println();

        System.out.println("Current Size of the list is: " + list.getListSize());
        System.out.println("Deleting node from 4th location");
        list.deleteNthNode(4);
        list.printNodes();
    }
}
