package org.example;

import org.openqa.selenium.By;

public class Login {

    public void username(String uName) throws InterruptedException {
        OpenBrowserAndCloseIt.driver.findElement(By.cssSelector("input[placeholder=\"Username\"]")).sendKeys(uName);
        Thread.sleep(500);
    }


    public void password(String pWard) throws InterruptedException {
        Thread.sleep(500);
        OpenBrowserAndCloseIt.driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys(pWard);

    }

    public void login() throws InterruptedException {
        Thread.sleep(500);
        OpenBrowserAndCloseIt.driver.findElement(By.cssSelector("input[class=\"submit-button btn_action\"]")).click();

    }
}
