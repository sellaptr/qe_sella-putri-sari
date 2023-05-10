
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login user
  I want to login 

  @tag1
  Scenario Outline: user login with valid email and password
    Given I open the web
    When I fill the field with valid <email>
    When I fill correct <password>
    And I click the login button
    Then I direct to homepage <status>
    
    Examples: 
      | email  | password | status  |
      |  sania123@gmail.com |     123123 | success |  
      
    @tag2
    Scenario Outline: user login with unregistered email and password
    Given I open the url 
    When I fill the field with unregistered email <email>
    And I fill password <password>
    And I click login button 
    Then Failed to login <status>
    
    Examples: 
      | email  | password | status  | 
      |  puanchan123@gmail.com |     123123 | fail |  