Feature: Person To Person Transaction

  Scenario: Check result when a person with 0 miles can send miles to another person
    Given User launch browser or mobile app
    When User logs into mvc with valid email and password
    Then actor with zero miles request a payment code
    And actor2 validate the code
    And confirm the result