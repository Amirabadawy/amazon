package com.amazon.browser;

import com.amazon.Amazon;
import com.amazon.driver.WebDriverHandler;
import org.openqa.selenium.WebDriver;

public class Browser {
    private final WebDriver webDriver = WebDriverHandler.getWebDriver();
    public Amazon amazon;

    public Browser() {
        amazon = new Amazon();
    }
}
