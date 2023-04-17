Feature: RestFull API Test
  As an admin
  I want to see list of user
  So that I can create new user

  Scenario: Successful login
    Given I have valid credentials
    When I submit a POST request to "/auth/login" with username "mor_2314" and password "83r5^_"
    Then I should get a 200 response code
    And the response should contain an access token

  Scenario: Invalid login
    Given I have valid credentials
    When I submit a POST request to "/auth/login" with username "83r5^_" and password "p@ssw0rd"
    Then I should get a 401 response code

  Scenario: Retrieve all products
    Given I set GET products endpoint
    When I send GET HTTP request
    Then the response status code should be 200
    And the response should contain products

  Scenario: Retrieve a single product
    Given I set GET product endpoint with id 1
    When I send GET HTTP request
    Then the response status code should be 200
    And the response should contain product with id 1

  Scenario: Retrieve a non-existent product
    Given I set GET product endpoint with id 0
    When I send GET HTTP request
    Then the response status code should be 200

  Scenario: Get product with limit 5
    Given I set GET product endpoint with limit 5
    When the response status code should be 200
    Then the response should contain a list of 5 products

  Scenario: Get product with limit 50
    Given I set GET product endpoint with limit 50
    When the response status code should be 200
    Then the response should contain a list of 20 products

  Scenario: Get sorted product list
    Given User call product list API with sorted parameter
    When the response status code should be 200

  Scenario: Get all product categories
    Given I send a GET request to categories
    When the response status code should be 200
    Then the response should contain categories

#  Scenario: Get all product categories with invalid method
#    Given I send a GET request to categories
#    When the response status code should be 405
#    Then the response should contain categories

  Scenario: Get in product categories
    Given I send a GET request to categories jewelery
    When the response status code should be 200

  Scenario: Get in invalid product categories
    Given I send a GET request to categories jewelery invalid
    When the response status code should be 200

  Scenario: Add a new product to the database
    Given I have a new product with title "test product", price "13.5", description "lorem ipsum set", image "https://i.pravatar.cc", and category "electronic"
    When I add the new product
    Then the response status code should be 200
    And the response should contain the new product data

  Scenario: Add a new product to the database with invalid data
    Given I have a new product with title "test product", price "@#$", description "lorem ipsum set", image "https://i.pravatar.cc", and category "electronic"
    When I add the new product
    Then the response status code should be 200
    And the response should contain the new product data

  Scenario: Update product with valid data
    Given I have a product with id 7
    When I update the product name to "New Product Name"
    Then the response status code should be 200
    And the response should contain the updated product information

  Scenario: Update product with invalid data
    Given I have a product with id 7
    When I update the product name to ""
    Then the response status code should be 200

  Scenario: User deletes a product from the product list
    Given User requests to delete a product with id 6
    When Product with id is successfully deleted

  Scenario: User deletes a product from the invalid product list
    Given User requests to delete a product with id 25
    When Product with id is successfully deleted

  Scenario: Retrieve all carts
    Given I set GET carts endpoint
    When I send GET HTTP request
    Then the response status code should be 200
    And the response should contain carts

  Scenario: Retrieve a single carts
    Given I set GET carts endpoint with id 5
    When I send GET HTTP request
    Then the response status code should be 200
    And the response should contain carts with id 5

  Scenario: Retrieve a non-existent carts
    Given I set GET carts endpoint with id 0
    When I send GET HTTP request
    Then the response status code should be 200

  Scenario: Get carts with limit 5
    Given I set GET carts endpoint with limit 5
    When the response status code should be 200
    Then the response should contain a list of 5 carts

  Scenario: Get carts with limit 50
    Given I set GET carts endpoint with limit 50
    When the response status code should be 200
    Then the response should contain a list of 7 carts

  Scenario: Get sorted carts list
    Given User call carts list API with sorted parameter
    When the response status code should be 200

  Scenario: Get cart in date range
    Given I set start date as "2019-12-10" and end date as "2020-10-10"
    When I send GET request to "/carts"
    Then the response status code should be 200

  Scenario: Retrieve a user carts
    Given I set GET user carts endpoint with id 6
    When I send GET HTTP request
    Then the response status code should be 400

  Scenario: Retrieve a user carts invalid
    Given I set GET user carts endpoint with id 10
    When I send GET HTTP request
    Then the response status code should be 400

  Scenario: Add a new cart to the database
    Given I have a new cart with userId "5", date "2020-02-03", products "[{productId:5,quantity:1},{productId:1,quantity:5}]"
    When I add the new cart
    Then the response status code should be 200
    And the response should contain the new cart data

  Scenario: Add a new cart to the database with invalid data
    Given I have a new cart with userId "5", date "@#$%-#$-%^", products "[{productId:5,quantity:1},{productId:1,quantity:5}]"
    When I add the new cart
    Then the response status code should be 200
    And the response should contain the new cart data

  Scenario: Update cart with valid data
    Given I have a cart with id 7
    When I update the cart products to "[{productId:10,quantity:20}]"
    Then the response status code should be 200
    And the response should contain the updated cart information

  Scenario: Update cart with invalid data
    Given I have a cart with id 7
    When I update the cart products to ""
    Then the response status code should be 200

  Scenario: User deletes a cart from the product list
    Given User requests to delete a cart with id 6
    When Cart with id is successfully deleted

  Scenario: User deletes a cart from the invalid product list
    Given User requests to delete a cart with id 25
    When Cart with id is successfully deleted

  Scenario: Retrieve all users
    Given I set GET users endpoint
    When I send GET HTTP request
    Then the response status code should be 200
    And the response should contain users

  Scenario: Retrieve a single users
    Given I set GET users endpoint with id 1
    When I send GET HTTP request
    Then the response status code should be 200
    And the response should contain users with id 1

  Scenario: Retrieve a non-existent users
    Given I set GET users endpoint with id 0
    When I send GET HTTP request
    Then the response status code should be 200

  Scenario: Get users with limit 5
    Given I set GET users endpoint with limit 5
    When the response status code should be 200
    Then the response should contain a list of 5 users

  Scenario: Get users with limit 50
    Given I set GET users endpoint with limit 50
    When the response status code should be 200
    Then the response should contain a list of 10 users

  Scenario: Get sorted users list
    Given User call users list API with sorted parameter
    When the response status code should be 200

#  Scenario: Add a new users to the database
#    Given I have a new users with email "John@gmail.com", username "johnd", password "m38rmF$", name "{firstname:'John',lastname:'Doe'}", address "{city:'kilcoole',street:'7835 new road',number:3,zipcode:'12926-3874',geolocation:{lat:'-37.3159',long:'81.1496'}", phone "1-570-236-7033"
#    When I add the new users
#    Then the response status code should be 200
#    And the response should contain the new users data

  Scenario: Update users with valid data
    Given I have a users with id 7
    When I update the users username to "budi"
    Then the response status code should be 200
    And the response should contain the updated users information

  Scenario: Update users with invalid data
    Given I have a users with id 7
    When I update the users username to ""
    Then the response status code should be 200

  Scenario: User deletes a users from the product list
    Given User requests to delete a users with id 6
    When Users with id 6 is successfully deleted

  Scenario: User deletes a users from the invalid product list
    Given User requests to delete a users with id 25
    When Users with id 6 is successfully deleted