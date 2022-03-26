package com.epam.cucumber.properties.holder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyHolder {
    public static final String BROWSER_PROPERTIES = "src/test/resources/browser.properties";
    private final Properties properties = new Properties();

    public PropertyHolder() {
        try (FileInputStream fis = new FileInputStream(BROWSER_PROPERTIES)) {
            properties.load(fis);
        } catch (IOException e) {
            Logger logger = LoggerFactory.getLogger(PropertyHolder.class);
            logger.error(e.getMessage());
        }
    }

    public String readProperty(String propertyName) {
        return properties.getProperty(propertyName);
    }
}
