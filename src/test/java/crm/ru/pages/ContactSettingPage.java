package crm.ru.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ContactSettingPage extends BasePage {

    private final SelenideElement contactName = $("div.field[data-name='name']");

    public String getContactName() {
        return getText(contactName);
    }
}
