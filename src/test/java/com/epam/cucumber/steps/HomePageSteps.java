package com.epam.cucumber.steps;

import com.epam.cucumber.pageobject.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.epam.cucumber.steps.BaseSteps.PAGES_STORAGE;
import static com.epam.cucumber.steps.BaseSteps.webDriver;

public class HomePageSteps {
    @Then("User is successfully navigated to the {string}")
    public void userIsSuccessfullyNavigatedToTheHomePage(String expectedUrl) {
        Assert.assertEquals(expectedUrl, webDriver.getCurrentUrl());
    }

    @And("User info {string} on {string} is present on navigation panel")
    public void userInfoIsPresentOnNavigationPanel(String expectedUserInfo, String pageName) {
        String userInfo = ((HomePage) PAGES_STORAGE.get(pageName)).openProfileDropDown().getUserNameInfo();
        Assert.assertEquals(userInfo, expectedUserInfo, "Username is wrong");
    }
}
