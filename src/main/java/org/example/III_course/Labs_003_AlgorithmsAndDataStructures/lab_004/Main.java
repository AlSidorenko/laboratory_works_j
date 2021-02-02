package org.example.III_course.Labs_003_AlgorithmsAndDataStructures.lab_004;

/**
 * Created on 01.02.2021 13:44.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Main {

    public static void main(String[] args) {
        SingleLinkList<Person> contactList = new SingleLinkList<>();

        contactList.addToEnd(new Person(123, "Ivan", "Ivanov"));
        contactList.addToEnd(new Person(151, "Petr", "Petrov"));
        contactList.addToEnd(new Person(332, "Sidor", "Sidorov"));

        for (Person person : contactList) {
            System.out.println(person);
        }
    }
}
