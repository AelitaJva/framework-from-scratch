package com.automation.pages;

import com.automation.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class CartPage extends BasePage {
    @FindBy(name = "checkout")
    WebElement checkout;

    @FindBy(xpath = "//button[contains(@id, 'remove')]")
    WebElement removeBtn;

    @FindBy(name = "continue-shopping")
    WebElement continueShopping;

    @FindBy(xpath = "//div[@class='header_secondary_container']//span")
    WebElement pageTitle;

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    List<WebElement> itemList;


    public void clickOnCheckoutBtn() {

        // 5. Click on the checkout button
        checkout.click();
    }

    public void verifyPage() {
        Assert.assertTrue(pageTitle.isDisplayed());
        Assert.assertTrue(checkout.isDisplayed());
        Assert.assertTrue(continueShopping.isDisplayed());
    }

    public void removePage() {
        removeBtn.click();
    }

    // first version - make sure item was removed
    public void verifyCartPageIsEmpty() {
        Assert.assertTrue(!isPresent(removeBtn));
    }


    // second version - make sure item was removed
    // better solution
//    public void verifyCartPageIsEmpty() {
//        Assert.assertTrue(itemList.size() == 0);
//    }

}
