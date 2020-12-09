package org.example;

import java.util.Scanner;

/**
 * Created on 09.12.2020 3:30.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */

/*
 * Варіан 2-19. Обчислити:
 * (x+y)/xy + x^3, x>0, y>0;
 * 3.14*y,         x=0;
 * x^2,            y=0;
 * 1 - в інших випадках.
 */
public class Laboratory_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter X: ");
        int x = sc.nextInt();

        System.out.print("Please, enter Y: ");
        int y = sc.nextInt();

        System.out.printf("Result: %s", new Laboratory_02().function(x, y));

    }

    public double function(int x, int y) {
        double res;
        if (x > 0 & y > 0) {
            res = (x + y) / x * y + (Math.pow(x, 3));
        } else if (x == 0) {
            res = 3.14 * y;
        } else if (y == 0) {
            res=Math.pow(x, 2);
        } else {
            res = 1;
        }
        return res;
    }
}
