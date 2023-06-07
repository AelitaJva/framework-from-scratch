package com.automation.test;

import com.automation.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void verifyUserCanLogin() {
        loginPage.doLogin("standard_user","secret_sauce");
    }

    @Test
    public void verifyUserCanNotLoginWithInvalidCredentials () {
        loginPage.doLogin("admin", "admin123");
        loginPage.verifyInvalidLoginErrorIsDisplayed();
    }
}
