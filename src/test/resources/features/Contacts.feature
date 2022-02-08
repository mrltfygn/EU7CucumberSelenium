Feature: Contacts Page
  Scenario: Default page number
    Given the user is on the login page
    And the user enters the driver information
    When the user navigate to "Customer" "Contacts"
    Then default page number should be 1

  Scenario: Verify Create Calender Event
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigate to "Activities" "Calendar Events"
    Then the title contains "Calender"


    Scenario:Menu Options Driver
      Given the user logged in as "driver"
      Then the user should see following options
      |Fleet      |
      |Customers  |
      |Activities |
      |System     |
  @wip
  Scenario:Menu Options Sales Manager
    Given the user logged in as "sales manager"
    Then the user should see following options
      |Dashboards         |
      |Fleet              |
      |Customers          |
      |Sales              |
      |Activities         |
      |Marketing          |
      |Reports & Segments |
      |System             |