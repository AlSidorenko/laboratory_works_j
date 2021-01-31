package org.example.III_course.Labs_003_AlgorithmsAndDataStructures.lab_001;

/**
 * Created on 26.01.2021 13:40.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Laboratory_01 {

    public static void main(String[] args) {
        String text = "How is your doing.";
        String[] arrText = text.split(" ");
        result(arrText);
    }

    public static void result(String[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count = count + (checkChars(arr[i]) - 1);
        }
        System.out.printf("Result of characters occurrence: %d\n", count);
    }

    public static int checkChars(String word) {
        int count = 0;
        char[] y = word.toCharArray();
        for (int j = 0; j < y.length; j++) {
            if (y[j] == '.' || y[j] == ',' || y[j] == ':' || y[j] == ';' ||
                    y[j] == '!' || y[j] == '?') {
                continue;
            } else {
                count++;
            }
        }
        return count;
    }
}
