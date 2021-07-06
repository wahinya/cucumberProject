Feature: cash_out
  Scenario Outline: Test cash_out with a correct amount/trigger
    Given User launch browser or mobile app
    When User logs into mvc with valid email and password
    And Send a message with transport as "<transport>" contact as "<contact>" and a trigger as "<trigger>"
    And A message as "Success cash-out" is generated
    Then Close browser


    Examples:
      |transport  |contact| trigger|
      |9999       |+254725146670|CASHREQUEST 50|

  Scenario Outline: Test cash_out with a wrong trigger and correct amount
    Given User launch browser or mobile app
    When  User logs into mvc with valid email and password
    And Send a message with transport as "<transport>" contact as "<contact>" and a trigger as "<trigger>"
    Then A message as "Couldn't understand what you said. Write 'mcall' to receive a code or 'balance' to know your balance." is generated
    Then Close browser

    Examples:
      |transport  |contact| trigger|
      |9999       |+254725146670|CASH 1000|

  Scenario Outline: Test cash_out with a correct trigger and amount less minimum cash out amount
    Given User launch browser or mobile app
    When User logs into mvc with valid email and password
    And Send a message with transport as "<transport>" contact as "<contact>" and a trigger as "<trigger>"
    Then A message as "Minimum amount not reached!" is generated
    Then Close browser

    Examples:
      |transport  |contact| trigger|
      |9999       |+254725146670|CASHREQUEST 5|

  Scenario Outline: Test cash out with a correct trigger but amount less minimum after cash out
    Given User launch browser or mobile app
    When User logs into mvc with valid email and password
    And Send a message with transport as "<transport>" contact as "<contact>" and a trigger as "<trigger>"
    Then A message as "Error minimum amount after cash-out should be equal or more than 200.00" is generated
    Then Close browser

    Examples:
      |transport  |contact| trigger|
      |9999       |+254725146670|CASHREQUEST 1500|