package Homework.homework_6;

public class Homework_6_6 {
    /*
    Дана строка:
    I’m just 16,
    going on	17!

    (перед 17 стоит Tab, а не пробел).
    В принципе,
    это может быть ЛЮБАЯ строка, содержащая латинские буквы в верхнем и нижнем регистре, цифры, знаки препинания.

    Найти, сколько в этой строке
    заглавных букв, сколько прописных, сколько гласных, сколько согласных, сколько цифр,
    сколько знаков препинания,
    сколько “пробельных” символов (в них входят пробелы, символы табуляции, перевод строки и пр.
    Поищите “whitespace characters”).

    Имейте в виду, что некоторые проверки можно делать легче, чем другие. Поэкспериментируйте.
     */

    public static void main(String[] args) {
        String str = """
        I'm just 16,
        going on 17!
        """;

        String strExample = "I'm just 16,\n" +
                "going on\t17!";

        System.out.println(getCounters(str));
        System.out.println("-----------");
        System.out.println(getCounters(strExample));
    }

    public static String getCounters(String str) {
        String capitalLetters = "AEIOUYBCDFGHJKLMNPQRSTVWXZ";
        String vowels = "aeiouy";

        int capitalLettersCounter = 0;
        int smallLettersCounter = 0;
        int vowelsCounter = 0;
        int consonantsCounter = 0;
        int numbersCounter = 0;
        int punctuationMarksCounter = 0;
        int whitespaceCharactersCounter = 0;

        for (char character : str.toCharArray()) {
            if (Character.isLetter(character)) {
                if (capitalLetters.indexOf(character) != -1) {
                    capitalLettersCounter++;
                } else {
                    smallLettersCounter++;
                }

                if (vowels.indexOf(Character.toLowerCase(character)) != -1) {
                    vowelsCounter++;
                } else {
                    consonantsCounter++;
                }
            } else if (Character.isDigit(character)) {
                numbersCounter++;
            } else if (Character.isWhitespace(character)) {
                whitespaceCharactersCounter++;
            } else {
                punctuationMarksCounter++;
            }
        }

        return ("This string <%s> has %d capital letter, %d small letters, %d vowels, %d consonants, %d numbers, " +
                "%d white spaces, %d punctuation marks")
                .formatted(str, capitalLettersCounter, smallLettersCounter, vowelsCounter, consonantsCounter,
                        numbersCounter, whitespaceCharactersCounter, punctuationMarksCounter);
    }
}
