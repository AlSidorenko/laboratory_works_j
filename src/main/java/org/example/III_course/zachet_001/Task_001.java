package org.example.III_course.zachet_001;

import java.util.ArrayList;

/**
 * Created on 16.12.2020 17:40.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 * <p>
 * Розробити програму для введення матриці цілих чисел розмірністю 6 х 3 і обчислення елементів
 * вектора середніх арифметичних непарних елементів парних рядків.
 */
public class Task_001 {

    public static void main(String[] args) {

        int[][] arr = {
                {10, 42, 13},
                {84, 5, 16},
                {11, 25, 32},
                {41, 15, 26},
                {81, 32, 34},
                {74, 25, 61}
        };

        System.out.println("Vector: " + vector(arr).toString());
        System.out.println("Average: " + average(vector(arr)));
    }

    // Средне арифметическое
    public static double average(ArrayList<Integer> vector) {
        int sum = 0;
        for (int i = 0; i < vector.size(); i++) {
            sum += vector.get(i);
        }
        return sum / vector.size();
    }

    // Проходим по всем элементам матрицы
    // Добавляем нужные в вектор(одномерный массив)
    public static ArrayList<Integer> vector(int[][] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i % 2 == 0) && (arr[i][j] % 2 != 0)) {
                    arrayList.add(arr[i][j]);
                }
            }
        }
        return arrayList;
    }
}
