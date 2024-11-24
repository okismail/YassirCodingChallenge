package tests.stepDefinition;

import Utilis.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.pages.*;

public class BuyItem_StepDef extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    InformationPage informationPage = new InformationPage();
    FinishPage finishPage = new FinishPage();
    OrderConfirmation orderConfirmation = new OrderConfirmation();

    @Given("I open Swag Labs website")

    public void i_open_swag_labs_website() {
        loginPage.navigateToSwagLabs();
    }

    @When("I enter username {string}")
    public void i_enter_username(String username) {
        loginPage.fillUsername(username);
    }

    @When("I enter password {string}")
    public void i_enter_password(String password) {
        loginPage.fillPassword(password);
    }


    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        loginPage.clickLogin();
    }


    @When("I click Add to Cart")
    public void iClickAddToCart() {
        homePage.clickAddToCart();
    }

    @When("I click on the cart icon")
    public void iClickOnTheCartIcon() {
        homePage.clickOnCartIcon();
    }

    @When("I click on checkout")
    public void iClickOnCheckout() {
        checkOutPage.assertCheckOutPage();
        checkOutPage.clickOnCheckOutButton();
    }

    @When("I enter my information")
    public void iEnterMyInformation() {
        informationPage.assertInformationPage();
        informationPage.fillFirstName();
        informationPage.fillLastName();
        informationPage.fillPostalCode();
        informationPage.clickContinueButton();
    }

    @When("I click on Finish")
    public void iClickOnFinish() {
        finishPage.assertFinishPage();
        finishPage.clickFinishButton();
    }

    @Then("I will see the order confirmation")
    public void iWillSeeTheOrderConfirmation() {
        orderConfirmation.assertConfirmationPage();
        orderConfirmation.assertThankYou();
    }
}
