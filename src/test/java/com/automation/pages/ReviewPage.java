package com.automation.pages;

import com.automation.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReviewPage extends BasePage {

    public void printReviewPageDetails() {
        // 8. Print the total amount from the review order page into the output
        WebElement total = driver.findElement(By.xpath("//div[contains(@class, 'summary_total_label')]"));
        System.out.println(total.getText());
    }

    public void clickOnFinish() {
        // 9. Click on the Finish button
        WebElement finish = driver.findElement(By.id("finish"));
        finish.click();
    }
}
