package org.example.III_course.Labs_001_AlgorithmisationAndProgramming.lab_06;

/**
 * Created on 24.12.2020 14:11.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Laboratory_06 {

    public static void main(String[] args) {
        String text = "King Arthur today is the most recognizable book hero not only in British folklore, " +
                "but also in the world literature. The young knight Arthur proved his right to be the king, " +
                "when he pulled out the legendary sword Excalibur from the rock.";

        String word = "sword";

        System.out.println(chekWord(text, word));
    }

    public static boolean chekWord(String text, String word) {
        boolean result = false;
        String[] textArr = text.split(" ");
        for (int i = 0; i < textArr.length; i++) {
            if (textArr[i].equals(word)) {
                result = true;
            }
        }
        return result;
    }
}
