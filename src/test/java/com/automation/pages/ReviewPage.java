package com.automation.pages;

import com.automation.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewPage extends BasePage {
    @FindBy(xpath = "//div[contains(@class, 'summary_total_label')]")
    WebElement total;

    @FindBy(id = "finish")
    WebElement finish;

    public void printReviewPageDetails() {
        // 8. Print the total amount from the review order page into the output
        System.out.println(total.getText());
    }

    public void clickOnFinish() {
        // 9. Click on the Finish button
        finish.click();
    }
}
