package Homework.homework_4;

public class Homework_4_1 {
    /*
    Дан массив:
    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    необходимо вывести все нечетные числа из массива.
     */

    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for (int number : array) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }
}
