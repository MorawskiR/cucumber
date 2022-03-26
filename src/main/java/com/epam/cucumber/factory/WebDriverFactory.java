package com.epam.cucumber.factory;

import com.epam.cucumber.enumeration.SupportedBrowsers;
import com.epam.cucumber.properties.conventors.SupportedBrowserConverter;
import com.epam.cucumber.properties.holder.PropertyHolder;
import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
    private static WebDriverFactory instanceOfWebDriverFactory = null;

    public WebDriver getWebDriver() {
        String propertyValue = new PropertyHolder().readProperty("browser");
        SupportedBrowsers browser = SupportedBrowserConverter.valueOfWebBrowser(propertyValue);

        return browser.getWebDriver();
    }

    public static  WebDriverFactory getInstanceOfWebDriverFactory() {
        if (instanceOfWebDriverFactory == null) {
            instanceOfWebDriverFactory = new WebDriverFactory();
        }

        return instanceOfWebDriverFactory;
    }
}
