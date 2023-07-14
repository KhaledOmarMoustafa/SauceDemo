package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AddItemsToTheCart {

    private String name;
    public void addFirstItem() throws InterruptedException {

        name = "remove-sauce-labs-backpack";
        Thread.sleep(500);
        OpenBrowserAndCloseIt.driver.findElement(By.cssSelector("img[alt=\"Sauce Labs Backpack\"]")).click();
        OpenBrowserAndCloseIt.driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        Assert.assertEquals(OpenBrowserAndCloseIt.driver.findElement(By.id("remove-sauce-labs-backpack")).getAttribute("name"), name);
        Thread.sleep(200);
        OpenBrowserAndCloseIt.driver.findElement(By.id("back-to-products")).click();

    }


    public void addSecondItem() throws InterruptedException {
        OpenBrowserAndCloseIt.java.executeScript("scroll(0,250)");
        Thread.sleep(500);
        OpenBrowserAndCloseIt.driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();

    }

    public void addThirdItem() throws InterruptedException {
        Thread.sleep(500);
        OpenBrowserAndCloseIt.driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();

    }
}
