package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class GoToShoppingCartAndConfirm {

    public void shoppingCart() throws InterruptedException {
        Thread.sleep(500);
        OpenBrowserAndCloseIt.driver.findElement(By.cssSelector("a[class=\"shopping_cart_link\"]")).click();
        Assert.assertEquals(OpenBrowserAndCloseIt.driver.getCurrentUrl(), "https://www.saucedemo.com/cart.html");


    }


    public void checkOutBtn() throws InterruptedException {
        Thread.sleep(500);
        OpenBrowserAndCloseIt.driver.findElement(By.xpath("//button[@class=\"btn btn_action btn_medium checkout_button\"]")).click();
        Assert.assertEquals(OpenBrowserAndCloseIt.driver.getCurrentUrl(), "https://www.saucedemo.com/checkout-step-one.html");
    }

    public void firstname() throws InterruptedException {
        Thread.sleep(500);
        OpenBrowserAndCloseIt.driver.findElement(By.id("first-name")).sendKeys("khaled");

    }

    public void lastname() throws InterruptedException {
        Thread.sleep(500);
        OpenBrowserAndCloseIt.driver.findElement(By.name("lastName")).sendKeys("omar");

    }

    public void postalCode() throws InterruptedException {
        Thread.sleep(500);
        OpenBrowserAndCloseIt.driver.findElement(By.id("postal-code")).sendKeys("12554");


    }


    public void clickContinue() throws InterruptedException {
        Thread.sleep(500);
        OpenBrowserAndCloseIt.driver.findElement(By.cssSelector("input[class=\"submit-button btn btn_primary cart_button btn_action\"]")).click();
    }

    public void clickFinish() throws InterruptedException {
        Thread.sleep(500);
        OpenBrowserAndCloseIt.driver.findElement(By.xpath("//button[@class=\"btn btn_action btn_medium cart_button\"]")).click();
    }

    public void backHome() throws InterruptedException {
        Thread.sleep(500);
        OpenBrowserAndCloseIt.driver.findElement(By.id("back-to-products")).click();

        Assert.assertEquals(OpenBrowserAndCloseIt.driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
    }
}
