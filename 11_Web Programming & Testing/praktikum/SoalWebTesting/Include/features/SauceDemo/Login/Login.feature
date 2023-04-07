
@tag
Feature: Login
  I want to login

  @tag1
  Scenario Outline: Login
    Given user on login page
    When user input valid username <username>
    And user input valid password <password>
    And user click login button
    Then user on products page <status>

    Examples: 
      | username  | password | status  |
      | standard_user | secret_sauce | success |
      | standard_user | test | Fail    |