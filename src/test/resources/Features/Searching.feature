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
Feature: Searching Product

  @tag1
  Scenario Outline: Searching product in TocSport Website
    Given User hompage
    When user enter <name>
    And user click button searching
    Then user can see product list

    Examples: 
      | name         |
      | Giầy chạy bộ |
      | Áo ba lỗ     |
      | ##$$%##      |
      |    434422342 |
