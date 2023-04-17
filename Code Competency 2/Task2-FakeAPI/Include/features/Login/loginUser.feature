#
#@tag
#Feature: User Login
 #
#
  #@tag1
  #Scenario Outline: User can login successfully
    #Given I have a valid username and password
    #When I send a POST request to "https://fakestoreapi.com/auth/login" with the following body:
#"""
#{
#"username": "mor_2314",
#"password": "83r5^_"
#}
#"""
    #Then  the response status code should be 200
    #And the response body should have a token
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |