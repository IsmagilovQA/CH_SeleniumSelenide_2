package pages.loans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class CarLoansPage extends BasePage {

    public CarLoansPage(WebDriver driver) {
        super(driver);
    }

    private final By agreementTab = By.xpath("//div[contains(text(), 'Договори')]");


    public CarLoansPage selectAgreementTab() {
        driver.findElement(agreementTab).click();
        return this;
    }
}
