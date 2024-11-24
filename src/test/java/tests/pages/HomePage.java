package tests.pages;

import Utilis.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends TestBase {
    //=============================Locators==================================
    By item = By.cssSelector("img[alt='Sauce Labs Backpack']");
    By addToCart = By.id("add-to-cart-sauce-labs-backpack");
    By cartIcon = By.className("shopping_cart_link");
    //=============================Strings==================================
    String homePageUrl = "https://www.saucedemo.com/inventory.html";

    //===================================Actions===================================

    //-----------------------------------Assertions---
    public void assertLoggedIn() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, homePageUrl);
    }

    public void clickOnItem() {
        driver.findElement(item).click();
    }

    public void clickAddToCart() {
        driver.findElement(addToCart).click();
    }

    public void clickOnCartIcon() {
        driver.findElement(cartIcon).click();
    }
}
