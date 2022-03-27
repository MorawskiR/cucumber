package com.epam.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.epam.cucumber.steps"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
