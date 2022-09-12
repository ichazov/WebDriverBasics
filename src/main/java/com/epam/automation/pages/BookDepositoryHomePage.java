package com.epam.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookDepositoryHomePage extends BasePage {
    public BookDepositoryHomePage(WebDriver driver) {
        super(driver);
    }
    private final By searchFieldLocator = new By.ByXPath("//input[@name='searchTerm']");
    private final By searchButtonLocator = new By.ByXPath("//button[@class='header-search-btn']");
    public void enterSearchQuery(String searchQuery) {
        waitUntilPageIsLoaded();
        driver.findElement(searchFieldLocator).sendKeys(searchQuery);
    }
    public void clickSearchButton() {
        driver.findElement(searchButtonLocator).click();
    }
}