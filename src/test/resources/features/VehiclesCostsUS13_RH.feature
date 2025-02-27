@US13
Feature: Vehicles Costs Module Functionality
  Agile Story : As a user, (Store and Sales managers) I want to manage filters on the
  Vehicle Costs page. (Web table and checkbox)

  AC #1: Verify that users see 3 columns on the Vehicle Costs page.
  Expected Column names: TYPE, TOTAL PRICE, DATE

  AC #2: Verify that users can check the first checkbox to select All Vehicle Costs

  @US13AC1
  Scenario Outline: Vehicle Costs Page Table Verification
    Given the user is on the login page
    When the user logged in as "<role>"
    And  user clicks on Fleet module
    And   user  clicks on Vehicle Costs in the Fleet dropdown
    Then  the table should contain the following columns:
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |

    Examples:
      |role|
      |sales manager|
      |store manager|

  @US13AC2
  Scenario Outline: Vehicle Costs Checkbox Verification
    Given the user is on the login page
    When the user logged in as "<role>"
    And  user clicks on Fleet module
    And   user  clicks on Vehicle Costs in the Fleet dropdown
    Then  user should check the first checkbox to select All Vehicle Costs

     Examples:
       |role|
       |sales manager|
       |store manager|



