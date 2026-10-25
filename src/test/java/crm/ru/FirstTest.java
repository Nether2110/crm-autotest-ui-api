package crm.ru;

import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class FirstTest {
    @BeforeAll
        public static void setup(){
        Configuration.baseUrl = "http://localhost:8080/";
        Configuration.timeout = 60_000;
        Configuration.pageLoadTimeout = 30_000;
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "chrome";

    }
    @Test
    public void test() {
        Selenide.open("");
        $("#field-userName").setValue("admin");
        $x("//input[@id='field-password']").setValue("admin");
        $x("//button[text()='Log in']").click();
//       элемент с урока не появлялся на низком разрешении при перерисовке прилаги, уточнить
        $("a.notifications-button").should(Condition.visible.because("Главная страница не открылась"));
        $("#nav-menu-dropdown").click();
        $x("//uL[@role='menu']//a[contains(@href,'User/view')]").should(Condition.visible).click();
        String actualText = $x("//div[@data-name = 'userName' and @class='field']").getText();
        Assertions.assertEquals("admin", actualText, "User Name не равен ожидаемому");

    }

    @AfterAll
    public static void close(){
        Selenide.closeWebDriver();
    }

}
