package Homework.homework_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework_6_2 {
    /*
    У вас есть список адресов электронной почты.
    Найдите все адреса с доменом gmail.com.
    Адреса поддельных сайтов типа myrealgmail.com не учитывать.
    Найти самый короткий и самый длинный адреса.
    Проверить, нет ли адресов с юзернеймом admin
     */

    public static void main(String[] args) {
        String[] emails = {"admin@myrealgmail.com", "admin.supp0rt@gmail.com", "contact.admin@myrealgmail.com",

                "info.admin.services@gmail.com", "support-team@myrealgmail.com", "the.real.admin@gmail.com",

                "web-admin-office@myrealgmail.com", "admin.help.desk@gmail.com", "myreal-admin-account@gmail.com",

                "service.admin@myrealgmail.com" };

        int arrIndex = 0;
        int counter = 0;
        int longestAddress = Integer.MIN_VALUE;
        int longestAddressIndex = 0;
        int shortestAddress = Integer.MAX_VALUE;
        int shortestAddressIndex = 0;

        for (String email : emails) {
            if (email.contains("@gmail.com")) {
                counter++;
            }
        }

        String[] correctAddresses = new String[counter];
        for (String email : emails) {
            if (email.contains("@gmail.com")) {
                correctAddresses[arrIndex++] = email;
            }
        }

        System.out.println(Arrays.toString(correctAddresses));

        for (int i = 0; i < emails.length; i++) {
            if (emails[i].length() > longestAddress) {
                longestAddress = emails[i].length();
                longestAddressIndex = i;
            }
        }
        System.out.printf("the longest address is %s", emails[longestAddressIndex]);

        for (int i = 0; i < emails.length; i++) {
            if (emails[i].length() < shortestAddress) {
                shortestAddress = emails[i].length();
                shortestAddressIndex = i;
            }
        }

        System.out.println();
        System.out.printf("the shortest address is %s", emails[shortestAddressIndex]);

        boolean hasAdmin = false;

        for (String email : emails) {
            if (email.toLowerCase().contains("admin")) {
                hasAdmin = true;
            }
        }

        System.out.println();
        System.out.println(hasAdmin);

        // через список

        List<String> emailAddresses= new ArrayList<>(
                List.of("admin@myrealgmail.com", "admin.supp0rt@gmail.com", "contact.admin@myrealgmail.com",

                "info.admin.services@gmail.com", "support-team@myrealgmail.com", "the.real.admin@gmail.com",

                "web-admin-office@myrealgmail.com", "admin.help.desk@gmail.com", "myreal-admin-account@gmail.com",

                "service.admin@myrealgmail.com")
        );

        List<String> result = new ArrayList<>();

        for (String email : emailAddresses) {
            if (email.contains("@gmail.com")) {
                result.add(email);
            }
        }

        System.out.printf("The result list is %s", result);
    }
}
