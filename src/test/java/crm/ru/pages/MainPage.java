package crm.ru.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    private final SelenideElement openHeaderDropDown = $("#nav-menu-dropdown").as("Три точки в хедере");
    private final SelenideElement userViewBtn = $x("//uL[@role='menu']//a[contains(@href,'User/view')]");

    public MainPage() {
        $("a.notifications-button").should(Condition.visible.because("Главная страница не открылась"));
    }

    public MainPage clickOpenHeaderDropDown() {
        openHeaderDropDown.click();
        return this;
    }

    public ViewUserPage clickUserView() {
        userViewBtn.should(Condition.and("Поле доступно", Condition.visible, Condition.enabled)).click();
        return new ViewUserPage();
    }
}
