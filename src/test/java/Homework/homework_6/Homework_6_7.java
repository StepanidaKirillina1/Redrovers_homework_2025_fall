package Homework.homework_6;

import java.util.Scanner;

public class Homework_6_7 {
    /*
    Напишите код, который будет проверять, насколько трудно подобрать пароль.
    Чтобы пройти проверку, пароль должен быть не менее 8 символов, содержать как минимум:
    заглавную латинскую букву
    строчную латинскую букву
    цифру
    знак препинания из списка: ~@#$%^&*()_-+=
    и не иметь пробелов и символов НЕ упомянутых в этом перечислении.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        do {
            System.out.println("Please enter the password");
            password = scanner.nextLine();

            if (password.isEmpty()) {
                System.out.println("The password cannot be empty");
                continue;
            }

            if (password.length() >= 8 && verifyPassword(password)) {
                System.out.println("The password is valid");
                break;
            } else {
                System.out.println("password is not valid");
            }
        } while (true);
    }

    public static boolean verifyPassword(String password) {
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String punctuationMarks = "~@#$%^&*()_-+=";
        String allowedCharacters = capitalLetters + lowerLetters + numbers + punctuationMarks;

        boolean hasCapitalLatinLetter = false;
        boolean hasLowerLatinLetter = false;
        boolean hasDigit = false;
        boolean hasPunctuationMark = false;

        for (int i = 0; i < password.length(); i++) {
            char currentElement = password.charAt(i);

            if (allowedCharacters.indexOf(currentElement) == -1) {
                System.out.println("smth went wrong here");
                return false;
            }

            if (password.contains(" ")) {
                return false;
            }

            if (Character.isWhitespace(currentElement)) {
                return false;
            }

            if (capitalLetters.indexOf(currentElement) != -1) {
                hasCapitalLatinLetter = true;
            }

            if (lowerLetters.indexOf(currentElement) != -1) {
                hasLowerLatinLetter = true;
            }

            if (numbers.indexOf(currentElement) != -1) {
                hasDigit = true;
            }

            if (punctuationMarks.indexOf(currentElement) != -1) {
                hasPunctuationMark = true;
            }
        }

        return hasCapitalLatinLetter && hasLowerLatinLetter && hasDigit && hasPunctuationMark;
    }
}
