Feature: cash_out approval
  Scenario: Verify that a Country Lead can approve single or multiple cash out requests
    Given User launch browser or mobile app
    When User logs into mvc with valid email and password
    Then Access the cash_out requests page
    And Select cash out requests & approve
    And Confirm success message