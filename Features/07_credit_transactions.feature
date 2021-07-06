Feature: credit transfer
  Scenario: Test transfer miles from a bank to person account
    Given User launch browser or mobile app
    When User logs into mvc with valid email and password
    Then Go to transaction page
    And Submit a credit transaction
    And Verify a message "Success cash-out" is generated