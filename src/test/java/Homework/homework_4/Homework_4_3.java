package Homework.homework_4;

import java.util.Arrays;

public class Homework_4_3 {
    /*
    Дан массив:
    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    необходимо увеличить все значения массива на 15.
     */

    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

       int[] result = Arrays.stream(array).map(number -> number + 15).toArray();

        for (int i = 0; i < array.length; i++) {
            array[i] += 15;
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(result));
    }
}
