package com.amazon.tests;

import com.amazon.browser.Browser;
import com.amazon.driver.WebDriverHandler;
import com.amazon.utilities.PropertiesConfig;

public class BaseTest {
    protected WebDriverHandler webDriverHandler;
    protected static Browser browser;
    protected static PropertiesConfig config;
}
