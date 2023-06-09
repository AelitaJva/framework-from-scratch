package com.automation.pages;

import com.automation.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    @FindBy(name = "checkout")
    WebElement checkout;

    public void clickOnCheckoutBtn() {

        // 5. Click on the checkout button
        checkout.click();
    }

}
