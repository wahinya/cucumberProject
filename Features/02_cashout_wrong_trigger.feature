Feature: cash_out request
  Scenario: Validate users can not cash-out with a wrong trigger
    Given User launch browser or mobile app
    When User logs into mvc with valid email and password
    And Send wrong trigger and confirm results