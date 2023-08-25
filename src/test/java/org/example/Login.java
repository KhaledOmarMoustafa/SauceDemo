package org.example;


import org.openqa.selenium.By;


public class Login {

    public void Login(String uName, String pWard) throws InterruptedException {

        By username = By.cssSelector("input[placeholder=\"Username\"]");
        OpenBrowserAndCloseIt.driver.element().type(username, uName);

        Thread.sleep(250);

        By password = By.cssSelector("input[placeholder=\"Password\"]");
        OpenBrowserAndCloseIt.driver.element().type(password, pWard);

        Thread.sleep(250);


        By submit = By.cssSelector("input[class=\"submit-button btn_action\"]");
        OpenBrowserAndCloseIt.driver.element().click(submit);

        String url = OpenBrowserAndCloseIt.driver.browser().getCurrentURL();
        String current = "https://www.saucedemo.com/inventory.html";

        if (!current.equals(url)) {
            OpenBrowserAndCloseIt.driver.element().clear(username);
            OpenBrowserAndCloseIt.driver.element().clear(password);
        }
    }


}



