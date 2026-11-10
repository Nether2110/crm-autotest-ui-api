package crm.ru.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public abstract class BasePage {

    protected String getText(SelenideElement element) {
        return element.shouldNotBe(Condition.empty).getText();
    }
}
