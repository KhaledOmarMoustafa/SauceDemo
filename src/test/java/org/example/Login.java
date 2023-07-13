package org.example;

import org.openqa.selenium.By;

public class Login {

    public void username() throws InterruptedException {
        OpenBrowserAndCloseIt.driver.findElement(By.cssSelector("input[placeholder=\"Username\"]")).sendKeys("standard_user");
        Thread.sleep(500);


    }

    public void password() throws InterruptedException {
        Thread.sleep(500);
        OpenBrowserAndCloseIt.driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys("secret_sauce");

    }

    public void login() throws InterruptedException {
        Thread.sleep(500);
        OpenBrowserAndCloseIt.driver.findElement(By.cssSelector("input[class=\"submit-button btn_action\"]")).click();

    }
}
