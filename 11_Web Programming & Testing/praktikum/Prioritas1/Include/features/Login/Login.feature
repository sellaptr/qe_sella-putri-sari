@tag
Feature: Login
  I want to Login

  @tag1
  Scenario Outline: Login
    Given user on login page
    When user input valid username <username>
    And user input valid password <password>
    And user click login button
    Then user on products page <status>

    Examples: 
      | username  | password | status  |
      | standard_user |     secret_sauce | success |
      | standar_salah |     secret_sauce | Fail    |
      | standar_salah |     lala | Fail    |
      
#
  #@tag2
  #Scenario Outline: I want to add product to cart 
    #Given user success login
    #When user input valid username <username>
    #And user input valid password <password>
    #And user click login button
    #Then user on products page <status>
#
    #Examples: 
      #| username  | password | status  |
      #| standard_user |     secret_sauce | success |
      #| standar_salah |     secret_sauce | Fail    |
      #| standar_salah |     lala | Fail    |    