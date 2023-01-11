Feature: Logged User could switch between currencies US-Euro

  Scenario: Logged User switch between currencies US-Euro
    Given user navigates to login page
    And user enters email "test2@gmail.com" and password "123456"
    And user click on login button
    When user choose Euro from the dropdown on the top left
    Then currency changed and the price of products converts to Euro
