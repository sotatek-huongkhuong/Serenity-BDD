#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
@tag
Feature: Login
Scenario: LoginStep

  Given user homepage of tocsport
  When user enter username and passworld
  When user click login button
  Then user can navigated to tocsport homepage
