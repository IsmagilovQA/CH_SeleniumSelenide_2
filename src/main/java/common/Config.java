package common;

import com.codeborne.selenide.Configuration;

public class Config {
    /**
     * Config to specify the browser for tests.
     *
     * Available the following options:
     * chrome
     * firefox
     * edge
     * ie
     * opera
     */
    public static final String BROWSER_NAME = "chrome";

    /** Config to clear browser cookies after each iteration */
    public static final Boolean CLEAR_COOKIES = true;

    /** Config to keep browser open after all scenario/tests */
    public static final Boolean HOLD_BROWSER_OPEN = false;

    /** Config to clear the 'build/reports/tests' dir with screenshots before starting the build */
    public static final Boolean CLEAR_REPORTS_DIR = true;

    static {
        Configuration.holdBrowserOpen = HOLD_BROWSER_OPEN;
        Configuration.reportsFolder = "build/reports/tests";
        Configuration.browser = BROWSER_NAME;
    }
}
