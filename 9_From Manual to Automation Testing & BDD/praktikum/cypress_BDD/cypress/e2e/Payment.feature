Feature: Select Payment Method;

  Scenario: Choose a payment method
    Given After I have added the product then go to the history page
    When I navigate to the checkout page
    And choose a payment method
    Then I have to look at the payment form as well as enter payment details click the pay button