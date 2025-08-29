package Homework.homework_4;

public class Homework_4_2 {
    /*
    Дан массив:
    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    необходимо вывести все значения массива больше 5.
     */

    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for (int number : array) {
            if (number > 5) {
                System.out.println(number);
            }
        }
    }
}
