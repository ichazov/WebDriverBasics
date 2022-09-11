package com.epam.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {

        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.bookdepository.com/");

        new WebDriverWait(chromeDriver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("book-search-form")));

        WebElement logo = chromeDriver
                .findElement(By.xpath("//img[@alt='Bookdepository.com']"));
        WebElement signInJoin = chromeDriver
                .findElement(By.xpath("//a[@href='/account/login/to/account']"));
        WebElement userIcon = chromeDriver
                .findElement(By.xpath("//i[@class='icon-user']"));
        WebElement navBar = chromeDriver
                .findElement(By.xpath("//div[@class='user-nav']"));
        WebElement adBanner = chromeDriver
                .findElement(By.xpath("//div[@class='tab-wrap module type-link grid tab-14548 tab-active']"));

        WebElement searchInputField = chromeDriver
                .findElement(By.xpath("//input[@name='searchTerm']"));
        searchInputField.click();
        searchInputField.sendKeys("camileo");

        WebElement searchButton = chromeDriver
                .findElement(By.xpath("//button[@class='header-search-btn']"));
        searchButton.click();

        new WebDriverWait(chromeDriver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='tab search']")));

        WebElement searchResultsPage = chromeDriver.findElement(By.xpath("//div[@class='tab search']"));
        searchResultsPage
                .findElement(By.xpath("//*[contains(text(), 'Camileo H30')]"))
                .findElement(By.xpath("//*[@class='btn btn-sm btn-primary add-to-basket']"))
                .click();

        new WebDriverWait(chromeDriver, Duration.ofSeconds(5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='modal-content']")));

        WebElement modalWindow = chromeDriver.findElement(By.xpath("//div[@class='modal-content']"));
        modalWindow
                .findElement(By.xpath("//button[@class='close']"))
                .click();

        searchResultsPage
                .findElement(By.xpath("//*[contains(text(), 'Camileo H30')]"))
                .click();

        chromeDriver.quit();
    }
}