Feature: cash_out
  Scenario Outline: Test download cash_out requests is working as expected
    Given User launch browser or mobile app
    When User logs into mvc with email "<email>" and password "<password>"
    Then Access the cash_out requests page
    And Download a csv file

    Examples:
    |email|password|
    |xxxxxxx|dppppp|