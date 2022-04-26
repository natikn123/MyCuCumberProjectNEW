@regression @smoke
Feature: User validations for Login functionality

  Background:
    Given user navigates to HRM Login Page

   @YA103 @run
  Scenario: User should be able to login to HRM with valid credentials
    When user enters "yoll-student" username and "Bootcamp5#" password
    Then user clicks on login button
    And user should be successfully land on HRM Home Page


  Scenario Outline: User should not be able to login to HRM with invalid credentials
    When user enters "<userName>" username and "<passWord>" password
    Then user clicks on login button
    And user should verify "<errorMessage>" error message
      Examples:
      | userName        | passWord| errorMessage|
      | invalidUserName |invalidPassWord |Invalid credentials      |
      |                 |invalidPassWord |Username cannot be empty |
      |invalidUserName  |                |Password cannot be empty |



