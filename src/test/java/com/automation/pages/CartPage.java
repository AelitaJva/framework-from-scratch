package com.automation.pages;

import com.automation.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends  BasePage {

    public void clickOnCheckoutBtn () {

        // 5. Click on the checkout button
        WebElement checkout = driver.findElement(By.name("checkout"));
        checkout.click();
    }

}
