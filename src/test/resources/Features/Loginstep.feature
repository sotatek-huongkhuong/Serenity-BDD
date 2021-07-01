#Author: phuongnamXVI
#Keywords Summary :xxbgdrgn 88
#Feature: List of scenarios.
#Scenario:Login to website- design by phuongnam.V99
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
Feature: Login to website tocSPort

  @tag1
  Scenario Outline:Login to website tocSPort
    Given user hompage of tocsport website
    When user enters <username> and <passworld>
    Then I verify the title of hompage

    Examples: 
      | username                  | passworld         | Status |
      | ratlaliko@gmail.com       | phuongnam99       | pass   |
      | phuongnam.utehy@gmail.com | %%$@@             | fail   |
      |                           | khongnhaptaikhoan | fail   |
      | namvp@is.viettel.com.vn   | phuongnam1        | fail   |
