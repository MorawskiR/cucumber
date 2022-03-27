package com.epam.cucumber.steps;

import com.epam.cucumber.pageobject.pages.ProductPage;
import io.cucumber.java.en.And;

import static com.epam.cucumber.steps.BaseSteps.PAGES_STORAGE;

public class ProductPageSteps {
    @And("User adds product to cart on {string}")
    public void userAddsProductToCartOn(String pageName) {
        PAGES_STORAGE.put("Cart Confirmation Pop-up", ((ProductPage)PAGES_STORAGE.get(pageName)).addProductToCart());
    }
}
