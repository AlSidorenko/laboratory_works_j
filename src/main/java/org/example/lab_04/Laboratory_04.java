package org.example.lab_04;

/**
 * Created on 10.12.2020 15:30.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Laboratory_04 {

    public static void main(String[] args) {
        int[][] arr = {
                {2,  3, 8, 7},
                {4,  5, 7, 1},
                {3,  8, 2, 3},
                {4, 23, 3, 7}
        };
        printMatrixA(arr);
        System.out.println();
        printMatrixB(arr);
        System.out.println();
        System.out.printf("Sum matrix = %s\n", sumMatrixB(arr));
        item(arr);

    }

    public static void item (int[][] arr) {
        int indexOfItem = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == sumMatrixB(arr)) {
                    indexOfItem = arr[i][j];
                    System.out.printf("arr[%d][%d] = %d", i, j, indexOfItem);
                    break;
                }
            }
        }
    }

    // Сумма элементов матрицы
    public static int sumMatrixB(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = 2; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    // Вывод маирици А
    public static void printMatrixA(int[][] arr) {
        System.out.println("Matrix A: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    // Вывод маирици В
    public static void printMatrixB(int[][] arr) {
        System.out.println("Matrix B: ");
        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = 2; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
