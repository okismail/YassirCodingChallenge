package tests.pages;

import Utilis.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;

public class FinishPage extends TestBase {
    //=============================Locators==================================
    By finishButton = By.id("finish");

    //=============================Strings==================================
    String expectedFinishPageUrl = "https://www.saucedemo.com/checkout-step-two.html";

    //===================================Actions===================================
    public void assertFinishPage() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, expectedFinishPageUrl);
    }

    public void clickFinishButton() {
        driver.findElement(finishButton).click();
    }
}
