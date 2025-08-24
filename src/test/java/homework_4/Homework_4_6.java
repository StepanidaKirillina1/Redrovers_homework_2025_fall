package homework_4;

import java.util.Arrays;

public class Homework_4_6 {
    /*
    Дан массив:
    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    необходимо вывести сумму всех значений массива.
     */

    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        int sumByReduce = Arrays.stream(array).reduce(0, (acc, val) -> acc + val);

        System.out.println(sum);
        System.out.println(sumByReduce);
    }
}
