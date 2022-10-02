@smoke
Feature: F08_wishList | users could save product into wishlist
  Scenario: user saves products into wishlist
    When user clicks on wishlist for "HTC One M8 Android L 5.0 Lollipop" product
    Then user views the success msg

  Scenario: wishlist will contain the saved wish product
    When user clicks on wishlist for "HTC One M8 Android L 5.0 Lollipop" product
    Then wishlist link will have the saved wish product