import { And, Given, Then, When } from "cypress-cucumber-preprocessor/steps";

Given("I am logged in",function(){
    console.log("I am logged in")
});
When("I navigate to the products page",function(){
    console.log("I navigate to the products page")
});
And("select a product",function(){
    console.log("select a product")
});
Then("I should see the product details",function(){
    console.log("I should see the product details")
});