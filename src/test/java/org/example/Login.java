package org.example;

import org.openqa.selenium.By;


public class Login {

    public void Login(String uName, String pWard) throws InterruptedException {
        OpenBrowserAndCloseIt.driver.findElement(By.cssSelector("input[placeholder=\"Username\"]")).sendKeys(uName);
        Thread.sleep(250);
        OpenBrowserAndCloseIt.driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys(pWard);
        Thread.sleep(250);
        OpenBrowserAndCloseIt.driver.findElement(By.cssSelector("input[class=\"submit-button btn_action\"]")).click();
    }
}
