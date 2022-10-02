@smoke
Feature: F05 | users will be able to view the sub category for any main category.
  Scenario: user could view Notebooks sub category under computer category.
    Given user can hover on the computer category
    When user clicks on notebooks subcategory
    Then the system will open the subcategory details page "Notebooks"