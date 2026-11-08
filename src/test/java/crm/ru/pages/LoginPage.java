package crm.ru.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    private final SelenideElement usernameInput = $("#field-userName");
    private final SelenideElement passwordInput = $x("//input[@id='field-password']");
    private final SelenideElement loginButton = $x("//button[text()='Log in']");
    private final SelenideElement wrongCredNotification = $("#notification");
    private final SelenideElement emptyUsernameNotification = $x("//div[contains(@class, 'popover-content') and text()='Username can not be empty']\n");


    public LoginPage setUsernameInput(String usernameValue) {
        usernameInput.setValue(usernameValue);
        return this;
    }

    public LoginPage setPasswordInput(String passwordValue) {
        passwordInput.setValue(passwordValue);
        return this;
    }

    public MainPage clickLoginButton() {
        loginButton.click();
        return new MainPage();
    }

    //при обычном логинбаттон клике мы ожидали перехода на мейнпейдж, и не попадали туда, тесты падали
    public LoginPage clickLoginButtonWithWrongCred() {
        loginButton.click();
        return this;
    }

    public String getErrorTextFromWrongCredNotification() {
        return wrongCredNotification.shouldNotBe(Condition.empty).getText();
    }

    public String getErrorTextFromUsernameEmptyNotification() {
        return emptyUsernameNotification.shouldNotBe(Condition.empty).getText();
    }

    public boolean isLoginButtonVisible() {
        return loginButton.shouldBe(Condition.visible).isDisplayed();
    }
}
