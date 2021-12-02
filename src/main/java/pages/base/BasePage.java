package pages.base;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class BasePage {

    private final SelenideElement authWidget = $x("//iframe[@src='https://login-widget.privat24.ua/']");

    /**
     * The method for navigating to specific URL
     * @param url URL
     */
    public void goToUrl(String url) {
        open(url);
    }

    /**
     * Cleaning the element input before typing new value
     * @param element SelenideElement
     * @param value   text
     */
    public void clearAndType(SelenideElement element, String value) {
        while (!element.getAttribute("value").equals("")) element.sendKeys(Keys.BACK_SPACE);
        element.setValue(value);
    }

    /** Checks that auth frame is visible */
    public void isAuthWidgetPresent() {
        this.authWidget.shouldBe(visible);
    }
}
