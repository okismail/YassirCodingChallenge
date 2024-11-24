package tests.pages;

import Utilis.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;

public class OrderConfirmation extends TestBase {
    //=============================Locators==================================
    By thankYouText = By.className("complete-header");
    //=============================Strings==================================
    String expectedConfirmationPageUrl = "https://www.saucedemo.com/checkout-complete.html";
    String expectedThankYouText = "Thank you for your order!";
    String actualThankYouText = driver.findElement(thankYouText).getText();

    //===================================Actions===================================
    public void assertConfirmationPage() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, expectedConfirmationPageUrl);
    }

    public void assertThankYou() {
        Assert.assertEquals(actualThankYouText, expectedThankYouText);
    }

}
