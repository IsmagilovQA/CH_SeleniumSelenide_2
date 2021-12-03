package pages.telecomunications;

import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class MobilePhoneReplenishmentPage extends BasePage {

    private final SelenideElement walletBtn = $x("//div[@data-qa-node='debitSourceSource']"),
            cardNumberInput = $x("//input[@data-qa-node='numberdebitSource']"),
            expireDateInput = $x("//input[@data-qa-node='expiredebitSource']"),
            cvvCodeInput = $x("//input[@data-qa-node='cvvdebitSource']"),
            amountInput = $x("//input[@data-qa-node='amount']"),
            addToCartBtn = $x("//button[@data-qa-node='submit']"),
            phoneNumberInput = $x("//input[@data-qa-node='phone-number']"),
            paymentDetails = $x("//div[@data-qa-node='details']");

    /**
     * Clicking on Wallet link
     * @return
     */
    public MobilePhoneReplenishmentPage selectCardFromWallet() {
        walletBtn.click();
        return this;
    }

    /**
     * Typing bank card number
     * @param cardNumber bank card number
     * @return
     */
    public MobilePhoneReplenishmentPage typeCardNumber(String cardNumber) {
        clearAndType(cardNumberInput, cardNumber);
        return this;
    }

    /**
     * Typing expired date for a card
     * @param expDate expired date
     * @return
     */
    public MobilePhoneReplenishmentPage typeExpireDate(String expDate) {
        clearAndType(expireDateInput, expDate);
        return this;
    }

    /**
     * Type CVV secret code
     * @param code CVV code
     * @return
     */
    public MobilePhoneReplenishmentPage typeCvvCode(String code) {
        clearAndType(cvvCodeInput, code);
        return this;
    }

    /**
     * Type Amount of money
     * @param amount
     * @return
     */
    public MobilePhoneReplenishmentPage typeAmount(String amount) {
        clearAndType(amountInput, amount);
        return this;
    }

    /**
     * Type mobile phone number excluding country code
     * @param phoneNumber mobile phone
     * @return
     */
    public MobilePhoneReplenishmentPage typePhoneNumber(String phoneNumber) {
        clearAndType(phoneNumberInput, phoneNumber);
        return this;
    }

    /** Clicking Add to Cart button to submit */
    public MobilePhoneReplenishmentPage addToCart() {
        addToCartBtn.shouldBe(visible).click();
        return this;
    }

    /**
     * Check the card number and recipient
     * @param cardNumber
     * @param recipient
     * @return
     */
    public MobilePhoneReplenishmentPage checkPaymentCardAndRecipient(String cardNumber, String recipient) {
        checkMessage(cardNumber);
        checkMessage(recipient);
        return this;
    }

    /**
     * Check the amount and commission
     * @param amount
     * @param commission
     * @return
     */
    public MobilePhoneReplenishmentPage checkPaymentAmountAndCommission(String amount, String commission) {
        checkMessage(amount);
        checkMessage(commission);
        return this;
    }

    /**
     * Check currency and fee
     * @param currencyAmount
     * @param feeAmount
     * @return
     */
    public MobilePhoneReplenishmentPage checkPaymentCurrencyAndFee(String currencyAmount, String feeAmount) {
        checkMessage(currencyAmount);
        checkMessage(feeAmount);
        return this;
    }

    /**
     * Check payment details text
     * @return
     */
    public MobilePhoneReplenishmentPage checkPaymentDetailsIsPresentInTheCart() {
        String text = paymentDetails.getText();
        checkMessage(text);
        return this;
    }
}
