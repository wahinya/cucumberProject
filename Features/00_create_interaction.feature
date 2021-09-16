Feature: create an interaction
  In order to create a project
  As an admin
  I want to create an interaction

  Scenario: add an interaction
    Given User launch browser or mobile app
    When User logs into mvc with valid email and password
    Then Navigate to the interaction page
    And Fill the interaction form and submit
    Then A success message is displayed

