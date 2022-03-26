package com.epam.cucumber.steps;

import com.epam.cucumber.pageobject.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.epam.cucumber.steps.BaseSteps.PAGES_STORAGE;
import static com.epam.cucumber.steps.BaseSteps.webDriver;

public class HomePageSteps {
    private final HomePage homePage = new HomePage(webDriver);


    @Given("User is on {string}")
    public void userIsOn(String pageName) {
        PAGES_STORAGE.put(pageName, homePage.open());
    }

    @When("User navigates to {string}")
    public void userNavigatesTo(String pageName) {
        PAGES_STORAGE.put(pageName, homePage.clickOnSignInButton());

    }

    @Then("User is successfully navigated to the {string}")
    public void userIsSuccessfullyNavigatedToTheHomePage(String expectedUrl) {
        Assert.assertEquals(webDriver.getCurrentUrl(), expectedUrl);
    }

    @And("User info {string} on {string} is present on navigation panel")
    public void userInfoIsPresentOnNavigationPanel(String expectedUserInfo, String pageName) {
        String userInfo = ((HomePage) PAGES_STORAGE.get(pageName))
                .openProfileDropDown()
                .getUserNameInfo();
        Assert.assertEquals(userInfo, expectedUserInfo, "Username is wrong");
    }
}
