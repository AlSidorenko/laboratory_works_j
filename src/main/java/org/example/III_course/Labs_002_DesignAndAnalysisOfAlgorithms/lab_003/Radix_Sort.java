package org.example.III_course.Labs_002_DesignAndAnalysisOfAlgorithms.lab_003;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * Created on 08.01.2021 20:50.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Radix_Sort {

    private static long resNumberOfComparisons;
    private static long resNumberOfExchanges;

    public static void main(String[] args) {
        ReportSorting reportSorting = new ReportSorting();
        long timeStart = System.currentTimeMillis();

        int n = 1_000_000;

        int[] arr = new ArrayCreation().array(n);
        System.out.printf("Source array: %s\n", Arrays.toString(arr));
        int[] arrRadixSort = radixSort(arr);
        System.out.printf("Radix sort: %s\n", Arrays.toString(arrRadixSort));
        System.out.printf("Number Of Comparisons: %d\n", resNumberOfComparisons);
        System.out.printf("Number of Exchanges: %d\n", resNumberOfExchanges);
        long timeFinish = System.currentTimeMillis();

        Date dt = new Date(timeFinish - timeStart);
        SimpleDateFormat sdf = new SimpleDateFormat("mm:ss:SS");
        String resTime = sdf.format(dt);
        System.out.printf("Time: %s", resTime);

        try {
            reportSorting.report("Radix Sort: ",
            n, resNumberOfComparisons, resNumberOfExchanges, resTime);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static int largest(int[] a) {
        int larger = a[0], i;
        for (i = 1; i < 10; i++) {
            if (a[i] > larger)
                larger = a[i];
        }
        return larger;
    }

    public static int[] radixSort(int[] arr) {
        long numberOfComparisons = 0;
        long numberOfExchanges = 0;
        int[][] bucket = new int[10][10];
        int[] bucket_count = new int[10];
        int i, j, k, remainder, NOP = 0, divisor = 1, larger, pass;
        larger = largest(arr);
        while (larger > 0) {
            NOP++;
            larger /= 10;
        }
        for (pass = 0; pass < NOP; pass++) // Initialize the buckets
        {
            resNumberOfComparisons = ++numberOfComparisons;
            for (i = 0; i < 10; i++) {
                bucket_count[i] = 0;
            }
            for (i = 0; i < 10; i++) {
                // sort the numbers according to the digit at passth place
                remainder = (arr[i] / divisor) % 10;
                bucket[remainder][bucket_count[remainder]] = arr[i];
                bucket_count[remainder] += 1;
                resNumberOfExchanges = ++numberOfExchanges;
            }
            // collect the numbers after PASS pass
            i = 0;
            for (k = 0; k < 10; k++) {
                for (j = 0; j < bucket_count[k]; j++) {
                    arr[i] = bucket[k][j];
                    i++;
                }
            }
            divisor *= 10;
        }
        return arr;
    }
}
