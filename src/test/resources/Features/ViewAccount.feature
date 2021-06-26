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
#Sample Feature Definition TemplateFeature: User wanna view account profile

  @tag1
  Scenario Outline: user view account information
    Given user homepage
    When user enter <email> and <pass>
    When user click my account
    And user click account information
    Then user can see result

    Examples: 
      | email               | pass        |
      | ratlaliko@gmail.com | phuongnam99 |
