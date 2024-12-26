@US3
Feature: View Bodies on Home Page

  Scenario: User logged in
    Given user logs in
    When user attempts to access home page
    Then user will load Main page

  Scenario: User logged out
    Given the user is not logged in
    When user attempts to access home page
    Then user is denied access
