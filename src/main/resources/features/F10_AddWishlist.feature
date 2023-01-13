Feature: Logged user could add different products to Wishlist

  Scenario: Logged user add different products to Wishlist
    Given user navigates to login page
    And user enters email "mEmad@gmail.com" and password "123456"
    And user click on login button
    When user add a product to wishlist
    And user add another product to wishlist
    And user navigate to wishlist page
    Then user get the added products on the wishlist