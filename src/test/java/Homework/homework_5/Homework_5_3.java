package Homework.homework_5;

public class Homework_5_3 {
    /*
    Дан массив:
    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    необходимо вывести минимальное значение массива.
     */

    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int minValue = Integer.MAX_VALUE;

        for (int number : array) {
            if (number < minValue) {
                minValue = number;
            }
        }

        System.out.println(minValue);
    }
}
