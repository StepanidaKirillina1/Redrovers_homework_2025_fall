package Homework.homework_5;

import java.util.Arrays;

public class Homework_5_1 {
    public static void main(String[] args) {
        /*
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести сумму всех значений массива.
         */

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int totalSum = 0;
        for (int num : array) {
            totalSum += num;
        }

        System.out.println(totalSum);

        int totalSumByReduce = Arrays.stream(array).reduce(0, (acc, el) -> acc + el);
        System.out.println(totalSumByReduce);
    }
}
