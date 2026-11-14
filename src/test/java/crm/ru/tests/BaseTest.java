package crm.ru.tests;

import configs.driver.DriverConfiguration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public abstract class BaseTest {

    @BeforeAll
    public static void setup() {
        DriverConfiguration.setup();
    }

    @AfterAll
    public static void close() {
        DriverConfiguration.close();
    }
}
