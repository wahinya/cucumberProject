Feature: Service validation through request
  @cycle1
  Scenario: Verify a rafiki receive miles when he validate service and give rating/answer questions
    Given User launch browser or mobile app
    When User logs into mvc with valid email and password
    And Provider send a request through a transport to receive a code
    Then Rafiki validate the code
    And Rafiki receive a success message
    And Service provider receive a success message
    When Rafiki rate the service
    And Rafiki answer the first question
    And Rafiki answer last question
    Then Rafiki receives 5 tiko miles success message

  @cycle2
  Scenario: Verify a rafiki receive miles when he validate service and give rating/answer questions two times
    Given User launch browser or mobile app
    When User logs into mvc with valid email and password
    And Provider send a request through a transport to receive a code
    Then Rafiki validate the code
    And Rafiki receive a success message
    And Service provider receive a success message
    When Rafiki rate the service
    And Rafiki answer the first question
    And Rafiki answer last question
    Then Rafiki receives 5 tiko miles success message