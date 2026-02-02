package com.example.saucedemo.tests;

import com.example.saucedemo.base.BaseTest;
import com.example.saucedemo.pages.InventoryPage;
import com.example.saucedemo.pages.LoginPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoginTests extends BaseTest {

    @Test
    void successfulLogin_standardUser() {
        LoginPage login = new LoginPage(driver).open();
        login.login("standard_user", "secret_sauce");

        InventoryPage inv = new InventoryPage(driver);
        inv.waitForOpen();

        assertTrue(inv.isOpened());
    }

    @Test
    void loginWithWrongPassword() {
        LoginPage login = new LoginPage(driver).open();
        login.login("standard_user", "wrong_pass");

        assertTrue(login.getErrorText().toLowerCase().contains("do not match"));
    }

    @Test
    void loginLockedOutUser() {
        LoginPage login = new LoginPage(driver).open();
        login.login("locked_out_user", "secret_sauce");

        assertTrue(login.getErrorText().toLowerCase().contains("locked out"));
    }

    @Test
    void loginWithEmptyFields() {
        LoginPage login = new LoginPage(driver).open();
        login.clickLogin();

        assertTrue(login.getErrorText().toLowerCase().contains("username is required"));
    }

    @Test
    void loginPerformanceGlitchUser() {
        LoginPage login = new LoginPage(driver).open();
        login.login("performance_glitch_user", "secret_sauce");

        InventoryPage inv = new InventoryPage(driver);
        inv.waitForOpen();

        assertTrue(inv.isOpened());
    }
}
