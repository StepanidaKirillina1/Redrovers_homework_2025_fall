package Homework.homework_5;

public class Homework_5_2 {
    /*
    Дан массив:
    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    необходимо вывести максимальное значение массива.
     */

    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int maxValue = Integer.MIN_VALUE;

        for (int number : array) {
            if (number > maxValue) {
                maxValue = number;
            }
        }

        System.out.println(maxValue);
    }
}
