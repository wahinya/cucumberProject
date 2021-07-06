Feature: cash_out
  Scenario: Test download cash_out requests is working as expected
    Given User launch browser or mobile app
    When User logs into mvc with valid email and password
    Then Access the cash_out requests page
    And Select cash out requests to approve
    And Approve
    And Confirm success message
    Then Close browser