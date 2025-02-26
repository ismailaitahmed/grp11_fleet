@IAA
Feature: Access to the Oroinc Documentation page.
  Scenario: Question mark icon verification
    Given the user logged in as "driver"
    When user clicks on question mark icon
    Then user should access to the Oroinc Documentation page
