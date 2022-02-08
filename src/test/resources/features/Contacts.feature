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

    @wip
    Scenario:Menu Options
      Given the user logged in as "driver"
      Then the user should see following options
      |Fleet      |
      |Customers  |
      |Activities |
      |System     |