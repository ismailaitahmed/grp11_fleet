@US10
Feature: Iframe Functionality

   User Story: As a user, I want to type into the Description field when I create a calendar
   event. (Iframe)
   AC #1: Verify that users can type messages in to the Description field on the Calendar
   Events page.

  Scenario: user should be able to type in the description field on the Calendar Events page
    Given the user is on the login page
    When  the user logged in as "driver"
    And   user clicks on Calendar Events from Activities module
    And  user clicks on Create Calendar Event button
    Then  user can type in to the Description field on the Calendar Events page



