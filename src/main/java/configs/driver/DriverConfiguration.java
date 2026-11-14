package configs.driver;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import configs.ConfigsProvider;

public class DriverConfiguration {

    public static void setup() {
        Configuration.baseUrl = ConfigsProvider.TEST_CONFIG.baseUrl();
        Configuration.timeout = ConfigsProvider.TEST_CONFIG.timeout();
        Configuration.pageLoadTimeout = ConfigsProvider.TEST_CONFIG.pageLoadTimeout();
        Configuration.browserSize = ConfigsProvider.TEST_CONFIG.browserSize();
        Configuration.browser = ConfigsProvider.TEST_CONFIG.browser();
        Configuration.headless = ConfigsProvider.TEST_CONFIG.headless();
    }

    public static void close() {
        Selenide.closeWebDriver();
    }
}
