Feature: Logged user could add different products to Shopping cart

  Scenario: Logged user add different products to Shopping cart
    Given user navigates to login page
    And user enters email "mEmad@gmail.com" and password "123456"
    And user click on login button
    When user add a product to shopping cart
    And user add another product to shopping cart
    And user navigate to shopping cart page
    Then user get the added products on the shopping cart