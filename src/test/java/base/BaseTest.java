package base;

import com.codeborne.selenide.Selenide;
import common.CommonActions;
import common.Listener;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.base.BasePage;
import pages.loans.CarLoansPage;
import pages.telecomunications.MobilePhoneReplenishmentPage;

import java.io.File;
import java.time.LocalTime;
import java.util.Objects;

import static common.Config.*;

@ExtendWith(Listener.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseTest.class);


    /** Cleaning allure results and screenshots from previous builds */
    static {
        LOGGER.info("START TIME:" + LocalTime.now());
        LOGGER.info("Start clear reports dir: build/reports...");
        File allureResults = new File("allure-results");
        if(allureResults.isDirectory()) {
            for (File item : Objects.requireNonNull(allureResults.listFiles()))
                item.delete();
        }
        if(CLEAR_REPORTS_DIR) {
            File allureScreenshots = new File("build/reports/tests");
            for (File item : Objects.requireNonNull(allureScreenshots.listFiles()))
                item.delete();
        }
    }

    @AfterEach
    public void clearCookiesAndLocalStorage() {
      clearCookiesAndLocalStorage();
    }
}
