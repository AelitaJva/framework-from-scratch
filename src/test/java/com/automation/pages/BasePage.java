package com.automation.pages;

import com.automation.utils.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    // to call webDriver
    WebDriver driver = DriverUtils.getDriver();


    // to initialize the webElements
    public BasePage() {
        PageFactory.initElements(driver, this);
    }

    public boolean isPresent(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

}
