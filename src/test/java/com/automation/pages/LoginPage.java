package com.automation.pages;

import com.automation.test.BaseTest;
import com.automation.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage extends  BasePage  {


    public void doLogin (String usernameVal, String passwordVal) {

        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        username.sendKeys(usernameVal);
        password.sendKeys(passwordVal);
        loginBtn.click();
    }


    public void verifyInvalidLoginErrorIsDisplayed () {
        WebElement errorMsg = driver.findElement(By.xpath("//h3[@data-test='error']"));
        Assert.assertTrue(errorMsg.isDisplayed());

    }
}
