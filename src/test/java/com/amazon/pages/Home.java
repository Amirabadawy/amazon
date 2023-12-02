package com.amazon.pages;

import com.amazon.driver.WebDriverHandler;
import org.openqa.selenium.By;

public class Home extends BasePage{
    private final By signUpButton = By.id("nav-link-accountList-nav-line-1");
    private final By phoneNumberField = By.id("ap_email");
    private final By continueButton = By.id("continue");
    private final By passwordField = By.id("ap_password");
    private final By submitButton = By.id("signInSubmit");
    private final By searchBar = By.id("twotabsearchtextbox");
    private final By searchButton = By.id("nav-search-submit-button");
    private final By product = By.xpath("//*[text()='اي اس ار جراب لموبايل ايفون 15 برو ماكس، متوافق مع ماج سيف، حماية من الدرجة العسكرية، مقاوم للاصفرار، ظهر مقاوم للخدش، جراب موبايل مغناطيسي لموبايل ايفون 15 برو ماكس، سلسلة كلاسيكية، شفاف']");
    private final By product1 = By.xpath("//*[@class=\"a-size-base-plus a-color-base a-text-normal\"]");

    private final By addToCartButton = By.id("add-to-cart-button");

    private final By cartButton = By.id("nav-cart-count-container");



    public void clickOnSignup(){
        findElement(signUpButton).click();
    }

    public void enterPhoneNumber(String phoneNumber){
        findElement(phoneNumberField).sendKeys(phoneNumber);
    }

    public void clickOnContinue(){
        findElement(continueButton).click();
    }

    public void enterPassword(String password){
        findElement(passwordField).sendKeys(password);
    }

    public void clickOnSubmit(){
        findElement(submitButton).click();
    }

    public void enterSearchText(String searchText){
        findElement(searchBar).sendKeys(searchText);
    }

    public void clickOnSearch(){
        findElement(searchButton).click();
    }

    public void clickOnProduct(){
        findElement(product1).click();
    }

    public void scrollToAddToCart(){
        scrollDownToElement(WebDriverHandler.getWebDriver(),addToCartButton);
    }
    public void clickOnAddToCart(){
        findElement(addToCartButton).click();
    }

    public void clickOnCart(){
        findElement(cartButton).click();
    }
}
