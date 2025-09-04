package Homework.homework_7;

import static org.junit.jupiter.api.Assertions.*;

public class Homework_7_2 {

    public static void main(String[] args) {

        assertFalse(isLove(1, 1));
        assertTrue(isLove(0, 1));
        assertTrue(isLove(1, 0));

        assertEquals("5", numToString(5));
        assertEquals("0", numToString(0));
        assertEquals("-1", numToString(-1));

        assertEquals(-8, findSmallestInt(new int[]{78, 56, -2, 12, -8}));
        assertEquals(Integer.MIN_VALUE, findSmallestInt(new int[]{Integer.MIN_VALUE, -666}));
        assertEquals(Integer.MIN_VALUE, findSmallestInt(new int[]{666, Integer.MIN_VALUE}));

        assertEquals("1 sheep...", countingSheep(1));
        assertEquals("1 sheep...2 sheep...", countingSheep(2));
    }

    //https://www.codewars.com/kata/555086d53eac039a2a000083/train/java

    public static boolean isLove(final int flower1, final int flower2) {
        return (flower1 + flower2) % 2 != 0;
    }

    //https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/java

    public static String numberToString(int num) {
        return num + "";
    }

    public static String numToString(int num) {
        return String.valueOf(num);
    }

    // https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java

    public static int findSmallestInt(int[] args) {
        int minimumValue = Integer.MAX_VALUE;

        for (int number : args) {
            if (number < minimumValue) {
                minimumValue = number;
            }
        }

        return minimumValue;
    }

    //https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java

    public static String countingSheep(int num) {
        if (num > 0) {
            String result = "";
            for (int i = 0; i < num; i++) {
                result += String.format("%d sheep...", i + 1);
            }

            return result;
        }

        return "";
    }
}
