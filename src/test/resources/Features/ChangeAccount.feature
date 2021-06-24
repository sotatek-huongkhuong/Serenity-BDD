#Author: namvp@is.viettel.com.vn
#Keywords Summary: design by phgnamm
#Feature: best for you
Feature: Change Account User

  @tag1
  Scenario: Title of your scenario outline
    Given user login form
    When after user login done
    When user click My account
    And user click on account information
    Then user can change account passworld

  @tag2
  Scenario Outline: Change name of user
    Given user form account information
    When user enter <name> and <surname>
    And user click change and save
    Then user can verify resutlt

    Examples: 
      | name      | surname |
      | phuongnam | vu      |
