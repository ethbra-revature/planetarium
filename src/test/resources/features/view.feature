@US3
Feature: View Bodies on Home Page

  Scenario: User logged in
    Given user is logged in
    When user attempts to access home page
    Then user will load Main page

  Scenario: User logged out
    Given the user is not logged in
    When user attempts to access home page
    Then user will be redirected to Login page
    # It's just a HTML page with "Please log in first"