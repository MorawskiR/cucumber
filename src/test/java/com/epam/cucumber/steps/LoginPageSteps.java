package com.epam.cucumber.steps;

import com.epam.cucumber.pageobject.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.epam.cucumber.steps.BaseSteps.PAGES_STORAGE;
import static com.epam.cucumber.steps.BaseSteps.webDriver;

public class LoginPageSteps {

    @Given("User is on {string}")
    public void userIsOnLoginPage(String pageName) {
        LoginPage loginPage = new LoginPage(webDriver);
        PAGES_STORAGE.put(pageName, loginPage);
        loginPage.open();
    }

    @When("User enters username as {string} and password as {string} on {string}")
    public void userEntersUsernameAsAndPasswordAs(String login, String password, String pageName) {
        PAGES_STORAGE.put("Home Page", ((LoginPage) PAGES_STORAGE.get(pageName)).login(login, password));
    }

    @When("User enters incorrect data username as {string} and password as {string} on {string}")
    public void userEntersIncorrectDataUsernameAsAndPasswordAsOn(String login, String pass, String pageName) {
        ((LoginPage) PAGES_STORAGE.get(pageName)).fillIncorrectData(login, pass);
    }

    @Then("User gets error message {string} on {string}")
    public void userGetsErrorMessage(String errorMessage, String pageName) {
        Assert.assertEquals(((LoginPage) PAGES_STORAGE.get(pageName)).clickSighInButtonAndReceiveErrorMessage(), errorMessage,
                "");
    }
}
