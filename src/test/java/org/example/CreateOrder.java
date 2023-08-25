package org.example;

import org.openqa.selenium.By;

public class CreateOrder {

    public void CreateOrder(String fName, String lName, String pCode) throws InterruptedException {
        Thread.sleep(250);
        By cart = By.cssSelector("a[class=\"shopping_cart_link\"]");
        OpenBrowserAndCloseIt.driver.element().click(cart);
        OpenBrowserAndCloseIt.driver.assertThat().browser().url().equals("https://www.saucedemo.com/cart.html");
        Thread.sleep(250);

        By checkout = By.xpath("//button[@class=\"btn btn_action btn_medium checkout_button\"]");
        OpenBrowserAndCloseIt.driver.element().click(checkout);
        OpenBrowserAndCloseIt.driver.assertThat().browser().url().equals("https://www.saucedemo.com/checkout-step-one.html");
        Thread.sleep(250);

        By fn = By.id("first-name");
        OpenBrowserAndCloseIt.driver.element().type(fn, fName);

        Thread.sleep(250);
        By ln = By.name("lastName");
        OpenBrowserAndCloseIt.driver.element().type(ln, lName);

        Thread.sleep(250);
        By pc = By.id("postal-code");
        OpenBrowserAndCloseIt.driver.element().type(pc, pCode);

        Thread.sleep(250);
        By submit = By.cssSelector("input[class=\"submit-button btn btn_primary cart_button btn_action\"]");
        OpenBrowserAndCloseIt.driver.element().click(submit);
        Thread.sleep(250);

        By action = By.xpath("//button[@class=\"btn btn_action btn_medium cart_button\"]");
        OpenBrowserAndCloseIt.driver.element().click(action);
        Thread.sleep(250);

        By back = By.id("back-to-products");
        OpenBrowserAndCloseIt.driver.element().click(back);
        OpenBrowserAndCloseIt.driver.assertThat().browser().url().equals("https://www.saucedemo.com/inventory.html");


    }


}
