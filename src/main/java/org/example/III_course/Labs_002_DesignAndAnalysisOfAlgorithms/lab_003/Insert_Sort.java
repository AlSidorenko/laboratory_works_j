package org.example.III_course.Labs_002_DesignAndAnalysisOfAlgorithms.lab_003;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * Created on 23.01.2021 18:17.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Insert_Sort {

    private static long resNumberOfComparisons;
    private static long resNumberOfExchanges;

    public static void main(String[] args) {
        ReportSorting reportSorting = new ReportSorting();
        long timeStart = System.currentTimeMillis();

        int n = 1_000_000;

        int[] arr = new ArrayCreation().array(n);
        System.out.printf("Source array: %s\n", Arrays.toString(arr));
        int[] arrInsertSort = sortInsert(arr);
        System.out.printf("Insert sort: %s\n", Arrays.toString(arrInsertSort));
        System.out.printf("Number Of Comparisons: %d\n", resNumberOfComparisons);
        System.out.printf("Number of Exchanges: %d\n", resNumberOfExchanges);
        long timeFinish = System.currentTimeMillis();

        Date dt = new Date(timeFinish - timeStart);
        SimpleDateFormat sdf = new SimpleDateFormat("mm:ss:SS");
        String resTime = sdf.format(dt);
        System.out.printf("Time: %s", resTime);

        try {
            reportSorting.report("Insert Sort:",
                    n, resNumberOfComparisons, resNumberOfExchanges, resTime);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static int[] sortInsert(int[] arr) {
        long numberOfComparisons = 0;
        long numberOfExchanges = 0;
        for (int barrier = 1; barrier < arr.length; barrier++) {
            resNumberOfComparisons = ++numberOfComparisons;
            int index = barrier;
            while (index - 1 >= 0 && arr[index] < arr[index - 1]) {
                int temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                resNumberOfExchanges = ++numberOfExchanges;
                index--;
            }
        }
        return arr;
    }
}
