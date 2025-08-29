package Homework.homework_5;

public class Homework_extra_1 {
    /*
    Дан массив:
    int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
    необходимо вывести сумму элементов массива.
     */

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int totalSum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                totalSum += array[i][j];
            }
        }

        System.out.println(totalSum);
    }
}
