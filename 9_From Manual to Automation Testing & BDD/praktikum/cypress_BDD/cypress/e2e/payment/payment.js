import { And, Given, Then, When } from "cypress-cucumber-preprocessor/steps";

Given("After I have added the product then go to the history page",function(){
    console.log("After I have added the product then go to the history page")
});
When("I navigate to the checkout page",function(){
    console.log("I navigate to the checkout page")
});
And("choose a payment method",function(){
    console.log("choose a payment method")
});
Then("I have to look at the payment form as well as enter payment details click the pay button",function(){
    console.log("I have to look at the payment form as well as enter payment details click the pay button")
});
