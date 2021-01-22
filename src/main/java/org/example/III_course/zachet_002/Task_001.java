package org.example.III_course.zachet_002;

import java.util.Scanner;

/**
 * Created on 17.12.2020 20:08.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Task_001 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int numb = scanner.nextInt();

        convertToBinary(numb);

    }

    public static void convertToBinary(int number) {
        if (number > 0) {
            convertToBinary(number / 2);
            System.out.print(number % 2);
        }
    }
}
