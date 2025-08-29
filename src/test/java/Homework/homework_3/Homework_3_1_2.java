package Homework.homework_3;

public class Homework_3_1_2 {
    /*
    Необходимо создать две целочисленные переменные (a, b),
    присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
●	maybe a and b are even - если сумма переменных четная
●	some variable is odd - если сумма переменных нечетная

     */

    public static void main(String[] args) {
        int a = 6;
        int b = 15;

        if ((a + b) % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }
    }
}
