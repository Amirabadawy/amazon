package com.amazon.tests.createOrder;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/amazon/tests/createOrder/CreateOrder.feature",
        glue = {"com.amazon.tests"},
        plugin = {"pretty","html:reports/amazon-Report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true
)
public class CreateOrderTestRunner extends AbstractTestNGCucumberTests {
}
