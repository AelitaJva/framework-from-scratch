package com.automation.pages;

import com.automation.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage {



    public void fillShippingDetails () {
        // 6. Fill in all the required details on the checkout page
        WebElement firstName = driver.findElement(By.id("first-name"));
        WebElement lastName = driver.findElement(By.id("last-name"));
        WebElement zip = driver.findElement(By.id("postal-code"));
        firstName.sendKeys("Diana");
        lastName.sendKeys("Pelivan");
        zip.sendKeys("33578");
    }

    public void clickOnContinueBtn () {
        // 7. Click on the Continue button and navigates to the review order page
        WebElement continueBtn = driver.findElement(By.id("continue"));
        continueBtn.click();
    }
}
