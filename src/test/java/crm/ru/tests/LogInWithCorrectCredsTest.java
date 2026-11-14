package crm.ru.tests;

import com.codeborne.selenide.Selenide;
import crm.ru.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogInWithCorrectCredsTest extends BaseTest {

    @Test
    public void test() {
        String actualText = Selenide.open("", LoginPage.class)
                .setUsernameInput("admin")
                .setPasswordInput("admin")
                .clickLoginButton()
                .clickOpenHeaderDropDown()
                .clickUserView()
                .getUserName();

        Assertions.assertEquals("admin", actualText, "User Name не равен ожидаемому");
    }
}
