package Homework.homework_6;

public class Homework_6_10 {
    /*
    9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
      8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
        7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
          6 5 4 3 2 1 0 1 2 3 4 5 6
            5 4 3 2 1 0 1 2 3 4 5
              4 3 2 1 0 1 2 3 4
                3 2 1 0 1 2 3
                  2 1 0 1 2
                    1 0 1
                      0
     */

    public static void main(String[] args) {
        int rows = 9;
        String str = "";

        for (int i = rows; i >= 0; i--) {
            str += " ".repeat(rows - i);

            for (int j = i; j >= 0; j--) {
                str += j;
            }

            for (int k = 1; k <= i; k++) {
                str += k;
            }

            str += "\n";
        }

        System.out.println(str);
    }
}
