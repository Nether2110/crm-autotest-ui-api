package crm.ru.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    private final SelenideElement usernameInp = $("#field-userName");
    private final SelenideElement passwordInp = $x("//input[@id='field-password']");
    private final SelenideElement loginBtn = $x("//button[text()='Log in']");

    public LoginPage setUsername(String usernameVal) {
        usernameInp.setValue(usernameVal);
        return this;
    }

    public LoginPage setPassword(String passwordVal) {
        passwordInp.setValue(passwordVal);
        return this;
    }

    public MainPage clickLoginBtn() {
        loginBtn.click();
        return new MainPage();
    }
}
