@tag
Feature: moto subscription
  Scenario Outline: subscribe a non existing moto
    Given a moto
    And moto brand is : <brand>
    And moto model is : <model>
    When moto does not already exist on the db
    Then subscrib moto

    Examples:
      |    brand         |    model         |
      |    "YAMAHA"      |    "MT 07"       |

  Scenario Outline: unsubscribe an existing moto
    Given a moto
    And moto brand is : <brand>
    And moto model is : <model>
    When moto does exist on the db
    Then unsubscrib moto

    Examples:
      |    brand         |    model         |
      |    "YAMAHA"      |    "MT 07"       |