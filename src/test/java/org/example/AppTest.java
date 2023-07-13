package org.example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AppTest {

    OpenBrowserAndCloseIt opc = new OpenBrowserAndCloseIt();
    Login l = new Login();
    AddItemsToTheCart ac = new AddItemsToTheCart();
    GoToShoppingCartAndConfirm gs = new GoToShoppingCartAndConfirm();
    LogOut lo = new LogOut();

    @BeforeTest
    public void openBrowser() throws InterruptedException {
        opc.openBrowser();
    }

    @Test(priority = 1)
    public void username() throws InterruptedException {
        l.username();


    }

    @Test(priority = 2)
    public void password() throws InterruptedException {
        l.password();

    }

    @Test(priority = 3)
    public void login() throws InterruptedException {
        l.login();

    }

    @Test(priority = 4)
    public void addFirstItem() throws InterruptedException {

        ac.addFirstItem();
    }

    @Test(priority = 5)
    public void addSecondItem() throws InterruptedException {

        ac.addSecondItem();
    }

    @Test(priority = 6)
    public void addThirdItem() throws InterruptedException {

        ac.addThirdItem();
    }

    @Test(priority = 7)
    public void shoppingCart() throws InterruptedException {
        gs.shoppingCart();

    }

    @Test(priority = 8)
    public void checkoutBtn() throws InterruptedException {
        gs.checkOutBtn();
    }

    @Test(priority = 9)
    public void firstname() throws InterruptedException {
        gs.firstname();
    }

    @Test(priority = 10)
    public void lastname() throws InterruptedException {
        gs.lastname();
    }

    @Test(priority = 11)
    public void postalCode() throws InterruptedException {
        gs.postalCode();

    }

    @Test(priority = 12)
    public void clickContinue() throws InterruptedException {
        gs.clickContinue();
    }

    @Test(priority = 13)
    public void clickFinish() throws InterruptedException {

        gs.clickFinish();
    }

    @Test(priority = 14)
    public void backHome() throws InterruptedException {
        gs.backHome();
    }

    @Test(priority = 15)
    public void burgerIcon() throws InterruptedException {

        lo.burgerIcon();
    }

    @Test(priority = 16)
    public void clickLogout() throws InterruptedException {

        lo.clickLogout();
    }
    @AfterTest
    public void closeBrowser() throws InterruptedException {
        opc.closeBrower();
    }


}
