package com.epam.cucumber.pageobject.pages;

import com.epam.cucumber.pageobject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends BasePage {
    @FindBy(id = "gh-ac")
    private WebElement searchBox;
    @FindBy(id = "gh-btn")
    private WebElement searchButton;
    @FindBy(className = "s-item__title")
    private List<WebElement> titles;
    @FindBy(className = "srp-save-null-search__heading")
    private WebElement errorMessageForIncorrectSearching;

    public SearchPage(WebDriver webDriver) {
        super(webDriver);
    }

    public SearchPage open() {
        webDriver.get("https://www.ebay.com/n/all-categories");

        return this;
    }

    public SearchPage searchFor(String itemName) {
        searchBox.sendKeys(itemName);
        searchButton.click();

        return this;
    }

    public boolean searchResultsContainInTheDescriptions(String itemName) {
        waitForPageLoad();

        return titles.stream()
                .skip(1)
                .map(element -> element.getText().toLowerCase())
                .anyMatch(title -> title.contains(itemName.toLowerCase()));
    }

    public String getErrorMessageForIncorrectSearching() {
        return errorMessageForIncorrectSearching.getText();
    }
}
