Feature: cash_out request
  Scenario:Check user is restricted from cashing out amount less minimum cash-out set
    Given User launch browser or mobile app
    When User logs into mvc with valid email and password
    And Send request with invalid cash out amount and confirm results