package org.example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Runner {
    OpenBrowserAndCloseIt opc;
    Login l;
    AddItemsToTheCart ac;
    CreateOrder gs;
    LogOut lo;

    public Runner() {
        opc = new OpenBrowserAndCloseIt();
        l = new Login();
        ac = new AddItemsToTheCart();
        gs = new CreateOrder();
        lo = new LogOut();

    }

    @BeforeTest
    public void openBrowser() {
        opc.openBrowser();
    }

    @Test(priority = 1)
    public void successfulLogin() throws InterruptedException {
        l.Login("standard_user", "secret_sauce");
    }

    @Test(priority = 2)
    public void addItemsToTheCart() throws InterruptedException {

        ac.AddItemsToTheCart();
    }


    @Test(priority = 3)
    public void completeOrder() throws InterruptedException {
        gs.CreateOrder("khaled", "omar", "12554");

    }


    @Test(priority = 4)
    public void logOut() throws InterruptedException {

        lo.LogOut();

    }


    @AfterTest
    public void closeBrowser() throws InterruptedException {
        opc.closeBrower();
    }


}
