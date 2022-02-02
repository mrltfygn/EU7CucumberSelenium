@navigate
Feature: Navigation Menu
  Scenario: Navigation Fleets -- Vehicles
    Given the user is on the login page
    And the user enters the sales manager information
    When The user navigate to Fleets, Vehicles
    Then the title should be Vehicles

  Scenario: Navigation Marketing -- Campaigns
    Given the user is on the login page
    And the user enters the sales manager information
    When The user navigate to Marketing, Campaigns
    Then the title should be Campaigns

  Scenario: Navigation Activities -- Calender Events
    Given the user is on the login page
    And the user enters the sales manager information
    When The user navigate to Activities, Calender Events
    Then the title should be Calenders