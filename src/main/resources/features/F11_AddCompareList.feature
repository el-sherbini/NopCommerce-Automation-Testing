Feature: Logged user could add different products to compare list

  Scenario: Logged user add different products to compare list
    Given user navigates to login page
    And user enters email "mEmad@gmail.com" and password "123456"
    And user click on login button
    When user add two products to compare list
    And user navigate to compare list page
    Then user get the added products on the compare list page