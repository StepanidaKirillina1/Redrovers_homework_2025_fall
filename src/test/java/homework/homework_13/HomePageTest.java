package homework.homework_13;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePageTest {
    private WebDriver driver;
    public static final String BASE_URL = "https://www.saucedemo.com/";

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    @Test
    public void testHomePageTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.urlToBe(BASE_URL));

        Assertions.assertEquals("Swag Labs", driver.getTitle());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
