package forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static browsers.BrowserChrome.getDriver;
import static configs.ConfigData.getDelayTime;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class MainPage {

    private final WebElement emailTextBox;

    public MainPage() {
        visibilityOf(getDriver().findElement(By.className("webim_button")));
        emailTextBox = getDriver().findElement(By.xpath("//input[@class = 'form-input']"));
    }

    public void scrollToEmailTextBox() {
        new Actions(getDriver())
            .scrollToElement(emailTextBox)
            .perform();
        }

    public void insertEmailIntoEmailTextBox(String email) {
        emailTextBox.sendKeys(email);
    }

    public void pressButton() {
        getDriver().findElement(By.xpath("//button[@class = 'button button--primary is-icon-only']")).submit();
    }

    public void waitPageReload() {
        WebElement loadingElement = getDriver().findElement(By.xpath("//*[@id='top-offers-phones']/div/div/div[1]"));
        new WebDriverWait(getDriver(), Duration.ofSeconds(getDelayTime())).
        until(d ->  loadingElement.getAttribute("class").contains("hidden"));
    }

    public boolean isSubscriptionSuccessful() {
        return getDriver().findElement(By.xpath("//div[@class= 'iziToast-texts']")).isDisplayed();
    }
}
