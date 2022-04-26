Feature: User should be able to enter new Employee

  Background:
    Given user navigates to HRM Login Page
    When user enters "yoll-student" username and "Bootcamp5#" password
    Then user clicks on login button

  @YA105
  Scenario:User should be able to verify PIM Tabs and navigate to Add Employee page
    Then user should be able to click on PIM tab
    Then user should verify PIM tabs
    |pimTabs|
    |Configuration|
    |Employee List|
    |Add Employee|
    |Reports|
    And user should be able to navigate to Add employee page and verify

    @YA106
    Scenario: User should be able to Add Employee
#      Given user navigates to HRM Login Page
#      When user enters "yoll-student" username and "Bootcamp5#" password
#      Then user clicks on login button
      Then user should be able to click on PIM tab
      Then user should be click on Add button
      Then user should be able to enter first name
      Then user should be able to enter middle name
      Then user should be able to enter last name
      And  user should be able to click save button