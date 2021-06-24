#Author: phuongnamXVI
#Keywords Summary :xxbgdrgn 88
#Feature: List of scenarios.
#Scenario:Login to website- design by phuongnam.V99
Feature: Login to website tocSPort

  @tag1
  Scenario Outline: Title of your scenario outline
    Given user hompage of tocsport website
    When user enters <username> and <passworld>
    Then I verify the title of hompage

    Examples: 
      | username                  | passworld         |
      | ratlaliko@gmail.com       | phuongnam99       |
      | phuongnam.utehy@gmail.com | %%$@@             |
      |                           | khongnhaptaikhoan |
      | namvp@is.viettel.com.vn   | phuongnam1        |
