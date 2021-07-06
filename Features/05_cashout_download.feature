Feature: cash_out download
  Scenario: Test download cash_out requests is working as expected
    Given User launch browser or mobile app
    When User logs into mvc with valid email and password
    Then Access the cash_out requests page
    And Download a csv file