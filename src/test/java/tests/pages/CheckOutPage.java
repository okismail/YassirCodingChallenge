package tests.pages;

import Utilis.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckOutPage extends TestBase {
    //=============================Locators==================================
    By checkOutButton = By.id("checkout");

    //=============================Strings==================================
    String expectedCheckOutPageUrl = "https://www.saucedemo.com/cart.html";

    //===================================Actions===================================
    public void assertCheckOutPage() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, expectedCheckOutPageUrl);
    }

    public void clickOnCheckOutButton() {
        driver.findElement(checkOutButton).click();
    }
}
