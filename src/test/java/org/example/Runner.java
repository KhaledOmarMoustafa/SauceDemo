package org.example;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;


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


    @Test(priority = 1, dataProvider = "readTheSheet")
    public void successfulLogin(String username, String password) throws InterruptedException {
        l.Login(username, password);
    }


    @Test(priority = 2)
    public void addItemsToTheCart() throws InterruptedException {

        ac.AddItemsToTheCart("remove-sauce-labs-backpack");
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
        opc.closeBrowser();
    }

    @DataProvider(name = "readTheSheet")
    public String[][] readTheSheet() throws IOException, InvalidFormatException {
        Read_Data rd = new Read_Data();
        return rd.read_Data();

    }

}
