package org.example.III_course.zachet_001;

import java.util.Scanner;

/**
 * Created on 16.12.2020 17:48.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 * <p>
 * 2. Розробити схему алгоритму та програмний проект для:
 * -  обчислення  елементів  матриці  розмірністю  N х N  за  формулою
 * А ij  = sin(i) + ln(j2 ), де  i = 0; j=0
 * -  обчислення  елементів  вектора  добутків  елементів  головної  діагоналі матриці
 * на елементи другого рядка;
 * -  переставляння елементів побічної діагоналі й останнього стовпчика матриці
 */

public class Task_002 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter row: ");
        int row = sc.nextInt();
        System.out.print("Please? enter column: ");
        int column = sc.nextInt();

        printMatrix(matrix(row, column));

    }

    // Вывод маирици
    public static void printMatrix(int[][] arr) {
        System.out.println("Input array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    // Создание матрицы
    public static int[][] matrix(int row, int column) {
        int[][] arr = new int[row][column];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.sin(i) + Math.log(j * j));
            }
        }
        return arr;
    }
}
