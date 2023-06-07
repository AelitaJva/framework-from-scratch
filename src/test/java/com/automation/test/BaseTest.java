package com.automation.test;

import com.automation.pages.*;
import com.automation.utils.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;
import java.time.Duration;

public class BaseTest {
    LoginPage loginPage;
    HomePage homePage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    ReviewPage reviewPage;
    OrderConfirmationPage orderConfirmationPage;


    @BeforeMethod
    public void setUp() {
        // Create the driver
        DriverUtils.createDriver();

        // Initialize the page object
        loginPage = new LoginPage();
        homePage = new HomePage();
        cartPage = new CartPage();
        checkoutPage = new CheckoutPage();
        reviewPage = new ReviewPage();
        orderConfirmationPage = new OrderConfirmationPage();

    }

    @AfterMethod
    public void cleanUp() {
        DriverUtils.getDriver().quit();
    }
}
