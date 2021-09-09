Feature: Business upload
  Scenario: Verify uploaded business csv is working as expected
    Given User launch browser or mobile app
    When User logs into mvc with valid email and password
    Then Access the business csv upload page
    And upload a csv file