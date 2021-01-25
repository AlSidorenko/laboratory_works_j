package org.example.III_course.Labs_002_DesignAndAnalysisOfAlgorithms.lab_003;

import java.util.Random;

/**
 * Created on 23.01.2021 18:19.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class ArrayCreation {

    public static int[] array(int n) {
        int[] arrTemp = new int[n];

        Random r = new Random();
        int low = 10;
        int high = 100;

        // double a = 20 + Math.random()*40;
        for (int i = 0; i < arrTemp.length; i++) {
            arrTemp[i] = r.nextInt(high - low) + low;
            //arrTemp[i] = r.nextInt();
            //arrTemp[i] = (int) (Math.random() * (high - low) + low);
            //arrTemp[i] = (int) Math.random();
        }
        return arrTemp;
    }
}
