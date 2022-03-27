package com.epam.cucumber.pageobject.pages;

import com.epam.cucumber.pageobject.BasePage;
import com.epam.cucumber.pageobject.modules.CartConfirmationPopUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
    @FindBy(id = "atc-area")
    private WebElement addToCartButton;

    public ProductPage(WebDriver webDriver) {
        super(webDriver);
    }

    public CartConfirmationPopUp addProductToCart() {
        addToCartButton.click();

        return new CartConfirmationPopUp(webDriver);
    }
}
