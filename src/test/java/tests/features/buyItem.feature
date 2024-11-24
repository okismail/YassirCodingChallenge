Feature: After Login, I want to buy an item

  Scenario Outline: Verify that I buy an item
    Given I open Swag Labs website
    When I enter username "<username>"
    And I enter password "<password>"
    And I click Add to Cart
    And I click on the cart icon
    And I click on checkout
    And I enter my information
    And I click on Finish
    Then I will see the order confirmation

    Examples:
    |username|password|
    |standard_user   |secret_sauce|