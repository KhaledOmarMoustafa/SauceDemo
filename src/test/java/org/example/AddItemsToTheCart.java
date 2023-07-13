package org.example;

import org.openqa.selenium.By;

public class AddItemsToTheCart {

    public void addFirstItem() throws InterruptedException {
        Thread.sleep(500);
        OpenBrowserAndCloseIt.driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();

    }

    public void addSecondItem() throws InterruptedException {
        Thread.sleep(500);
        OpenBrowserAndCloseIt.driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();

    }

    public void addThirdItem() throws InterruptedException {
        Thread.sleep(500);
        OpenBrowserAndCloseIt.driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();

    }
}
