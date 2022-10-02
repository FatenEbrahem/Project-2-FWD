@smoke
  Feature: F04 | users will be able to search for products with different parameter.
    Scenario Outline: user could search using product name.
      When when user clicks on search field
      And user search with "<productName>"
      Then user could find "<productName>" relative results
      Examples:
        | productName |
        | book |
        | laptop |
        | nike |

    Scenario Outline: user could search using product using sku.
      When when user clicks on search field
      And user search with "<SKU>"
      Then user could find "<SKU>" inside product details page
      Examples:
        | SKU |
        | SCI_FAITH |
        | APPLE_CAM |
        | SF_PRO_11 |