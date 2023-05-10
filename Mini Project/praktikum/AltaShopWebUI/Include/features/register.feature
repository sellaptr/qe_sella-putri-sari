
@tag
Feature: register user
  I want have a account to shop on the AltaShop

  @tag1
  Scenario Outline: User register with valid data credentials
    Given I open register form
    When I fill the fullname field <fullname>
    When I fill with valid email <email>
    And I fill the password <password>
    And I click register button
    Then AltaShop LoginPage appears <status>

    Examples: 
    | fullname  | email  | password | status  | 
    | sania chan  | sania123@gmail.com |     123123 | success |
    | angel  | sania123@gmail.com |     sania | fail    | 
 
  
  #	@tag2
  #	Scenario Outline: User register with registered email
  #	Given As a user iam open the register form
  #	When I fill fullname
  #	And I fill with registered <email>
  #	And I fill the <password> field 
  #	And I click the register button
  #	Then Show the error message and fail to register <status>
  #	
  #	 Examples: 
      #| email  | password | status  | 
      #| sania123@gmail.com |     123123 | fail    | 