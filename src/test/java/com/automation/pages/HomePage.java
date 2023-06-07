package com.automation.pages;

import com.automation.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends  BasePage{

    public void clickOnAddToCartOfFirstProduct () {
        // 3. Click on add to cart button of the first item
        WebElement item1 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        item1.click();
    }

    public void clickOnIcon () {
        // 4. Click on the cart icon and navigates to the cart page
        WebElement cart = driver.findElement(By.xpath("//a[@class = 'shopping_cart_link']"));
        cart.click();
    }

}
