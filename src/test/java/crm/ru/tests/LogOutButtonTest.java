package crm.ru.tests;

import com.codeborne.selenide.Selenide;
import crm.ru.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogOutButtonTest extends BaseTest {


    @Test
    public void testLogOutButton() {
        boolean loginButtonVisible = Selenide.open("", LoginPage.class)
                .setUsernameInput("admin")
                .setPasswordInput("admin")
                .clickLoginButton()
                .clickOpenHeaderDropDown()
                .clickLogOutButton()
                .isLoginButtonVisible();

        Assertions.assertTrue(loginButtonVisible, "Пользователь должен быть перенаправлен на страницу авторизации");
    }
}
