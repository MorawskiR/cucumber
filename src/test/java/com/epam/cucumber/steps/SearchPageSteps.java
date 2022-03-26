package com.epam.cucumber.steps;

import com.epam.cucumber.pageobject.pages.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.epam.cucumber.steps.BaseSteps.PAGES_STORAGE;
import static com.epam.cucumber.steps.BaseSteps.webDriver;

public class SearchPageSteps {
    @Given("User open {string}")
    public void userOpen(String pageName) {
        SearchPage searchPage = new SearchPage(webDriver);
        PAGES_STORAGE.put(pageName, searchPage.open());
    }

    @When("User searches for {string} on {string}")
    public void userSearchesForOn(String itemName, String pageName) {
        PAGES_STORAGE.put(pageName, ((SearchPage) PAGES_STORAGE.get(pageName)).searchFor(itemName));
    }

    @Then("User sees items as search results with {string} in titles on {string}")
    public void userSeesItemsAsSearchResultsWithInTitlesOn(String itemName, String pageName) {
        Assert.assertTrue(((SearchPage)PAGES_STORAGE.get(pageName)).searchResultsContainInTheDescriptions(itemName),
                "One or more search results don't contain ".concat(itemName));
    }
    @Then("User sees message {string} on {string}")
    public void userSeesMessageOn(String errorMessage, String pageName){
        Assert.assertEquals(((SearchPage)PAGES_STORAGE.get(pageName)).getErrorMessageForIncorrectSearching(),
                errorMessage, "Search finds products for incorrect data");
    }
}
