package Homework.homework_3;

public class Homework_3_1_1 {
    /*
    Необходимо создать две целочисленные переменные (a, b),
    присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
●	a == b - если переменные равны
●	a < b - если переменная a меньше b
●	a > b - если переменная b меньше a

     */

    public static void main(String[] args) {
        int a = 5;
        int b = 15;

        if (a == b) {
            System.out.println("a == b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a > b");
        }
    }
}
