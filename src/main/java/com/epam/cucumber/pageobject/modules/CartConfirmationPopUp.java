package com.epam.cucumber.pageobject.modules;

import com.epam.cucumber.pageobject.BasePage;
import com.epam.cucumber.pageobject.pages.CartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartConfirmationPopUp extends BasePage {
    @FindBy(className = "vi-overlayTitleBar")
    private WebElement popUpTitle;
    @FindBy(xpath = "//div[@class=\"app-atc-layer__actionRow\"]/a[@class=\"btn btn-scnd vi-VR-btnWdth-XL\"]")
    private WebElement goToCartButton;

    public CartConfirmationPopUp(WebDriver webDriver) {
        super(webDriver);
    }

    public String getPopUpText() {
        webDriver.switchTo().activeElement();

        return waitForTheAppearanceOf(popUpTitle).getText();
    }

    public CartPage navigateToCart() {
        webDriver.switchTo().activeElement();
        waitForTheAppearanceOf(goToCartButton).click();

        return new CartPage(webDriver);
    }
}
