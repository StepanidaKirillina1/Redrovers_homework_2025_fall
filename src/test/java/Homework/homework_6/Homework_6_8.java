package Homework.homework_6;

public class Homework_6_8 {
    /*
    0  1  2  3  4  5  6  7  8  9
    0  1  2  3  4  5  6  7  8
    0  1  2  3  4  5  6  7
    0  1  2  3  4  5  6
    0  1  2  3  4  5
    0  1  2  3  4
    0  1  2  3
    0  1  2
    0  1
    0
     */

    public static void main(String[] args) {
        int rows = 9;
        for (int i = rows; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
