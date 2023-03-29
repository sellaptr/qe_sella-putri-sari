Feature: my network

  Scenario: Show My Network
    Given the user have the linkedin account
    When a user has logged in to the account
    And a user click My Network button
    Then display the relation all connection and manage my network