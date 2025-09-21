package homework.homework_11;

import org.apache.maven.shared.utils.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Homework_11_1_Test {
    /*
    Необходимо найти и подключить в свой проект библиотеку, которая позволит вам “сокращать” (abbreviate) строки.

    Пример:
    есть строка: “Привет всем кто живет на луне!”, если мы хотим сократить эту строку до 10 символов,
    то у нас должен получится следующий результат- “Привет ...”,
    а если до 20, то результат будет таким - “Привет всем кто ж...”.

    Результат выполнения этого задания, юнит тест подключенного метода.
    */

    @Test
    public void testString() {
        String str = "Привет всем кто живет на луне!";

        Assertions.assertEquals("Привет все", StringUtils.left(str, 10));
        Assertions.assertEquals("Привет всем кто живе", StringUtils.left(str, 20));
    }
}
