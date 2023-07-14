package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserAndCloseIt {
    protected static WebDriver driver;

    protected static JavascriptExecutor java;


    public void openBrowser() {

        driver = new ChromeDriver();
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);


        driver.manage().window().maximize();


        driver.navigate().to("https://www.saucedemo.com/");

        java = (JavascriptExecutor) OpenBrowserAndCloseIt.driver;
    }

    public void closeBrower() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
