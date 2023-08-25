package org.example;

import org.openqa.selenium.By;

public class LogOut {

    public void LogOut() throws InterruptedException {

        Thread.sleep(500);

        By burger = By.cssSelector("button[id=\"react-burger-menu-btn\"]");
        OpenBrowserAndCloseIt.driver.element().click(burger);


        Thread.sleep(500);

        By logout = By.xpath("//div//div//nav//a[@id=\"logout_sidebar_link\"]");
        OpenBrowserAndCloseIt.driver.element().click(logout);


        OpenBrowserAndCloseIt.driver.assertThat().browser().url().equals("https://www.saucedemo.com/");

    }

}

