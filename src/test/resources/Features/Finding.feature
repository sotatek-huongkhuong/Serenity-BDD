#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
@tag
Feature: Find and Buy
  @tag1
  Scenario: Find new product
    Given User list product
    When User enter your product
    And User click to product
    Then I validate the outcomes
