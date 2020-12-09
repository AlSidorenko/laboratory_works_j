package org.example;

import java.util.Scanner;

/**
 * Created on 09.12.2020 13:23.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Laboratory_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double eps = 0.0, s =0.0, a = 0.5;

        do {
            System.out.print("eps = ");
            eps = Double.valueOf(scanner.nextLine());
        } while (eps>0.1f||eps<=0);

        while (a>eps) {
            s+=a;
            a/=2;
        }
        System.out.printf("eps = %s, sum = %s", eps, s);
    }
}
