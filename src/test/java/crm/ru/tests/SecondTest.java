package crm.ru.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SecondTest extends BaseTest {

    @Test
    public void test() {
        Selenide.open("");
        $("#field-userName").setValue("admin");
        $x("//input[@id='field-password']").setValue("admin");
        $x("//button[text()='Log in']").click();
        $("#nav-menu-dropdown").click();
        $x("//ul[@role='menu']//a[@data-name='logout']").should(Condition.visible).click();
        $x("//button[text()='Log in']").shouldBe(Condition.visible);
        Assertions.assertTrue($x("//button[text()='Log in']").isDisplayed(), "Пользователь должен быть перенаправлен на страницу авторизации");
    }
}
