package Homework.homework_6;

import java.util.Arrays;
import java.util.Random;

import static java.lang.Integer.parseInt;

public class Homework_6_3_6_4 {
    /*
    Создайте двумерный массив 5х5, заполните его какими-нибудь числами.
    Напечатайте его таким образом, чтобы он сохранял форматирование (колонки были выровнены),
    если числа в нем будут любыми от -999 до 9999.
     */

    public static void main(String[] args) {
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                array[i][j] = getRandomNumberBetweenMinus999And9999();
                int difference = 4 - String.valueOf(array[i][j]).length();
                array[i][j] = parseInt(array[i][j] + "0".repeat(difference));
            }

            System.out.println(Arrays.toString(array[i]));
        }


        /*
        Возьмите массив из предыдущей задачи, и выведите в одну строку все числа,
        лежащие на его диагонали от верхнего левого угла до нижнего правого.
        В другой строке — числа на на другой диагонали, от верхнего правого до нижнего левого углов.
        */

        // все числа, лежащие на его диагонали от верхнего левого угла до нижнего правого.

        for (int i = 0; i < array.length; i++) {
            for ( int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for ( int j = 0; j < array[i].length; j++) {
                System.out.print(array[j][i] + " ");
            }
        }

        System.out.println();

        // числа на на другой диагонали, от верхнего правого до нижнего левого углов.

        for (int i = 0; i < array.length; i++) {
            for ( int j = array[i].length - 1; j >= 0; j--) {
                System.out.print(array[i][j] + " ");
            }
        }
    }

    public static int getRandomNumberBetweenMinus999And9999() {
        Random random = new Random();

        int min = -999;
        int max = 9999;

        return random.nextInt(max - min + 1) + min;
    }
}
