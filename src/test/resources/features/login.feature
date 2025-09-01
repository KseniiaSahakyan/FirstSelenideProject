Feature: Login

  Scenario: Successful login
    Given User is on HomePage
    When User clicks on Login icon
    And User enters valid data
    And User clicks on Anmelden button
    And User clicks on User status
    Then User verifies his name is displayed

  Scenario: Successful add item to cart
    Given User is on HomePage
    When User clicks on Login icon
    And User enters valid data
    And User clicks on Anmelden button
    And User navigates to product category
    And Select the first item in the list
    And Add the item to the cart
    And Go to the cart
    Then Verify by text that the item is added


