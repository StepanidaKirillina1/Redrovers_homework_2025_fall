package Homework.homework_9;

// https://www.codewars.com/kata/577bd8d4ae2807c64b00045b/train/java

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    public static void main(String[] args) {
        assertEquals(
                "Lew", FighterUtils.declareWinner(new Fighter("Lew", 10, 2),
                new Fighter("Harry", 5, 4),
                "Lew"));

        assertEquals("Harry", FighterUtils.declareWinner(
                new Fighter("Lew", 10, 2),
                new Fighter("Harry", 5, 4),
                "Harry"));

        assertEquals("Harald", FighterUtils.declareWinner(
                new Fighter("Harald", 20, 5),
                new Fighter("Harry", 5, 4),
                "Harry"));
    }
}
