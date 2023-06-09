package com.automation.test;

import com.automation.utils.ConfigReader;
import org.testng.annotations.Test;

public class OrderConfirmationTest extends BaseTest {

    @Test
    public void orderConfirmation() {

        loginPage.doLogin(ConfigReader.getProperty("login.username"), ConfigReader.getProperty("login.password"));
        homePage.clickOnAddToCartOfFirstProduct();
        homePage.clickOnIcon();
        cartPage.clickOnCheckoutBtn();
        checkoutPage.fillShippingDetails();
        checkoutPage.clickOnContinueBtn();
        reviewPage.printReviewPageDetails();
        reviewPage.clickOnFinish();
        orderConfirmationPage.verifyConfirmationPageDisplayed();

    }
}
