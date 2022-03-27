package com.epam.cucumber.invoker.implementation;

import com.epam.cucumber.invoker.WebDriverInvoker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocalFirefoxInvoker implements WebDriverInvoker {
    @Override
    public WebDriver invokeWebDriver() {
        WebDriverManager.firefoxdriver()
                .browserVersion("latest")
                .setup();

        return new FirefoxDriver();
    }
}
