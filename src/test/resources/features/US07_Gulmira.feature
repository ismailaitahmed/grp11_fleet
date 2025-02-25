@us07
Feature:Users should be able to login
  User Story:
  As a user (Sales manager and Store manager), I should be able to select any vehicle from the Vehicles page

  Background: User is already in the log in page
    Given the user is on the login page

  @gt1
  Scenario Outline: a user launch on the Vehicles page, user can see all the checkboxes as unchecked.
    Given the user logged in with username as "<username>" and password as "<password>"
    When user click vehicles from fleet menu GT
    Then user can see all the cars unselected GT
    Examples:
      | username        | password    |
      | storemanager51  | UserUser123 |
      | salesmanager101 | UserUser123 |


  @gt2
  Scenario Outline: Verify that user can check the first checkbox to select all the cars
    Given the user logged in with username as "<username>" and password as "<password>"
    When user click vehicles from fleet menu GT
    Then user select fist check box GT
    Then user can see all the cars selected GT
    Examples:
      | username        | password    |
      | storemanager51  | UserUser123 |
      | salesmanager101 | UserUser123 |


  @gt3
  Scenario Outline: verify that user can select any car
    Given the user logged in with username as "<username>" and password as "<password>"
    When user click vehicles from fleet menu GT
    And verify user can select any random car from the table GT
    Examples:
      | username        | password    |
      | storemanager51  | UserUser123 |
      | salesmanager101 | UserUser123 |



