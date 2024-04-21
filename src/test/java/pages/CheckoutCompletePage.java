package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

/**
 * Class for the CheckoutComplete page PageObject
 */
public class CheckoutCompletePage extends BasePage {
    
    private By homeButton;

    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
        pageURL = "https://www.saucedemo.com/checkout-complete.html";

        homeButton = By.id("back-to-products");
    }

    /**
     * Clicks the Home button
     * @return an InventoryPage instance
     */
    public InventoryPage clickHomeButton() {
        logger.debug("Click Home button");
        driver.findElement(homeButton).click();

        InventoryPage inventoryPage = new InventoryPage(driver);
        return inventoryPage;
    }
}
