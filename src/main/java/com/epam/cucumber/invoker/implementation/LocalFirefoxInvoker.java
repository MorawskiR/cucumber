package com.epam.cucumber.invoker.implementation;

//import io.github.bonigarcia.wdm.WebDriverManager;
import com.epam.cucumber.invoker.WebDriverInvoker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocalFirefoxInvoker implements WebDriverInvoker {
    @Override
    public WebDriver invokeWebDriver() {
//        WebDriverManager.firefoxdriver()
//                .browserVersion("99")
//                .setup();

        return new FirefoxDriver();
    }
}
