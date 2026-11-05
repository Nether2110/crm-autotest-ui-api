package crm.ru.tests;

import com.codeborne.selenide.Selenide;
import crm.ru.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WrongPasswordTest extends BaseTest {


    @Test
    public void testWrongPassword() {
        String actualText = Selenide.open("", LoginPage.class)
                .setUsernameInput("admin")
                .setPasswordInput("admin1")
                .clickLoginButtonWithWrongCred()
                .getErrorTextFromWrongCredNotification();
        Assertions.assertTrue(actualText.contains("Wrong"));
    }
}
