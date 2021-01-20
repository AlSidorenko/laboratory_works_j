package org.example.III_course.Labs_002_DesignAndAnalysisOfAlgorithms.lab_001;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * Created on 03.01.2021 19:36.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Laboratory_01 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter N: ");
        int n = sc.nextInt();

        long timeStart = System.currentTimeMillis();
        int[][] arr = array(n);
        printMatrix(arr);
        System.out.printf("Multiplication: %s\n", multiplication(arr, n));
        long timeFinish = System.currentTimeMillis();

        Date dt = new Date(timeFinish - timeStart);
        SimpleDateFormat sdf = new SimpleDateFormat("mm:ss:SS");
        String resTime = sdf.format(dt);
        System.out.printf("Time: %s", resTime);

        FileWriter fw = new FileWriter("report.txt", true);
        BufferedWriter bufferWriter = new BufferedWriter(fw);
        bufferWriter.write("------------------------------------------- \n");
        bufferWriter.write(String.format("N = %d\t\t\t\t\t\t Time: %s\n", n, resTime));
        bufferWriter.close();
        fw.close();
    }

    // Print matrix
    public static void printMatrix(int[][] arr) {
        System.out.println("Input array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    // Create matrix
    public static int[][] array(int n) {
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

    public static BigInteger multiplication(int[][] arr, int n) {
        BigInteger mult = BigInteger.valueOf(1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mult = mult.multiply(BigInteger.valueOf(arr[i][j]));
            }
        }
        return mult;
    }
}
