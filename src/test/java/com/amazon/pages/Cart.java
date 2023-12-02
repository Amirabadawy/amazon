package com.amazon.pages;

import org.openqa.selenium.By;

public class Cart extends BasePage{

    private final By proceedCheckOutButton = By.id("sc-buy-box-ptc-button");
    private final By placeOrderButton = By.id("submitOrderButtonId");
    private final By product = By.xpath("//*[@class='a-row breakword']");


    public void clickOnProceedCheckOut(){
        findElement(proceedCheckOutButton).click();
    }

    public By getPlaceOrderButton(){
        return placeOrderButton;
    }
    public String getProduct(){
        return findElement(product).getText();
    }

}
