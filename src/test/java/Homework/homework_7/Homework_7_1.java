package Homework.homework_7;

import org.junit.jupiter.api.Assertions;

public class Homework_7_1 {
    /*
    Необходимо написать 4 метода:
    сложение 2х чисел
    вычитание 2х чисел
    умножение 2х чисел
    деление 2х чисел
     */

    public static void main(String[] args) {
        Assertions.assertEquals(3, getSum(1, 2));
        Assertions.assertEquals(10, getSubstraction(20, 10));
        Assertions.assertEquals(0, getMultiplication(0, 1));
        Assertions.assertEquals(5.5, getDivision(11, 2));
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static int getSubstraction(int a, int b) {
        return a - b;
    }

    public static int getMultiplication(int a, int b) {
        return a * b;
    }

    public static double getDivision(int a, int b) {
        return (double) a  / b;
    }
}
