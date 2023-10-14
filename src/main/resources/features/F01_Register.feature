@regression
Feature: F01 | testing registration Functionality


  @happyScenarios
  Scenario:  user could create new account with valid credentials

    Given user go to register page
    When user Select gender type
    And user enter first and last name
    And user select date of birth
    And user enter valid email
    And user enter password and confirm password
    And user click on register Button
    Then account is created successfully
