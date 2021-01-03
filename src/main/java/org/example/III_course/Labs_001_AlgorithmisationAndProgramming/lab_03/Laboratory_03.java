package org.example.III_course.Labs_001_AlgorithmisationAndProgramming.lab_03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created on 09.12.2020 13:23.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */

/*
    Математичний ряд:
    Дано, дійсні числа x!=0, 0<e<1.
    Обчислити з точныстю до е та дослідити збігання послідовності для обраного значення х,
    виводячи кожний р-й додаток, та відповідне значення суми:
    sum(k=0, infinity) (-1)^k/(k! * (k+1)!) * (x/2)^(2k+1)

    По первому признаку Лейбница каждый последующий член ряда по абсолютной величине должен быть меньше
    предыдущего, т.е. для нашего ряда это условие выполняется
    1/2 > 1/16 > 1/384.
 */

public class Laboratory_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter X (X!=0): ");
        double x = Double.valueOf(scanner.nextLine());
        System.out.print("Please, enter K [0, infinity]: ");
        double kMax = Double.valueOf(scanner.nextLine());

        System.out.printf("Result: %s\n", mathSeries(x, kMax).toString());
        System.out.printf("Sum items: %s\n", sumElem(mathSeries(x, kMax)));
    }

    // Математический ряд.
    public static ArrayList<Double> mathSeries(double x, double kMax) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        double res;
        for (int k = 0; k < kMax; k++) {
            res = (Math.pow(-1.0, k) / (factorialInt(k) * factorialInt(k + 1.0))) *
                    (Math.pow((x / 2.0), ((2.0 * k) + 1.0)));
            doubleArrayList.add(res);
        }
        return doubleArrayList;
    }

    // Сумма єлементов математического ряда
    public static double sumElem(ArrayList<Double> mathSeries) {
        double sum = 0.0;
        for (int i = 0; i < mathSeries.size(); i++) {
            sum += mathSeries.get(i);
        }
        return sum;
    }

    // Факториал
    public static int factorialInt(double kMax) {
        // проверка на отрицательное значение
        checkNotNegative(kMax);

        int factorial = 1;
        for (int i = 2; i <= kMax; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    private static void checkNotNegative(double k) {
        if (k < 0) {
            throw new IllegalArgumentException("negative value");
        }
    }
}
