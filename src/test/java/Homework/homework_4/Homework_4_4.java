package Homework.homework_4;

public class Homework_4_4 {
    /*
    Дана строка:
    String s = “Перестановочный алгоритм быстрого действия”;
    необходимо вывести все буквы “о” из этой строки.
    Для указанной строки ответ будет “ооооо” (или в столбик)
     */

    public static void main(String[] args) {
        String s = "Перестановочный алгоритм быстрого действия";

        for (char c : s.toCharArray()) {
            if (c == 'о') {
                System.out.print(c);
            }
        }
    }
}
