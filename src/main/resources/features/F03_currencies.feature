@smoke
Feature: F03_currencies | users could use Euro currency and view related products
  Scenario: user could selects Euro currency
    Given user go to Home page
    When user selects Euro currency
    Then system display related products