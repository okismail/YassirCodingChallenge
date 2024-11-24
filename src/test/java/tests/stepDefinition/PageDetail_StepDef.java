package tests.stepDefinition;

import Utilis.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.pages.HomePage;
import tests.pages.ItemDetailsPage;
import tests.pages.LoginPage;

public class PageDetail_StepDef extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ItemDetailsPage itemDetailsPage = new ItemDetailsPage();

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


    @When("I click on an item")
    public void iClickOnAnItem() {
        homePage.assertLoggedIn();
        homePage.clickOnItem();
    }

    @Then("I can view the details successfully")
    public void iCanViewTheDetailsSuccessfully() {
        itemDetailsPage.assertDetailsPage();
    }
}
