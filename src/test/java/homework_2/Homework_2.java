package homework_2;

public class Homework_2 {
    /*
    Необходимо создать целочисленные переменные a и b, присвоить им произвольные значения,
    а потом поменять значения местами (значение переменной a должно оказаться в переменной b и наоборот).
    */

    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        int temp = a;
        a = b;
        b = temp;
    }
}
