package homework.homework_16;

import java.util.ArrayList;
import java.util.List;

public class Homework_16 {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.addAll(List.of("White", "Tan", "Yellow", "Orange", "Red", "Pink", "Purple", "Blue"));

        colors.removeIf(color -> color.toLowerCase().contains("l"));

        List<Integer> numbers = new ArrayList<>();
        for (int i = 100; i <= 1000; i++) {
            numbers.add(i);
        }

        numbers.removeIf(number -> number % 2 == 0);

        /*
        Попробуйте изменить тип итерационной переменной из цикла в третьей задаче, на Integer (не int, а Integer)
        и добиться такого же результата как и с типом int.
         */

        Integer i = 100;
        for (int prim = i; prim <= 1000; prim++) {
            numbers.add(prim);
        }
    }
}
