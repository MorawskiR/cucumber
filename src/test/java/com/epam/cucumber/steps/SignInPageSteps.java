package com.epam.cucumber.steps;

import com.epam.cucumber.pageobject.pages.SignInPage;
import io.cucumber.java.en.And;

import static com.epam.cucumber.steps.BaseSteps.PAGES_STORAGE;

public class SignInPageSteps {
    @And("User enters username as {string} and password as {string} on {string}")
    public void userEntersUsernameAsAndPasswordAsOn(String username, String password, String pageName) {
        PAGES_STORAGE.put("Home Page",
                ((SignInPage) PAGES_STORAGE.get(pageName)).login(username, password)
        );
    }
}
