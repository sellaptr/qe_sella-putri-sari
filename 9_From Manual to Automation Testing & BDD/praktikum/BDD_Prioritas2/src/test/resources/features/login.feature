Feature: Login;
  As a user

  Scenario: Login with valid credentials
    Given I am on the login page
    When I enter my valid email and password
    And click on the login button
    Then I should be redirected to the home page

    Scenario: Login with invalid credentials
      Given I am on the login page
      When I enter my invalid email and password
      And click on the login button
      Then I will see an error message