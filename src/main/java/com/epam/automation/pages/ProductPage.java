package com.epam.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }
    private final By productDetailsLocator = new By.ByXPath("//div[@class='biblio-wrap']");
}