package org.example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Runner {
    OpenBrowserAndCloseIt opc;
    Login l;
    AddItemsToTheCart ac;
    GoToShoppingCartAndConfirm gs;
    LogOut lo;

    public Runner() {
        opc = new OpenBrowserAndCloseIt();
        l = new Login();
        ac = new AddItemsToTheCart();
        gs = new GoToShoppingCartAndConfirm();
        lo = new LogOut();

    }

    @BeforeTest
    public void openBrowser() {
        opc.openBrowser();
    }

    @Test(priority = 1)
    public void username() throws InterruptedException {
        l.username("standard_user");
        l.password("secret_sauce");
        l.login();


    }

    @Test(priority = 2)
    public void addFirstItem() throws InterruptedException {

        ac.addFirstItem();
        ac.addSecondItem();
        ac.addThirdItem();
    }


    @Test(priority = 3)
    public void shoppingCart() throws InterruptedException {
        gs.shoppingCart();
        gs.checkOutBtn();
        gs.firstname("khaled");
        gs.lastname("omar");
        gs.postalCode("12554");
        gs.clickContinue();
        gs.clickFinish();
        gs.backHome();
    }


    @Test(priority = 4)
    public void burgerIcon() throws InterruptedException {

        lo.burgerIcon();
        lo.clickLogout();
    }


    @AfterTest
    public void closeBrowser() throws InterruptedException {
        opc.closeBrower();
    }


}
