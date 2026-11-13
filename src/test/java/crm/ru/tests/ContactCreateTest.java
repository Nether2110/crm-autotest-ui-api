package crm.ru.tests;

import com.codeborne.selenide.Selenide;
import crm.ru.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactCreateTest extends BaseTest {
    @Test

    public void ContactCreate() {
        String actualText = Selenide.open("", LoginPage.class)
                .setUsernameInput("admin")
                .setPasswordInput("admin")
                .clickLoginButton()
                .contactLink()
                .clickCreateContactButton()
                .setLastNameInput("qwert")
                .clickSaveButton()
                .getContactName();

        Assertions.assertEquals("qwert", actualText, "User Name не равен ожидаемому");
    }
}
