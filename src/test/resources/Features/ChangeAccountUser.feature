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
Feature: Change Information Account User
  Thay Đổi Thông Tin Người Dùng

  @tag1
  Scenario: Change account information
    Given User My Account Page
    And User Click to Address Tab
    When User Type fistname
    And User Type lastname
    And User Type CompanyGroup
    And User Choose Countryside
    And User Type Address
    And User Type Address Home
    And User Type Post Code
    And User Type City
    When User click Saving infor
    Then User Can check infor again
