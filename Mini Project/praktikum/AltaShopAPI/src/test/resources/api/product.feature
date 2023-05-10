Feature: product

  Scenario: Send GET http request to get all product data
    Given I set GET endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I received valid data for all products

    Scenario: Send GET http request to get product data by id
      Given I set GET endpoints by id
      When I send GET HTTP request by id
      Then I receive a valid HTTP response code 200 for Get id data products
      And I receive valid data for id products

      Scenario: Send DELETE http request to delete product data
        Given I set DELETE endpoints
        When I send DELETE HTTP request
        Then I receive a valid HTTP response code 200 in products DELETE

        Scenario: Send POST http request to create a new product  by filling in request body data correctly
          Given I set POST endpoints
          When I send POST HTTP request
          Then I receive a valid HTTP response code 200 in products POST
          And I receive valid data for new product

          Scenario: GET As an admin I have be able to get products rating
            Given I set GET endpoints by rating
            When I send GET HTTP request by rating
            Then I receive valid HTTP response code 200 for Get rating data products
            And I receive valid data for rating products

            Scenario: GET As an admin I have be able to get products comment
              Given I set GET endpoints by comment
              When I send GET HTTP request by comment
              Then I receive valid HTTP response code 200 for Get comment data products
              And I receive valid data for comment products

              Scenario: POST As admin I have be able to create new products rating
                Given I set POST endpoints by rating
                When I send POST HTTP request by rating
                Then I receive valid HTTP response code 200 in products rating POST
                And I receive valid data for assign product rating

                Scenario: POST As admin I have be able to create new products comment
                  Given I set POST endpoints by comment
                  When I send POST HTTP request by comment
                  Then I receive valid HTTP response code 200 in products comment POST
                  And I receive valid data for new comment

