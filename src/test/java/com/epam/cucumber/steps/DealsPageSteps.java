package com.epam.cucumber.steps;

import com.epam.cucumber.pageobject.pages.DealsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static com.epam.cucumber.steps.BaseSteps.PAGES_STORAGE;
import static com.epam.cucumber.steps.BaseSteps.webDriver;

public class DealsPageSteps {
    private final DealsPage dealsPage = new DealsPage(webDriver);

    @Given("User is on the {string}")
    public void userIsOnThe(String pageName) {
        PAGES_STORAGE.put(pageName, dealsPage.open());
    }

    @When("User click on spotlight deal on {string}")
    public void userClickOnSpotlightDealOn(String pageName) {
        PAGES_STORAGE.put("Product Page",
                ((DealsPage) PAGES_STORAGE.get(pageName)).clickOnSpotlightDealProduct());
    }
}
