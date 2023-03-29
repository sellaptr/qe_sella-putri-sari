Feature: Select Product;

  Scenario: Select a product
    Given I am logged in
    When I navigate to the products page
    And select a product
    Then I should see the product details