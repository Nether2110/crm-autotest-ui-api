package configs;

import org.aeonbits.owner.ConfigFactory;

public class ConfigsProvider {
    public static final TestConfig TEST_CONFIG = ConfigFactory.create(TestConfig.class);
}
