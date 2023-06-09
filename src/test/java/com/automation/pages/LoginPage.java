package com.automation.pages;

import com.automation.test.BaseTest;
import com.automation.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login-button")
    WebElement loginBtn;

    @FindBy(xpath = "//h3[@data-test='error']")
    WebElement errorMsg;


    public void doLogin(String usernameVal, String passwordVal) {

        username.sendKeys(usernameVal);
        password.sendKeys(passwordVal);
        loginBtn.click();
    }

    public void verifyLoginPage () {
        Assert.assertTrue(username.isDisplayed());
        Assert.assertTrue(password.isDisplayed());
        Assert.assertTrue(username.isDisplayed());

    }


    public void verifyInvalidLoginErrorIsDisplayed() {
        Assert.assertTrue(errorMsg.isDisplayed());

    }
}
