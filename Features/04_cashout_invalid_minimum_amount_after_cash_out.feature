Feature: cash_out request
  Scenario: Check user is restricted from exceeding minimum after cash-out
    Given User launch browser or mobile app
    When User logs into mvc with valid email and password
    And Send request with invalid minimum amount after cash-out and confirm results