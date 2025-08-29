package Homework.homework_5;

public class Homework_5_4 {
    /*
    Дан массив:
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    необходимо вывести среднее арифметическое всех значений массива.
     */

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int sum = 0;
        for (int number : array) {
            sum += number;
        }

        double average = sum * 1.0 / array.length;

        System.out.println(average);
    }
}
