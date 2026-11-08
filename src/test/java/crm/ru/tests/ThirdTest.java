package crm.ru.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ThirdTest extends BaseTest {

    @Test
    public void test() {
        Selenide.open("");
        $("#field-userName").setValue("admin");
        $x("//input[@id='field-password']").setValue("admin1");
        $x("//button[text()='Log in']").click();
        $("#notification").shouldNotBe(Condition.empty);
        String actualText = $("#notification").getText();
        Assertions.assertEquals("Wrong username/password", actualText);
    }
}
