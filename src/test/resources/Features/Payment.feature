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
Feature: Payment process
  //Tiến hành thanh toán

  @tag2
  Scenario Outline: USER ODER AND PAYMENT PROCESS
    Given USER CART PAGE
    When USER CLICK BILLING PROCESS
    When USER TYPE COMPANY
    And USER TYPE ADDRESS
    And USER TYPE POSTCODE
    And USER TYPE CITY
    And USER TYPE PHONENUMBER
    When USER CLICK BILLING ORDER
    Then USER CAN CHECK BILL DETAIL <Notification>

    Examples: 
      | Notification1                              |
      | Cảm ơn bạn. Đơn hàng của bạn đã được nhận. |