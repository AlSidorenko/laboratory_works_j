package org.example.III_course.Labs_002_DesignAndAnalysisOfAlgorithms.lab_001;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created on 03.01.2021 19:36.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Laboratory_01 {

    static int n = 1000;

    public static void main(String[] args) {
        long timeStart = System.currentTimeMillis();
        int[][] arr = array();
        //printMatrix(arr);
        System.out.printf("Multiplication: %s\n", multiplication(arr));
        long timeFinish = System.currentTimeMillis();

        Date dt = new Date(timeFinish - timeStart);
        SimpleDateFormat sdf = new SimpleDateFormat("mm:ss:SS");
        String res = sdf.format(dt);
        System.out.printf("Time: %s", res);

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

    public static int[][] array() {
        int[][] arrTemp = new int[n][n];

        Random r = new Random();
        int low = 1;
        int high = 9;

        for (int i = 0; i < arrTemp.length; i++) {
            for (int j = 0; j < arrTemp[i].length; j++) {
                arrTemp[i][j] = r.nextInt(high - low) + low;
            }
        }
        return arrTemp;
    }

    public static BigInteger multiplication(int[][] arr) {
        BigInteger mult = BigInteger.valueOf(1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mult = mult.multiply(BigInteger.valueOf(arr[i][j]));
            }
        }
        return mult;
    }
}
