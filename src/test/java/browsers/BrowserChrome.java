package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.openqa.selenium.PageLoadStrategy.EAGER;

public class BrowserChrome {

    private static WebDriver driver;

    private BrowserChrome() {}

    public static WebDriver getDriver() {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            options.setPageLoadStrategy(EAGER);
            driver = new ChromeDriver(options);
        }
        return driver;
    }
}
