package com.epam.cucumber.pageobject.pages;

import com.epam.cucumber.pageobject.BasePage;
import com.epam.cucumber.pageobject.modules.ProfileDropDownModule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(css = "#gh-ug.gh-ug-guest")
    private WebElement signInButton;
    @FindBy(id = "gh-ug")
    private WebElement dropDownMenu;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage open() {
        webDriver.get("https://ebay.com/");

        return this;
    }

    public SignInPage clickOnSignInButton() {
        signInButton.click();

        return new SignInPage(webDriver);
    }

    public ProfileDropDownModule openProfileDropDown() {
        dropDownMenu.click();

        return new ProfileDropDownModule(webDriver);
    }
}
