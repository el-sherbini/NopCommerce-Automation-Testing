Feature: Logged user could select different Categories

  Scenario: Logged user select different Categories
    Given user navigates to login page
    And user enters email "mEmad@gmail.com" and password "123456"
    And user click on login button
    When user hover on a main category
    And user select a sub category
    Then user navigate to category page