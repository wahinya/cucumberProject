Feature: Referral
  Scenario: Check result when mobilizer refer a rafiki
    Given User launch browser or mobile app
    When User logs into mvc with valid email and password
    Then Mobilizer request a referral code
    And Rafiki validate referral the code
    And Rafiki success is verified
    And Mobilizer success is verified