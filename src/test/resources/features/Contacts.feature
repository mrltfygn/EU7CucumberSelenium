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
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |


  Scenario:Menu Options Sales Manager
    Given the user logged in as "sales manager"
    Then the user should see following options
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

  Scenario:Menu Options Store Manager
    Given the user logged in as "store manager"
    Then the user should see following options
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

  Scenario Outline: login as a given user
    Given the user is on the login page
    When the user logs is using following credentials
      | username  | <user>      |
      | password  | UserUser123 |
      | firstname | <firstname> |
      | lastname  | <lastname>  |
    Then the user should be able to login

    Examples:
      | user           | firstname | lastname |
      | user10         | John      | Doe      |
      | storemanager85 | Stephan   | Haley    |