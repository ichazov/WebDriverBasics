package com.epam.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
public class BookDepositorySearchResultsPage extends BasePage {
    public BookDepositorySearchResultsPage(WebDriver driver) {
        super(driver);
    }
    private final By productLocator = new By.ByXPath("//div[@class='book-item']");
    private final By addToBasketButtonLocator = new By.ByXPath("//a[@class='btn btn-sm btn-primary add-to-basket']");
    private List < WebElement > getListOfProducts() {
        return driver.findElements(productLocator);
    }
    public void findAmongSearchResultsAndAddToBasket(String containsText) {
        List < WebElement > books = getListOfProducts();
        for (WebElement book:
                books) {
            if (book.getText().contains(containsText)) {
                book.findElement(addToBasketButtonLocator).click();
            }
        }
    }
    public void openProductPage(String containsText) {
        List < WebElement > books = getListOfProducts();
        for (WebElement book:
                books) {
            if (book.getText().contains(containsText)) {
                book.click();
            }
        }
    }
}