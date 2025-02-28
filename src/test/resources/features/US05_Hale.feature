@US05
Feature: User should view columns on the Vehicles Model page.
  US: As a user, I want to view columns on the Vehicle models page. (web-table)


  Scenario Outline: Login with invalid credential
    When user enters the username "<username>" and password "<password>"
    Then the user should be able to log in

    Examples:
      | username        | password    |
      | storemanager250 | UserUser123 |
      | salesmanager300 | UserUser123 |
      | user1200        | UserUser123 |

  Scenario Outline: User should be able to click Vehicles Model
    When user on the Dashboard page
    Then user should be hover over the Fleet
    And Roll down to the Vehicles Model
    And User should be able to click Vehicles Model
    Then User should see the below columns name

    Examples:
      | MODEL NAME | MAKE | CAN BE REQUESTED | CVVI | CO2 FEE (/MONTH) | COST (DEPRECIATED)| TOTAL COST (DEPRECIATED)| CO2 EMISSIONS|FUEL TYPE | VENDORS |

