package homework_3;

public class Homework_3_3_3 {
    /*
    Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.

    Реализовать 2 варианта:
●	использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
●	без использования конструкции if (шаг цикла на ваше усмотрение).
     */

    public static void main(String[] args) {
        for (int i = 40; i <= 60; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("-------------");

        int i = 40;
        while (i <= 60) {
            System.out.println(i);
            i += 4;
        }
    }
}
