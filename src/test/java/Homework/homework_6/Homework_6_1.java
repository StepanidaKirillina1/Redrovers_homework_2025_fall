package Homework.homework_6;

import java.util.Arrays;

public class Homework_6_1 {
    /*
    Вы ведете записи наивысшей дневной температуры.
    Найдите самый жаркий день.
    Найдите второй самый жаркий.
     */

    public static void main(String[] args) {
        int[] temperatures = {15, 12, 19, 55, 23, 28, 47, -1, 0, 57, 18};

        for (int i = 0; i < temperatures.length - 1; i++) {
            for (int j = i + 1; j < temperatures.length; j++) {
                if (temperatures[i] < temperatures[j]) {
                    int temp = temperatures[i];
                    temperatures[i] = temperatures[j];
                    temperatures[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(temperatures));
        System.out.println(temperatures[0]);
        System.out.println(temperatures[1]);
    }
}
