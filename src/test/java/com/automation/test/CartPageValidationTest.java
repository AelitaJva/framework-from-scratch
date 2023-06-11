package com.automation.test;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CartPageValidationTest extends BaseTest {


    @Test
    public void CartPageValidation() {
        loginPage.doLogin(ConfigReader.getProperty("login.username"), ConfigReader.getProperty("login.password"));
        homePage.verifyHomePage();
        homePage.clickOnAddToCartOfFirstProduct();
        homePage.clickOnIcon();
        cartPage.verifyPage();
        cartPage.removePage ();
        cartPage.verifyCartPageIsEmpty();
    }
}
