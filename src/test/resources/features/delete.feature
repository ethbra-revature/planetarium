@US5
Feature: Deleting Moons/Planets

  Background:
    Given user is logged in

  Scenario: Delete Existing Planet
    Given user has a planet "Mars"
    When user deletes planet "Mars"
    Then Home page updates

  Scenario: Delete Non-Existent Planet
    Given user does not have planet "Proxima B"
    When user deletes planet "Proxima B"
    Then browser alert shows "Invalid moon name"

  Scenario: Delete Existing Moon
    Given user has a moon "Luna"
    When user deletes moon "Luna"
    Then Home page updates

  Scenario: Delete Non-Existent Moon
    Given user does not have moon "Non Est"
    When user deletes moon "Non Est"
    Then browser alert shows "Invalid moon name"
