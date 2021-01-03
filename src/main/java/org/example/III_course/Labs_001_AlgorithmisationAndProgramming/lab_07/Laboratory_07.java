package org.example.III_course.Labs_001_AlgorithmisationAndProgramming.lab_07;

/**
 * Created on 10.12.2020 14:34.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Laboratory_07 {

    public static void main(String[] args) {
        integral("cos(x)");
    }

    public static void integral(String function) {
        if (function.equals("cos(x)")) {
            double x = 0;
            double result = 0;
            while (x <= Math.PI / 3) {
                result += Math.sin(x);
                x++;
            }
            System.out.println(result);
        }
    }
}