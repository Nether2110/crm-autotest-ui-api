package crm.ru.tests;

import com.codeborne.selenide.Selenide;
import crm.ru.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmptyUsernameTest extends BaseTest {

    @Test

    public void testEmptyUsername() {
        String actualText = Selenide.open("", LoginPage.class)
                .setPasswordInput("admin")
                .clickLoginButtonWithWrongCred()
                .getErrorTextFromUsernameEmptyNotification();

        Assertions.assertTrue(actualText.contains("Username can not be empty"));
    }
}


