#Author: namvp@Viettel.com.vn
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Update Cart and countinue shopping
  -- Cập nhật giỏ hàng--

  Scenario Outline: Continue To Shopping and Update Cart
    Given User CartPage
    When User Click Continue Shopping
    And User Typing <Product>
    And User Choose new product
    When User Click Add to cart
    And User comback to Cart
    Then User Click Update cart
    Then User Can navigated To Billing Process

    Examples:
      | Product |
      | Đồng Hồ |





