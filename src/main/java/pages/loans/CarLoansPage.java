package pages.loans;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class CarLoansPage extends BasePage {

    private final SelenideElement agreementTab = $x("//div[contains(text(), 'Договори')]");


    public CarLoansPage selectAgreementTab() {
        agreementTab.shouldBe(visible).click();
        return this;
    }
}
