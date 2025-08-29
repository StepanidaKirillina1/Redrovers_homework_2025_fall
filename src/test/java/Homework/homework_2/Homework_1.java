package Homework.homework_2;

public class Homework_1 {
    /*
    Необходимо создать целочисленные переменные a и b,
    присвоить произвольные значения переменным на ваш выбор
    и вывести результаты следующих операций с этими переменными: сложение, умножение, вычитание, деление и остаток от деления.
    Также сделать проверку на четность этих переменных и вывести результат.
    */

    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a % b);

        if (a % 2 == 0) {
            System.out.printf("%d четное ", a);
        } else {
            System.out.printf("%d нечетное ", a);
        }

        if (b % 2 == 0) {
            System.out.printf("%d четное ", b);
        } else {
            System.out.printf("%d нечетное ", b);
        }
    }
}
