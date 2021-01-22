package org.example.III_course.zachet_002;

/**
 * Created on 17.12.2020 20:26.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */

/*
  Рекурсия — вызов функции из неё же самой, непосредственно (простая рекурсия) или через другие функции
 (сложная или косвенная рекурсия), например, функция A вызывает функцию B, а функция B — функцию A.
 */

public class Task_003 {

    public static void main(String[] args) {

    }

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    public static int rank(int key, int[] a, int lo, int hi) {
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi);
        else return mid;
    }
}
