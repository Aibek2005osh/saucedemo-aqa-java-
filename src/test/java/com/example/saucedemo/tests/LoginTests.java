package com.example.saucedemo.tests;

import com.example.saucedemo.base.BaseTest;
import com.example.saucedemo.pages.LoginPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTests extends BaseTest {

    @Test
    void successfulLogin() {
        LoginPage login = new LoginPage(driver).open();
        login.login("standard_user", "secret_sauce");

        assertTrue(driver.getCurrentUrl().contains("inventory.html"));
    }
}
