package tests.pages;

import Utilis.TestBase;
import org.openqa.selenium.By;

public class LoginPage extends TestBase {
    //=============================Locators==================================
    By username = By.cssSelector("#user-name");
    By password = By.cssSelector("#password");
    By login = By.cssSelector("#login-button");

    //=============================Strings==================================
    String url = "https://www.saucedemo.com/";

    //===================================Actions===================================
    public void navigateToSwagLabs() {
        driver.navigate().to(url);
    }

    public void fillUsername(String enteredUsername) {
        driver.findElement(username).sendKeys(enteredUsername);
    }

    public void fillPassword(String enteredPassword) {
        driver.findElement(password).sendKeys(enteredPassword);
    }

    public void clickLogin() {
        driver.findElement(login).click();
    }
}
