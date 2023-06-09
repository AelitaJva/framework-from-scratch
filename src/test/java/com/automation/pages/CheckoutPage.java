package com.automation.pages;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    @FindBy(id = "first-name")
    WebElement firstName;

    @FindBy(id = "last-name")
    WebElement lastName;

    @FindBy(id = "postal-code")
    WebElement zip;

    @FindBy(id = "continue")
    WebElement continueBtn;



    public void fillShippingDetails () {
        // 6. Fill in all the required details on the checkout page
        firstName.sendKeys(ConfigReader.getProperty("checkout.firstname"));
        lastName.sendKeys(ConfigReader.getProperty("checkout.lastname"));
        zip.sendKeys(ConfigReader.getProperty("checkout.zipcode"));
    }

    public void clickOnContinueBtn () {
        // 7. Click on the Continue button and navigates to the review order page
        continueBtn.click();
    }
}
