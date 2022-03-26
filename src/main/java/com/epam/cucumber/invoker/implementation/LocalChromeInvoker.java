package com.epam.cucumber.invoker.implementation;

import com.epam.cucumber.invoker.WebDriverInvoker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocalChromeInvoker implements WebDriverInvoker {
    @Override
    public WebDriver invokeWebDriver() {

        return new ChromeDriver();
    }
}
