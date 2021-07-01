#Author: phuongnam.pro
#Keywords Summary :
#Feature: List of scenarios.
Feature: All Action of user

  @Tag1
  Scenario Outline: User login
    Given user Local page
    When user Type <email> and <pass>
    Then user can navigated to hompage
    Examples:
      | email               | pass        |
      | ratlaliko@gmail.com | phuongnam99 |

  @Tag2
  Scenario Outline: User Choosing Product And Add product to cart
    Given  User hompage after login
    When User Type <productname>
    And user add product To cart
    Then user click view cart
    Examples:
      | productname |
      | Đồng hồ     |

  @Tag3
  Scenario: User Action Payment Procedure
    Given User Cart
    When  User Click Payment Processing
    When User Typed Company
    And User Typed Address
    And user Typed PostCode
    And user Typed City
    And user Typed NumberPhone
    When user Click Order
    Then user Can see result
    Then user Can Check details off bill

    #Examples:
      #| company | Address | PostCode  | City    | NumberPhone |
      #| DC      | USA     | SpiderMan | NewYork | 01111xx     |

