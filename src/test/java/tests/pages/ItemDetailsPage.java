package tests.pages;

import Utilis.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ItemDetailsPage extends TestBase {
    //=============================Locators==================================
    By itemTitle = By.cssSelector(".inventory_details_name.large_size");
    By addPriceButton = By.id("add-to-cart");
    //=============================Strings==================================
    String itemDetailPageUrl = "https://www.saucedemo.com/inventory-item.html?id=4";
    String expectedItemTitle = "Sauce Labs Backpack";
    String expectedAddPriceButton = "Add to cart";

    String currentUrl = driver.getCurrentUrl();
    String actualItemTitle = driver.findElement(itemTitle).getText();
    String actualAddPriceButtonText = driver.findElement(addPriceButton).getText();

    //===================================Actions===================================
    //-----------------------------------Assertions---

    public void assertDetailsPage() {
        Assert.assertEquals(currentUrl, itemDetailPageUrl);
        Assert.assertEquals(actualItemTitle, expectedItemTitle);
        Assert.assertEquals(actualAddPriceButtonText, expectedAddPriceButton);
    }
}
