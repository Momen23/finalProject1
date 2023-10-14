package org.example.stepDefs;

import io.cucumber.java.en.Given;
import org.example.pages.registerPage;

public class register {

    registerPage reg = new registerPage();

    @Given("user go to register page")
    public void userGoToRegisterPage()
    {
        reg.registerIconTab.click();
    }
}
