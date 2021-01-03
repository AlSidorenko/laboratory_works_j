package org.example.III_course.Labs_001_AlgorithmisationAndProgramming.lab_04;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created on 10.12.2020 12:00.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Laboratory_4a {

    public static void main(String[] args) {
        Laboratory_4a laboratory = new Laboratory_4a();

        double[] a = {1.0, 2.53, 8.4, 105.0, 25.54, 25.52};

        System.out.printf("Input array: %s\n", Arrays.toString(a));
        System.out.printf("Result array: %s\n", laboratory.result(a));

    }

    public ArrayList<String> result(double[] arr) {
        ArrayList<String> arrStr = new ArrayList<>();

        for (double i : arr) {
            // Каждый элемент массива превращаем в строку
            String elem = String.valueOf(i);
            // из каждой строки делаем массив символов
            char[] y = elem.toCharArray();
            for (int j = 0; j < y.length; j++) {
                if ((y[j] == '.') && (y[j + 1] == '5')) {
                    arrStr.add(elem);
                }
            }
        }
        return arrStr;
    }
}
