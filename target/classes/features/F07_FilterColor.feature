Feature: Logged user could could filter with color

  Scenario: Logged user filter with color
    Given user navigates to login page
    And user enters email "mEmad@gmail.com" and password "123456"
    And user click on login button
    When user hover on a main category
    And user select a sub category
    And user selects color
    Then user get the result data with the color chosen