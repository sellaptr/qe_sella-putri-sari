Feature: user home menu

  Scenario: Show the Home Menu
    Given the user open the linkedin app
    When a user fill the form to login account
    And a user has successfully logged in to the account
    Then display the linkedin home menu