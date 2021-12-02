package tests.simpleSelenideExample;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SelenideFirstTest {

    @Test
    public void test() {
        open("https://www.google.com/");
        $x("//input[@name='q']").setValue("ChromeDriver").pressEnter();
        $("#result-stats").shouldBe(visible);
    }
}
