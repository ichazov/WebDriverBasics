package com.epam.automation;

import com.epam.automation.pages.BookDepositoryHomePage;
import com.epam.automation.pages.BookDepositorySearchResultsPage;
import com.epam.automation.pages.ModalWindow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.bookdepository.com/");

        BookDepositoryHomePage bookDepositoryHomePage = new BookDepositoryHomePage(chromeDriver);

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

        bookDepositoryHomePage.enterSearchQuery("camileo");
        bookDepositoryHomePage.clickSearchButton();

        BookDepositorySearchResultsPage bookDepositorySearchResultsPage = new BookDepositorySearchResultsPage(chromeDriver);
        bookDepositorySearchResultsPage.findAmongSearchResultsAndAddToBasket("Camileo H30");

        ModalWindow modalWindow = new ModalWindow(chromeDriver);
        modalWindow.closeModalWindow();

        bookDepositorySearchResultsPage.openProductPage("Camileo H30");

        chromeDriver.quit();
    }
}