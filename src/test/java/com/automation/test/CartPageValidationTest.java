package com.automation.test;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CartPageValidationTest extends BaseTest {


    @Test
    public void CartPageValidation() {
        loginPage.doLogin("standard_user","secret_sauce");
        homePage.clickOnAddToCartOfFirstProduct();
        homePage.clickOnIcon();

        // remove item from Cart

    }
}
