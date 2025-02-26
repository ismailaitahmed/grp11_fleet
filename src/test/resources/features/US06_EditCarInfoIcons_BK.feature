@US06
Feature: Users should be able to login

    Background: User is already in the log in page
        Given the user is on the login page


 Scenario: Verify login with different user types
    Given the user logged in as "driver"
    When user click vehicles from fleet menu
    Then user click  edit car info icons
    Then user should see view, delete and edit options