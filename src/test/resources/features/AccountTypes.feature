Feature: Account types

  Scenario: Driver user
    Given the user logged in as "driver"
    When the user navigate to "Activities" "Calender Events"
    Then the title contains "Calender Events - Activities"

  Scenario: Sales manager user
    Given the user logged in as "sales manager"
    When the user navigate to "Customers" "Accounts"
    Then the title contains "Accounts - Customers"

  Scenario: Store manager user
    Given the user logged in as "store manager"
    When the user navigate to "Customers" "Contacts"
    Then the title contains "Contacts - Customers"
@wip
  Scenario Outline: Different user types
    Given the user logged in as "<userType>"


    Examples:
      | userType      |
      | driver        |
      | store manager |
      | sales manager |