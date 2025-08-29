package Homework.homework_3;

public class Homework_3_2_2 {
    /*
    Необходимо вывести все положительные степени числа 5 которые меньше 10000,
    вывести результат возведения в степень.
     */

    public static void main(String[] args) {

        for (int i = 5; i < 10000; i *= 5) {
            System.out.println(i);
        }

        // второе решение

        int number = 5;

        for (int i = 0; number < 10000; number *= 5) {
            System.out.println("5 в степени " + ++i + " = " + number);
        }
    }
}
