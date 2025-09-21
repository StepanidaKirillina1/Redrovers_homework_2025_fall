package homework.homework_11;

import org.apache.maven.shared.utils.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Homework_11_2_Test {
    /*
    Необходимо написать тесты для любого метода из подключенной библиотеки (можно использовать StringUtils)
    или можно написать свой метод и протестировать его.
    Тесты должны запускаться через TestNG.
    */

    @Test
    public void testRightPadMethod() {
        Assertions.assertEquals("Привет!!!!", StringUtils.rightPad("Привет", 10, "!"));
    }

    @Test
    public void testLeftPadMethod() {
        Assertions.assertEquals("!!!!Привет", StringUtils.leftPad("Привет", 10, "!"));
    }

    @Test
    public void testReverseMethod() {
        Assertions.assertEquals("olleH", StringUtils.reverse("Hello"));
    }
}
