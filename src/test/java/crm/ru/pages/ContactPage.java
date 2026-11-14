package crm.ru.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ContactPage extends BasePage {

    private final SelenideElement createContactButton = $("a[data-action='create'][href='#Contact/create']");


    public ContactCreatePage clickCreateContactButton() {
        createContactButton.should(Condition.visible).click();
        return new ContactCreatePage();
    }
}
