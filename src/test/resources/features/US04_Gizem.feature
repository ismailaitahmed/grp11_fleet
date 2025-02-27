@us04

Feature: Users should be able to login
  User Story :
  As a user I want to access to Vehicle Contracts page with different accounts.
  Accounts are : sales manager, store manager

  Background: User is already in the log in page
  #  Given the user is on the login page

    @wip

  Scenario Outline: User clicks on "Vehicle Contracts" from the fleet menu
    Given the user logged in with username as "<username>" and password as "<password>"
    When user clicks vehicle contracts from the fleet menu GY
    Then user can see the vehicle contracts page GY

    Examples:

      | username        | password    |
      | salesmanager101 | UserUser123 |
      | storemanager51  | UserUser123 |


  Scenario: Driver tries to access the Vehicle Contracts page
    Given the user logged in as "driver"
    When driver clicks vehicle contracts from fleet menu GY
    Then driver gets a warning message GY









