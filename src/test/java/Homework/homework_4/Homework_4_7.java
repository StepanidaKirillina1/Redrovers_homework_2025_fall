package Homework.homework_4;

import java.util.Arrays;

public class Homework_4_7 {
    /*
    Имеется 20 коробок спичек.
    Найти все коробки, количество спичек в которых отличается от среднего количества больше, чем на 3.
    Например, если есть следующие данные:
    60, 59, 58, 59, 64, 60,
    то среднее количество будет чуть меньше 60.
    Соответственно, коробка с 64 спичками будет сильно отличаться от среднего.
     */

    public static void main(String[] args) {
        int[] array = {60, 59, 58, 59, 64, 60};
        int sum = Arrays.stream(array).reduce(0, (acc, val) -> acc + val);
        int average = sum / (array.length);

        for (int number : array) {
            if (number > average + 3 || number < average - 3) {
                System.out.println(number);
            }
        }
    }
}
