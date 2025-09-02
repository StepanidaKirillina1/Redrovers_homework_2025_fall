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
//        String str = """
//            I'm just 16,
//            going on	17!
//        """;

        String str = "I'm just 16,\n" +
                "            going on\t17!";

        String capitalVowels = "AEIOUY";
        String smallVowels = "aeiouy";
        String capitalConsonants = "BCDFGHJKLMNPQRSTVWXZ";
        String smallConsonants = "bcdfghjklmnpqrstvwxz";
        String numbers = "0123456789";
        String punctuationMarks = "!\"#$%&'()*+,-./:;<=>?@[\\]^_{|}~";
        String whitespaceCharacters = " " + "\n" + "\t" + "\f";

        int capitalVowelsCounter = 0;
        int smallVowelsCounter = 0;
        int capitalConsonantsCounter = 0;
        int smallConsonantsCounter = 0;
        int numbersCounter = 0;
        int punctuationMarksCounter = 0;
        int whitespaceCharactersCounter = 0;

        for (char character : str.toCharArray()) {
            String strChar = String.valueOf(character);
            if (capitalVowels.contains(strChar)) {
                capitalVowelsCounter++;
            }

            if (smallVowels.contains(strChar)) {
                smallVowelsCounter++;
            }

            if (capitalConsonants.contains(strChar)) {
                capitalConsonantsCounter++;
            }

            if (smallConsonants.contains(strChar)) {
                smallConsonantsCounter++;
            }

            if (numbers.contains(strChar)) {
                numbersCounter++;
            }

            if (punctuationMarks.contains(strChar)) {
                punctuationMarksCounter++;
            }

            if (whitespaceCharacters.contains(strChar)) {
                whitespaceCharactersCounter++;
            }
        }

        System.out.printf("The number of capital characters is %d", capitalConsonantsCounter + capitalVowelsCounter);
        System.out.println();
        System.out.printf("The number of small characters is %d", smallVowelsCounter + smallConsonantsCounter);
        System.out.println();
        System.out.printf("The number of vowels is %d", smallVowelsCounter + capitalVowelsCounter);
        System.out.println();
        System.out.printf("The number of consonants is %d", capitalConsonantsCounter + smallConsonantsCounter);
        System.out.println();
        System.out.printf("The number of numbers is %d", numbersCounter);
        System.out.println();
        System.out.printf("The number of punctuation marks is %d", punctuationMarksCounter);
        System.out.println();
        System.out.printf("The number of white space characters is %d", whitespaceCharactersCounter);
        System.out.println();
    }
}
