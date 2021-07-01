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
Feature: Change PassWorld User
  I want to use this template for my feature file

  @tag2
  Scenario Outline: ChangePass
    Given User application hompage
    When login step done by <mail> and <pssworld>
    When user click My acc
    And user moving on to information account
    When user tying <currentpass>
    And user typing <newpass>
    And user retyping <passconfirm>
    When user click change
    Then passworld user has been changed

    Examples: 
      | mail                | pssworld    | currentpass | newpass     | passconfirm |
      | ratlaliko@gmail.com | phuongnam11 | phuongnam11 | phuongnam99 | phuongnam99 |
