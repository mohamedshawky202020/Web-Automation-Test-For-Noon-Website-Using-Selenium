package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HomePage{
    private WebDriver driver;
    private By loginButton = By.cssSelector("[data-qa='btn_header_signInOrUp']");
    private By signUpField = By.cssSelector(".kMBJFx");
    private By LoginField = By.cssSelector(".cKocov");
    private By searchBar = By.id("searchBar");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public SignUpPage clickLoginButtonForSignUp() {
        driver.findElement(loginButton).click();
        return new SignUpPage(driver);
    }
    public SignUpPage clickSignUpField() {
        driver.findElement(signUpField).click();
        return new SignUpPage(driver);
    }
    public LoginPage clickLoginButtonForLogin () {
        driver.findElement(loginButton).click();
        return new LoginPage(driver);
    }
    public LoginPage clickLoginField() {
        driver.findElement(LoginField).click();
        return new LoginPage(driver);
    }
    public SearchedProductsPage searchForProduct(String productName) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(searchBar).sendKeys(productName);
        System.out.println("Before Enter");
        driver.findElement(searchBar).sendKeys(Keys.ENTER);
        System.out.println("After Enter");
        return new SearchedProductsPage(driver);
    }
}
