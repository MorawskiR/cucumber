package com.epam.cucumber.enumeration;

import com.epam.cucumber.invoker.WebDriverInvoker;
import com.epam.cucumber.invoker.implementation.LocalChromeInvoker;
import com.epam.cucumber.invoker.implementation.LocalFirefoxInvoker;
import org.openqa.selenium.WebDriver;

public enum SupportedBrowsers {
    LOCAL_CHROME(new LocalChromeInvoker()),
    LOCAL_FIREFOX(new LocalFirefoxInvoker());

    private final WebDriverInvoker webDriverInvoker;

    SupportedBrowsers(WebDriverInvoker webDriverInvoker) {
        this.webDriverInvoker = webDriverInvoker;
    }

    public WebDriver getWebDriver() {

        return webDriverInvoker.invokeWebDriver();
    }
}
