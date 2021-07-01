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
Feature: Register Account Tocsport Website

  @tag1
  Scenario Outline: Register account
    Given User in tocsport website
    When User enter <email> and <passworld>
    And User click button register
    Then User verify the resutlt

    Examples:
      | email                  | passworld   | status  |
      | phuongnam001@gmail.com | phuongnam   | success |
      | phuongnamok            | saidinhdang | Fail    |
      | 323212323              | phuongnam   | Fail    |
      | namvp@viettel.com.vn   |             | Fail    |
