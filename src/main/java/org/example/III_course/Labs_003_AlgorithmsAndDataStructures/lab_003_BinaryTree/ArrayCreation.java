package org.example.III_course.Labs_003_AlgorithmsAndDataStructures.lab_003_BinaryTree;

import java.util.Arrays;

/**
 * Created on 23.01.2021 18:19.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class ArrayCreation {

    public int[] array() {

        String[] strArr = Util.getInput("InputBinaryTree.txt").split(" ");

        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        return intArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ArrayCreation().array()));
    }

}
