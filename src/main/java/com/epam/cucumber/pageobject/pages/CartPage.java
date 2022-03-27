package com.epam.cucumber.pageobject.pages;

import com.epam.cucumber.pageobject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    @FindBy(xpath = "//button[@data-test-id=\"cart-remove-item\"]")
    private WebElement removeSingleItemFromCartButton;
    @FindBy(xpath = "//div[@class=\"empty-cart\"]/div[@class=\"font-title-3\"]//span")
    private WebElement emptyCartMessage;

    public CartPage(WebDriver webDriver) {
        super(webDriver);
    }

    public CartPage removeSingleItemFromCart() {
        waitForTheAppearanceOf(removeSingleItemFromCartButton).click();

        return this;
    }

    public String getEmptyCartMessage() {
        return waitForTheAppearanceOf(emptyCartMessage).getText();
    }
}
