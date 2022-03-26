package com.epam.cucumber.steps;

import com.epam.cucumber.factory.WebDriverFactory;
import com.epam.cucumber.pageobject.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class BaseSteps {
    public static final Map<String, BasePage> PAGES_STORAGE = new HashMap<>();

    public static WebDriver webDriver;

    @Before
    public void initWebDriver() {
        webDriver = WebDriverFactory.getInstanceOfWebDriverFactory()
                .getWebDriver();
        webDriver.manage().window().maximize();
    }

    @After
    public void afterScenario() {
        webDriver.close();
        webDriver.quit();

        PAGES_STORAGE.clear();
    }
}
