Feature: cash_out request
  Scenario Outline: Validate result for a cash_out with a correct amount/trigger
    Given User launch browser or mobile app
    When User logs into mvc with valid email and password
    And Send a message with transport as "<transport>" contact as "<contact>" and a trigger as "<trigger>"
    And A message as "cash out successful!" is generated
    Examples:
      |transport  |contact| trigger|
      |9999       |+254725146670|CASHREQUEST 1000|
