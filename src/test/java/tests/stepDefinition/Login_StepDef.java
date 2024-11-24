package tests.stepDefinition;

import Utilis.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.pages.HomePage;
import tests.pages.LoginPage;

public class Login_StepDef extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

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

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        homePage.assertLoggedIn();
    }
}
