Feature: cash_out request

Scenario Outline: Validate result for a cash_out with a wrong trigger and correct amount
Given User launch browser or mobile app
When  User logs into mvc with valid email and password
And Send a message with transport as "<transport>" contact as "<contact>" and a trigger as "<trigger>"
Then A message as "Couldn't understand what you said. Write 'mcall' to receive a code or 'balance' to know your balance." is generated

Examples:
|transport  |contact| trigger|
|9999       |+254725146670|CASH 1000|