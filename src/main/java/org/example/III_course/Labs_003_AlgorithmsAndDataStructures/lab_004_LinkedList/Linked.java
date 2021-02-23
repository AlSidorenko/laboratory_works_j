package org.example.III_course.Labs_003_AlgorithmsAndDataStructures.lab_004_LinkedList;

/**
 * Created on 20.02.2021 18:20.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public interface Linked<E> {

    void insertNode(E e);
    void insertFirst(E e);
    void deleteFirstNode();
    void printNodes();
    void deleteAll();
    int getListSize();

}
