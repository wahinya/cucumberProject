Feature: cash_out request
Scenario Outline: Validate result for a cash out with a correct trigger but amount less minimum after cash out
Given User launch browser or mobile app
When User logs into mvc with valid email and password
And Send a message with transport as "<transport>" contact as "<contact>" and a trigger as "<trigger>"
Then A message as "amount after cash out should not be less than 1000" is generated

Examples:
|transport  |contact| trigger|
|9999       |+254725146670|CASHREQUEST 1500|