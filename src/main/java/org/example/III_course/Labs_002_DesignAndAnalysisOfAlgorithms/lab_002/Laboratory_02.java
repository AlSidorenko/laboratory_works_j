package org.example.III_course.Labs_002_DesignAndAnalysisOfAlgorithms.lab_002;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created on 04.01.2021 20:01.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Laboratory_02 {

    public static void main(String[] args) throws IOException {
        int counter, num, item, array[], first, last;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        num = input.nextInt();

        array = new int[num];

        System.out.println("Enter " + num + " numbers");

        for (counter = 0; counter < num; counter++)
            array[counter] = input.nextInt();

        System.out.print("Enter an element for binary search: ");
        item = input.nextInt();
        first = 0;
        last = num - 1;

        long timeStart = System.currentTimeMillis();
        //Arrays.sort(array);
        bubbleSortArray(array);
        binarySearch(array, first, last, item);
        long timeFinish = System.currentTimeMillis();

        Date dt = new Date(timeFinish - timeStart);
        SimpleDateFormat sdf = new SimpleDateFormat("mm:ss:SS");
        String resTime = sdf.format(dt);
        System.out.printf("Time: %s", resTime);

        FileWriter fw = new FileWriter("report_search.txt", true);
        BufferedWriter bufferWriter = new BufferedWriter(fw);
        bufferWriter.write("------------------------------------------- \n");
        bufferWriter.write(String.format("N = %d                        Time: %s\n", num, resTime));
        bufferWriter.close();
        fw.close();
    }

    // Dichotomous Search
    public static void binarySearch(int[] array, int first, int last, int item) {
        int position;
        int comparisonCount = 1;

        position = (first + last) / 2;

        while ((array[position] != item) && (first <= last)) {
            comparisonCount++;
            if (array[position] > item) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.printf("%d is %d item in the array\n", item, ++position);
            System.out.printf("Binary search method found number after %d comparisons\n", comparisonCount);
        } else {
            System.out.printf(
                    "The item was not found in the array. The binary search method exited after %d comparisons\n",
                    comparisonCount);
        }
    }

    public static void bubbleSortArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
    }
}
