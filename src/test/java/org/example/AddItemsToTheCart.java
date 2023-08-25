package org.example;

import org.openqa.selenium.By;

public class AddItemsToTheCart {


    public void AddItemsToTheCart(String name) throws InterruptedException {


        Thread.sleep(250);
        By item1 = By.cssSelector("img[alt=\"Sauce Labs Backpack\"]");
        OpenBrowserAndCloseIt.driver.element().click(item1);

        Thread.sleep(250);


        By click1 = By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]");
        OpenBrowserAndCloseIt.driver.element().click(click1);
        Thread.sleep(250);


        OpenBrowserAndCloseIt.driver.assertThat().element(By.id("remove-sauce-labs-backpack")).attribute("name").equals(name);

        Thread.sleep(250);

        By back = By.id("back-to-products");
        OpenBrowserAndCloseIt.driver.element().click(back);

        Thread.sleep(250);

        Thread.sleep(250);

        By item2 = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
        OpenBrowserAndCloseIt.driver.element().click(item2);

        Thread.sleep(250);
        By item3 = By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");
        OpenBrowserAndCloseIt.driver.element().click(item3);


    }

}
