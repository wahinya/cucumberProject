Feature: Service validation through missed call
  Scenario: Verify a rafiki receive miles when he validate service and give rating/answer questions
    Given User launch browser or mobile app
    When User logs into mvc with valid email and password
    And Provider send a missed call through a transport to receive a code
    Then Rafiki validate the code
    And Rafiki receive a success message
    And Service provider receive a success message
    When Rafiki rate the service
    And Rafiki answer the first question
    Then Rafiki receives 5 tiko miles success message