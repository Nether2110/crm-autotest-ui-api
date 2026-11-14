package crm.ru.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ViewUserPage extends BasePage {
    private final SelenideElement userName = $x("//div[@data-name = 'userName' and @class='field']");

    public String getUserName() {
        return getText(userName);
    }
}


