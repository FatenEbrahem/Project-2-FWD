@smoke
Feature: F05 | users can redirect to the slider pages
  Scenario: first slider is clickable on home page
    When user clicks into the first slider
    Then system will navigate the user to the first slider details page

  Scenario: second slider is clickable on home page
    When user clicks into the second slider
    Then system will navigate the user to the second slider details page