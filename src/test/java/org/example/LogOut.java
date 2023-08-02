package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class LogOut {

    public void LogOut() throws InterruptedException {

        Thread.sleep(500);

        OpenBrowserAndCloseIt.driver.findElement(By.cssSelector("button[id=\"react-burger-menu-btn\"]")).click();
        Thread.sleep(500);

        OpenBrowserAndCloseIt.driver.findElement(By.xpath("//div//div//nav//a[@id=\"logout_sidebar_link\"]")).click();

        Assert.assertEquals(OpenBrowserAndCloseIt.driver.getCurrentUrl(), "https://www.saucedemo.com/");


    }

//    public void clickLogout() throws InterruptedException {
//
//        Thread.sleep(1000);
//
//        OpenBrowserAndCloseIt.driver.findElement(By.xpath("//div//div//nav//a[@id=\"logout_sidebar_link\"]")).click();
//
//        Assert.assertEquals(OpenBrowserAndCloseIt.driver.getCurrentUrl(), "https://www.saucedemo.com/");
//
//    }
}
