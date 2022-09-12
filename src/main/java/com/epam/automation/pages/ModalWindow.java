package com.epam.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModalWindow extends BasePage {
    public ModalWindow(WebDriver driver) {
        super(driver);
    }
    private final By modal = new By.ByXPath("//div[@class='modal-content']");
    private final By closeButtonLocator = new By.ByXPath("//button[@class='close']");
    public void closeModalWindow() {
        waitUntilPageIsLoaded();
        driver.findElement(modal).findElement(closeButtonLocator).click();
    }
}