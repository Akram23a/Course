@tag
Feature: rider subscription
  Scenario Outline: subscribe a non existing rider
    Given a rider
    And rider fullname is : <fullname>
    When rider does not already exist on the db
    Then subscrib rider

    Examples:
      |    fullname         |
      |    "MASDOUA Manil"  |

  Scenario Outline: unsubscribe an existing rider
    Given a rider
    And existing rider fullname is : <fullname>
    When rider does exist on the db
    Then unsubscrib rider

    Examples:
      |    fullname         |
      |    "MASDOUA Manil"  |