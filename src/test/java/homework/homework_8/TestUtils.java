package homework.homework_8;

import org.junit.jupiter.api.Assertions;

public class TestUtils {
    /*
    Написать статический метод, превращающий натуральное (целое положительное) число (например, 643) в строку,
    состоящую из названий цифр этого числа (например, “шесть четыре три”).
     */

    public static String getNumberInString(int number) {
        if (number ==0 ) {
            throw new IllegalArgumentException("the number should be greater than 0");
        }

        String numberInString = String.valueOf(number);
        String result = "";

        for (char character : numberInString.toCharArray()) {
            switch (character) {
                case '0':
                    result += "ноль ";
                    break;

                case '1':
                    result += "один ";
                    break;

                case '2':
                    result += "два ";
                    break;

                case '3':
                    result += "три ";
                    break;

                case '4':
                    result += "четыре ";
                    break;

                case '5':
                    result += "пять ";
                    break;

                case '6':
                    result += "шесть ";
                    break;

                case '7':
                    result += "семь ";
                    break;

                case '8':
                    result += "восемь ";
                    break;

                case '9':
                    result += "девять ";
                    break;

                default:
                    throw new IllegalArgumentException("please enter a valid number between 0 and 9");
            }
        }


        return result.trim();
    }

    public static void main(String[] args) {

        Assertions.assertEquals("шесть четыре три", getNumberInString(643));
        Assertions.assertEquals("один", getNumberInString(1));
    }
}
