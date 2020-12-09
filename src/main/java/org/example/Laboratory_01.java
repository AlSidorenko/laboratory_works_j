package org.example;


import java.util.Scanner;

/**
 * Created on 09.12.2020 2:55.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */

/*
 №1-19. Для заданних а,в обчислити:
 (a+b)*sin(a) + (a-b)*cos(b) + (a-b)/sqrt(sin(a)+cos(b))
 */

public class Laboratory_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter a: ");
        double a = sc.nextDouble();

        System.out.print("Please, enter b: ");
        double b = sc.nextDouble();

        System.out.printf("Result: %s", new Laboratory_01().homeWork(a, b));
    }

    public double homeWork(double a, double b) {
        return ((a + b) * Math.sin(a) + (a - b) * Math.cos(b) + (a - b)) /
                (Math.sqrt(Math.sin(a) + Math.cos(b)));
    }
}
