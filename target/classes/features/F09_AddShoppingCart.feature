Feature: Logged user could select different tags

  Scenario: Logged user select different tags
    Given user navigates to login page
    And user enters email "mEmad@gmail.com" and password "123456"
    And user click on login button
    And user add a product
    And user add another product
    Then user get the added products on the shopping cart