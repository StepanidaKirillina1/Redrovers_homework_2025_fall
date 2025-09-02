package Homework.homework_6;

import java.util.Arrays;

public class Homework_6_5 {
    /*
    Возьмите массив из предыдущей задачи, или любой другой квадратный массив (матрицу).
    Зеркально преобразуйте его вокруг диагонали от верхнего левого до нижнего правого угла.
    Например, если был массив
        3 5 7
        1 4 6
        9 2 8

    то после преобразования он должен выглядеть так:
        3 1 9
        5 4 2
        7 6 8
     */

    public static void main(String[] args) {
        int[][] array = {
                {3, 5, 7},
                {1, 4, 6},
                {9, 2, 8}
        };

        int[][] result = new int[3][3];

        /*
        00 01 02          00 10 20
        10 11 12          01 11 21
        20 21 22          02 12 22
         */

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                result[i][j] = array[j][i];
            }

            System.out.println(Arrays.toString(result[i]));
        }
    }
}
