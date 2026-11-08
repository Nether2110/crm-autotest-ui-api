package crm.ru.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public abstract class BaseTest {

    @BeforeAll
    public static void setup() {
        Configuration.baseUrl = "http://localhost:8080/";
        Configuration.timeout = 10_000;
        Configuration.pageLoadTimeout = 30_000;
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "chrome";
    }

    @AfterAll
    public static void close() {
        Selenide.closeWebDriver();
    }
}
