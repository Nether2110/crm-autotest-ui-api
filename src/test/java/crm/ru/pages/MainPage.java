package crm.ru.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage extends BasePage {

    private final SelenideElement openHeaderDropDown = $("#nav-menu-dropdown").as("Три точки в хедере");
    private final SelenideElement userViewButton = $x("//uL[@role='menu']//a[contains(@href,'User/view')]");
    private final SelenideElement logOutButton = $x("//ul[@role='menu']//a[@data-name='logout']");


    public MainPage() {
        $("a.notifications-button").should(Condition.visible.because("Главная страница не открылась"));
    }

    public MainPage clickOpenHeaderDropDown() {
        openHeaderDropDown.click();
        return this;
    }

    public ViewUserPage clickUserView() {
        userViewButton.should(Condition.and("Поле доступно", Condition.visible, Condition.enabled)).click();
        return new ViewUserPage();
    }

    public LoginPage clickLogOutButton() {
        logOutButton.should(Condition.visible).click();
        return new LoginPage();
    }
}
