package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CreateOrder {

    public void CreateOrder(String fName, String lName, String pCode) throws InterruptedException {
        Thread.sleep(250);
        OpenBrowserAndCloseIt.driver.findElement(By.cssSelector("a[class=\"shopping_cart_link\"]")).click();
        Assert.assertEquals(OpenBrowserAndCloseIt.driver.getCurrentUrl(), "https://www.saucedemo.com/cart.html");

        OpenBrowserAndCloseIt.java.executeScript("scroll(0,250)");

        Thread.sleep(250);
        OpenBrowserAndCloseIt.driver.findElement(By.xpath("//button[@class=\"btn btn_action btn_medium checkout_button\"]")).click();
        Assert.assertEquals(OpenBrowserAndCloseIt.driver.getCurrentUrl(), "https://www.saucedemo.com/checkout-step-one.html");
        Thread.sleep(250);
        OpenBrowserAndCloseIt.driver.findElement(By.id("first-name")).sendKeys(fName);
        Thread.sleep(250);
        OpenBrowserAndCloseIt.driver.findElement(By.name("lastName")).sendKeys(lName);
        Thread.sleep(250);
        OpenBrowserAndCloseIt.driver.findElement(By.id("postal-code")).sendKeys(pCode);
        Thread.sleep(250);
        OpenBrowserAndCloseIt.driver.findElement(By.cssSelector("input[class=\"submit-button btn btn_primary cart_button btn_action\"]")).click();
        Thread.sleep(250);
        OpenBrowserAndCloseIt.driver.findElement(By.xpath("//button[@class=\"btn btn_action btn_medium cart_button\"]")).click();
        Thread.sleep(250);
        OpenBrowserAndCloseIt.driver.findElement(By.id("back-to-products")).click();
        Assert.assertEquals(OpenBrowserAndCloseIt.driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");


    }


}
