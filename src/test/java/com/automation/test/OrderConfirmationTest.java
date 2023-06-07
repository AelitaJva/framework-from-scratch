package com.automation.test;

import org.testng.annotations.Test;

public class OrderConfirmationTest extends BaseTest {

    @Test
    public void orderConfirmation() {

        loginPage.doLogin("standard_user","secret_sauce");
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
