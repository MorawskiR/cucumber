package com.epam.cucumber.pageobject.pages;

import com.epam.cucumber.pageobject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DealsPage extends BasePage {
    @FindBy(className = "ebayui-ellipsis-3")
    private WebElement spotlightDeal;

    public DealsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public DealsPage open() {
        webDriver.get("https://www.ebay.com/deals");

        return this;
    }

    public ProductPage clickOnSpotlightDealProduct() {
        spotlightDeal.click();

        return new ProductPage(webDriver);
    }
}
