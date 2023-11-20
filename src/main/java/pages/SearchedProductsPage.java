package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SearchedProductsPage {
    private WebDriver driver;
    private By theRequiredProduct = By.id("productBox-N36132222A");
    private By addToWishList = By.cssSelector(".gUfKpe");
    private By alertMassage = By.cssSelector(".bKkoWt");
    public SearchedProductsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void forWait(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    public RequiredProductPage clickTheRequiredProduct() {
        driver.findElement(theRequiredProduct).click();
        return new RequiredProductPage(driver);
    }
    public void clickAddToWishList() {
        driver.findElement(addToWishList).click();
    }
    public Boolean verifyAlertMassage() {
        return driver.findElement(alertMassage).isDisplayed();
    }
}
