package com.epam.cucumber.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

import static com.epam.cucumber.properties.Properties.EXPLICIT_WAIT;

public abstract class BasePage {
    protected WebDriver webDriver;

    protected BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    protected WebElement waitForTheAppearanceOf(WebElement element) {
        new WebDriverWait(webDriver, Duration.ofSeconds(EXPLICIT_WAIT))
                .until(ExpectedConditions.visibilityOf(element));

        return element;
    }

    public void waitForPageLoad() {

        Wait<WebDriver> wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
        wait.until(driver -> String
                .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
                .equals("complete"));
    }
}
