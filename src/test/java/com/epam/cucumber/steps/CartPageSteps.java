package com.epam.cucumber.steps;

import com.epam.cucumber.pageobject.modules.CartConfirmationPopUp;
import com.epam.cucumber.pageobject.pages.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.epam.cucumber.steps.BaseSteps.PAGES_STORAGE;

public class CartPageSteps {
    @Then("{string} should contain text {string}")
    public void popUpShouldContainText(String pageName, String message) {
        String actualMessageFromPupUp = ((CartConfirmationPopUp) PAGES_STORAGE.get(pageName)).getPopUpText();

        Assert.assertEquals(actualMessageFromPupUp, message,
                "Cart confirmation pop-up doesn't contain message: ".concat(message));
    }

    @And("User navigate to {string}")
    public void userNavigateTo(String pageName) {
        PAGES_STORAGE.put(pageName,
                ((CartConfirmationPopUp) PAGES_STORAGE.get("Cart Confirmation Pop-up")).navigateToCart());
    }

    @And("User remove product from {string}")
    public void userRemoveProductFrom(String pageName) {
        PAGES_STORAGE.put(pageName,
                ((CartPage) PAGES_STORAGE.get(pageName)).removeSingleItemFromCart());
    }

    @Then("{string} should contain message {string}")
    public void shouldContainMessage(String pageName, String emptyCartMessage) {
        String actualEmptyCartMessage = ((CartPage) PAGES_STORAGE.get(pageName)).getEmptyCartMessage();

        Assert.assertEquals(actualEmptyCartMessage, emptyCartMessage,
                "Cart does not contain message: ".concat(emptyCartMessage));
    }
}
