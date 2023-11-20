package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class RequiredProductPage {
    private WebDriver driver;
    private By addToCart = By.cssSelector(".kWimRG");
    private By productAdded = By.cssSelector(".jAgHcr");
    public RequiredProductPage(WebDriver driver) {
        this.driver = driver;
    }
    public void forWait(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void clickAddToCart() {
        driver.findElement(addToCart).click();
    }
    public Boolean verifyProductAdded() {
        return driver.findElement(productAdded).isDisplayed();
    }
}
