package com.epam.automation.pages;

import com.epam.automation.waits.CustomConditions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public void waitUntilPageIsLoaded() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(CustomConditions.jQueryAJAXsCompleted());
    }
}
