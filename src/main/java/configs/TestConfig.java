package configs;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:configs/test.properties")
public interface TestConfig extends Config {

    String baseUrl();

    int timeout();

    int pageLoadTimeout();

    String browserSize();

    String browser();

    boolean headless();
}
