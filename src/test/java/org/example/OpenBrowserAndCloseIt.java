package org.example;

import com.shaft.driver.SHAFT;

public class OpenBrowserAndCloseIt {

    static SHAFT.GUI.WebDriver driver;


    public void openBrowser() {

        driver = new SHAFT.GUI.WebDriver();

        driver.browser().maximizeWindow();

        driver.browser().navigateToURL("https://www.saucedemo.com/");

    }

    public void closeBrower() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
