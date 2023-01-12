Feature: Logged User could search for any product

  Scenario: Logged User search for a product
    Given user navigates to login page
    And user enters email "mEmad@gmail.com" and password "123456"
    And user click on login button
    When user search for a product "Apple MacBook Pro 13-inch"
    Then user got relative result of product searched for "Apple MacBook Pro 13-inch"