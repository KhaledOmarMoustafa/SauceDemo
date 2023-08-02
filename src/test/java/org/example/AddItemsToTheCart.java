package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AddItemsToTheCart {

    private String name;
    public void AddItemsToTheCart() throws InterruptedException {

        name = "remove-sauce-labs-backpack";
        Thread.sleep(250);
        OpenBrowserAndCloseIt.driver.findElement(By.cssSelector("img[alt=\"Sauce Labs Backpack\"]")).click();
        Thread.sleep(250);
        OpenBrowserAndCloseIt.driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        Thread.sleep(250);
        Assert.assertEquals(OpenBrowserAndCloseIt.driver.findElement(By.id("remove-sauce-labs-backpack")).getAttribute("name"), name);
        Thread.sleep(250);
        OpenBrowserAndCloseIt.driver.findElement(By.id("back-to-products")).click();
        Thread.sleep(250);
        OpenBrowserAndCloseIt.java.executeScript("scroll(0,250)");
        Thread.sleep(250);
        OpenBrowserAndCloseIt.driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        Thread.sleep(250);
        OpenBrowserAndCloseIt.driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();

    }

}
