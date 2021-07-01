#Author: phuongnam.pro
#Keywords Summary :
#Feature: List of scenarios.
@tag
Feature: Add product to cart

  @tag2
  Scenario Outline: choose and add product to cart
    Given user hompage
    When user Enter <productname>
    And user click product details
    When user click add to cart
    Then user can view cart

    Examples:
      | productname   |
      | Đồng hồ       |
