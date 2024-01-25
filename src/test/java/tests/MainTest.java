package tests;

import forms.MainPage;
import org.junit.jupiter.api.Test;

import static configs.TestData.getEmail;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest extends BaseTest {

    @Test
    public void test() {
        MainPage mainPage = new MainPage();
        mainPage.scrollToEmailTextBox();
        mainPage.insertEmailIntoEmailTextBox(getEmail());
        mainPage.pressButton();
        mainPage.waitPageReload();
        assertTrue(mainPage.isSubscriptionSuccessful());
    }
}
