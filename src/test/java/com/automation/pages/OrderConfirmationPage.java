package com.automation.pages;

import com.automation.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderConfirmationPage extends BasePage{

    public void verifyConfirmationPageDisplayed () {
        // 10. Print confirmation message in the output
        WebElement confirmation = driver.findElement(By.id("checkout_complete_container"));
        System.out.println(confirmation.getText());
    }
}
