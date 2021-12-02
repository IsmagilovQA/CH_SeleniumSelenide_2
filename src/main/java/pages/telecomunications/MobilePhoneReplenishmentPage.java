package pages.telecomunications;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class MobilePhoneReplenishmentPage extends BasePage {

    public MobilePhoneReplenishmentPage(WebDriver driver) {
        super(driver);
    }

    private final By walletBtn = By.xpath("//div[@data-qa-node='debitSourceSource']"),
            cardNumberInput = By.xpath("//input[@data-qa-node='numberdebitSource']"),
            expireDateInput = By.xpath("//input[@data-qa-node='expiredebitSource']"),
            cvvCodeInput = By.xpath("//input[@data-qa-node='cvvdebitSource']"),
            amountInput = By.xpath("//input[@data-qa-node='amount']"),
            addToCartBtn = By.xpath("//button[@data-qa-node='submit']"),
            phoneNumberInput = By.xpath("//input[@data-qa-node='phone-number']"),
            paymentDetails = By.xpath("//div[@data-qa-node='details']");


    /**
     * Clicking on Wallet link
     * @return
     */
    public MobilePhoneReplenishmentPage selectCardFromWallet() {
        driver.findElement(walletBtn).click();
        return this;
    }

    /**
     * Typing bank card number
     * @param cardNumber bank card number
     * @return
     */
    public MobilePhoneReplenishmentPage typeCardNumber(String cardNumber) {
        driver.findElement(cardNumberInput).sendKeys(cardNumber);
        return this;
    }

    /**
     * Typing expired date for a card
     * @param expDate expired date
     * @return
     */
    public MobilePhoneReplenishmentPage typeExpireDate(String expDate) {
        driver.findElement(expireDateInput).sendKeys(expDate);
        return this;
    }

    /**
     * Type CVV secret code
     * @param code CVV code
     * @return
     */
    public MobilePhoneReplenishmentPage typeCvvCode(String code) {
        driver.findElement(cvvCodeInput).sendKeys(code);
        return this;
    }

    /**
     * Type Amount of money
     * @param amount
     * @return
     */
    public MobilePhoneReplenishmentPage typeAmount(String amount) {
        driver.findElement(amountInput).sendKeys(amount);
        return this;
    }

    /**
     * Type mobile phone number excluding country code
     * @param phoneNumber mobile phone
     * @return
     */
    public MobilePhoneReplenishmentPage typePhoneNumber(String phoneNumber) {
        driver.findElement(phoneNumberInput).sendKeys(phoneNumber);
        return this;
    }

    /**
     * Clicking Add to Cart button to submit
     */
    public MobilePhoneReplenishmentPage addToCart() {
        driver.findElement(addToCartBtn).click();
        return this;
    }

    /**
     * @param expectedText expected text
     * @return
     */
    public MobilePhoneReplenishmentPage checkPaymentDetailsIsPresentInTheCart(String expectedText) {
        waitElementIsVisible(driver.findElement(paymentDetails));
        WebElement details = driver.findElement(paymentDetails);
        Assertions.assertEquals(expectedText, details.getText());
        return this;
    }
}
