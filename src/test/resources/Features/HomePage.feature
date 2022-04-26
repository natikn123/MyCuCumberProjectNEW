Feature: User validations for Login functionality

  Background:
    Given user navigates to HRM Login Page
  @YA104
  Scenario: User should be able to verify main tabs on HomePage
    When user enters "yoll-student" username and "Bootcamp5#" password
    Then user clicks on login button
    And user should be able to verify all tabs on Homepage
    |tabNames|
    |Admin|
    |PIM|
    |Leave|
    |Time|
    |Recruitment|
    |My Info|
    |Performance|
    |Dashboard|
    |Directory|
    |Maintenance|
