package org.example.lab_04;

import java.util.Scanner;

public class Example_004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MAX = 10;
        int[][] a = new int[MAX][MAX];
        int m, n, i, j, min, max, imax, jmax, imin, jmin;

        System.out.println("Input dimension of array: m rows and n columns");
        do {
            System.out.print("Input m [1...10] = ");
            m = sc.nextInt();
        } while ((m < 1) || (m > MAX));

        do {
            System.out.print("Input n [1...10] = ");
            n = sc.nextInt();
        } while ((n < 1) || (n > MAX));

        System.out.println("Input element of array:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.printf("Input a[%d][%d] = ", i, j);
                a[i][j] = sc.nextInt();
            }
        }

        // пошук max у рядку 0;
        max = a[0][0];
        imax = jmax = 0;
        for (j = 1; j < n; j++)
            if (a[0][j] > max) {
                max = a[0][j];
                jmax = j;
            }

        // спочатку приймемо max нульового рядка за шуканий min
        min = max;
        imin = 0;
        jmin = jmax;
        System.out.printf("MAX of the %d row is %d\n", i, max);
        if (min > max) {
            min = max;
            jmin = jmax;
            imin = imax;
        }
        System.out.println();
        System.out.println("-- ARRAY --");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++)
                System.out.printf("%d\t", a[i][j]);
            System.out.println();
        }
        System.out.println();
        System.out.printf("\nMIN MAX = a[%d][%d] = %d", imin, jmin, min);
    }
}
