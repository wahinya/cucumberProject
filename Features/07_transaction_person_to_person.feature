Feature: Person To Person Transaction
  Scenario: Check result when a person send miles to another person
    Given User launch browser or mobile app
    When User logs into mvc with valid email and password
    Then actor1 request a payment code
    And actor2 validate the code
    And Confirm that Rafiki balance reduce