Feature: send message

  Scenario: Sending the message
    Given the user click the Message button
    When a user click add new message and add receiver
    And a user write the message
    Then click the send button to sending message