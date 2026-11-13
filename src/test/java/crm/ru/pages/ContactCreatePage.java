package crm.ru.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ContactCreatePage extends BasePage {


    private final SelenideElement lastNameInput = $("input[data-name='lastName']");
    private final SelenideElement saveButton = $("button[data-action='save']");

    public ContactCreatePage setLastNameInput(String lastNameValue) {
        lastNameInput.setValue(lastNameValue);
        return this;
    }

    public ContactSettingPage clickSaveButton() {

        saveButton.click();
        return new ContactSettingPage();
    }
}
