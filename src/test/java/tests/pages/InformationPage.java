package tests.pages;

import Utilis.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;

public class InformationPage extends TestBase {
    //=============================Locators==================================
    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By postalCode = By.id("postal-code");
    By continueButton = By.id("continue");

    //=============================Strings==================================
    String expectedInformationPageUrl = "https://www.saucedemo.com/checkout-step-one.html";

    //===================================Actions===================================
    public void assertInformationPage() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, expectedInformationPageUrl);
    }

    public void fillFirstName() {
        driver.findElement(firstName).sendKeys("test");
    }
    public void fillLastName() {
        driver.findElement(lastName).sendKeys("testing");
    }
    public void fillPostalCode() {
        driver.findElement(postalCode).sendKeys("123");
    }
    public void clickContinueButton() {
        driver.findElement(continueButton).click();
    }
}
