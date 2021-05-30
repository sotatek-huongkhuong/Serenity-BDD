#Author: namvp@is.viettel.com.vn
#Keywords Summary :

#Sample Feature Definition Template
@tag
Feature: Payment
  @tag1
  Scenario: Billing Import
    Given Product list
    And Click details
    When On the details of product
    And Click Add to cart
    And View Cart
    Then I validate the outcome and preparing to payment process
