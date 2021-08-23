Feature: Person To Business Transaction
  Scenario: Check result when a person send miles to business
    Given User launch browser or mobile app
    When User logs into mvc with valid email and password
    Then business request a payment code
    And person validate the code
    And confirm that business tiko miles balance increase by 10
    And confirm that person tiko miles balance reduce by 10