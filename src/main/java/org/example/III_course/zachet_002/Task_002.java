package org.example.III_course.zachet_002;

import java.util.Arrays;

/**
 * Created on 17.12.2020 20:30.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Task_002 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        //original array
        int[] intArray = new int[]{52, 45, 32, 64, 12, 87, 78, 98, 23, 7};
        System.out.println("Sorted array: " + Arrays.toString(sortingArray(intArray)));
        System.out.println("Elen #7: " + intArray[7]);
        long finishTime = System.currentTimeMillis();
        System.out.printf("Time: %s ms.", finishTime - startTime);
    }

    public static int[] sortingArray(int[] arr) {
        // bubble sort
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}

