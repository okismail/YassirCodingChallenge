Feature: Login for Swag Labs
  as a user I want to login successfully

  Scenario Outline: Verify that I can login with correct credentials
    Given I open Swag Labs website
    When I enter username "<username>"
    And I enter password "<password>"
    And I click on the login button
    Then I should be logged in successfully

    Examples:
    |username|password|
    |standard_user   |secret_sauce|