package com.amazon.tests.createOrder;

import com.amazon.driver.WebDriverHandler;
import com.amazon.tests.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CreateOrderStepDefs extends BaseTest {

    @Given("click on sign up button in home page")
    public void clickOnSignUp(){
        browser.amazon.home.clickOnSignup();
    }

    @Given("enter phone number {string} in sign up form")
    public void enterPhoneNumber(String phoneNumber){
        browser.amazon.home.enterPhoneNumber(phoneNumber);
    }

    @Given("click on continue button in sign up form")
    public void clickOnContinue(){
        browser.amazon.home.clickOnContinue();
    }

    @Given("enter password {string} in sign up form")
    public void enterPassword(String password){
        browser.amazon.home.enterPassword(password);
    }

    @Given("click on submit button in sign up form")
    public void clickOnSubmit(){
        browser.amazon.home.clickOnSubmit();
    }

    @When("enter search text {string} on search bar in home page")
    public void enterSearchText(String searchText){
        browser.amazon.home.enterSearchText(searchText);
    }

    @When("click on search button in home page")
    public void clickOnSearch(){
        browser.amazon.home.clickOnSearch();
    }

    @When("select product from the search results in home page")
    public void clickOnProduct(){
        browser.amazon.home.scrollDown(WebDriverHandler.getWebDriver());
        browser.amazon.home.clickOnProduct();
    }

    @When("add the product to the cart in home page")
    public void clickOnAddToCart(){
        browser.amazon.home.scrollToAddToCart();
        browser.amazon.home.clickOnAddToCart();
    }

    @When("click on cart button in home page")
    public void clickOnCart(){
        browser.amazon.home.clickOnCart();
    }

    @When("click on proceed checkout button in cart page")
    public void clickOnProceedCheckOut(){
        browser.amazon.cart.clickOnProceedCheckOut();
    }

    @Then("place order button should be displayed")
    public void placeOrderShouldBeDisplayed(){
        Assert.assertTrue(browser.amazon.cart.findElement(browser.amazon.cart.getPlaceOrderButton()).isDisplayed());
    }

    @Then("product {string} should be displayed")
    public void productShouldBeDisplayed(String product){
        browser.amazon.cart.scrollDown(WebDriverHandler.getWebDriver());
        Assert.assertEquals(browser.amazon.cart.getProduct(), product);
    }

}
