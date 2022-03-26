package com.epam.cucumber.pageobject.pages;

import com.epam.cucumber.pageobject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {
    @FindBy(id = "userid")
    private WebElement usernameField;
    @FindBy(id = "pass")
    private WebElement passwordField;
    @FindBy(id = "signin-continue-btn")
    private WebElement continueButton;
    @FindBy(id = "sgnBt")
    private WebElement signInButton;

    protected SignInPage(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage login(String username, String password) {
        waitForTheAppearanceOf(usernameField).sendKeys(username);
        waitForTheAppearanceOf(continueButton).click();
        waitForTheAppearanceOf(passwordField).sendKeys(password);
        signInButton.click();

        return new HomePage(webDriver);
    }
}
