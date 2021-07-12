Feature: Person To Business Transaction
  Scenario : Check result when a person purchase a from a stockist
    Given User launch browser or mobile app
    When User logs into mvc with valid email and password
    And Rafiki request a payment code
    And Retailer validate the code
    And Confirm that Rafiki balance reduce
    And Confirm that retailer balance increase

