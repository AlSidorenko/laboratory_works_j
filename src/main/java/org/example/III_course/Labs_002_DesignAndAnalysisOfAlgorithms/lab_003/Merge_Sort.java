package org.example.III_course.Labs_002_DesignAndAnalysisOfAlgorithms.lab_003;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * Created on 23.01.2021 18:23.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Merge_Sort {

    private static long resNumberOfComparisons;
    private static long resNumberOfExchanges;

    public static void main(String[] args) {
        ReportSorting reportSorting = new ReportSorting();
        long timeStart = System.currentTimeMillis();

        int n = 1_000_000;

        int[] arr = new ArrayCreation().array(n);
        System.out.printf("Source array: %s\n", Arrays.toString(arr));
        int[] arrMergeSort = sortMerge(arr, 0, arr.length - 1);
        System.out.printf("Merge sort: %s\n", Arrays.toString(arrMergeSort));
        System.out.printf("Number Of Comparisons: %d\n", resNumberOfComparisons);
        System.out.printf("Number of Exchanges: %d\n", resNumberOfExchanges);
        long timeFinish = System.currentTimeMillis();

        Date dt = new Date(timeFinish - timeStart);
        SimpleDateFormat sdf = new SimpleDateFormat("mm:ss:SS");
        String resTime = sdf.format(dt);
        System.out.printf("Time: %s", resTime);

        try {
            reportSorting.report("Merge Sort: ",
            n, resNumberOfComparisons, resNumberOfExchanges, resTime);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void merge(int[] arr, int beg, int mid, int end) {
        long numberOfComparisons = 0;
        long numberOfExchanges = 0;

        int l = mid - beg + 1;
        int r = end - mid;

        int[] LeftArray = new int[l];
        int[] RightArray = new int[r];

        for (int i = 0; i < l; ++i) {
            resNumberOfComparisons = ++numberOfComparisons;
            LeftArray[i] = arr[beg + i];
        }

        for (int j = 0; j < r; ++j) {
            resNumberOfComparisons = ++numberOfComparisons;
            RightArray[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = beg;
        while (i < l && j < r) {
            if (LeftArray[i] <= RightArray[j]) {
                arr[k] = LeftArray[i];
                resNumberOfExchanges = ++numberOfExchanges;
                i++;
            } else {
                arr[k] = RightArray[j];
                resNumberOfExchanges = ++numberOfExchanges;
                j++;
            }
            k++;
        }

        while (i < l) {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j < r) {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }

    public static int[] sortMerge(int[] arr, int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            sortMerge(arr, beg, mid);
            sortMerge(arr, mid + 1, end);
            merge(arr, beg, mid, end);
        }
        return arr;
    }
}
