package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static browsers.BrowserChrome.getDriver;
import static configs.ConfigData.getUrl;

public class BaseTest {

    @BeforeEach
    public void setUp() {
        getDriver().navigate().to(getUrl());
    }

    @AfterEach
    public void tearDown() {
        getDriver().quit();
    }
}
