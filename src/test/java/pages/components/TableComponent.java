package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class TableComponent {
    private final SelenideElement tableResult = $(".table-responsive");


    public void  checkResult (String key, String value) {
        tableResult.$(byText(key)).parent().shouldHave(text(value));
    }

}
