package com.epam.cucumber.pageobject.modules;


import com.epam.cucumber.pageobject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileDropDownModule extends BasePage {
    @FindBy(xpath = "//strong[text()=\"gavura256\"]")
    private WebElement userInfo;

    public ProfileDropDownModule(WebDriver webDriver) {
        super(webDriver);
    }

    public String getUserNameInfo() {
        return waitForTheAppearanceOf(userInfo).getText();
    }
}
