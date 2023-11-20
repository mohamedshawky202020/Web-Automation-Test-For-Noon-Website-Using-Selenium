package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    private WebDriver driver;
    private By emailField = By.id("emailInput");
    private By continueButton = By.id("login-submit");
    private By loginWithPasswordField = By.xpath("//div[text()='Log in with password']");
    private By passWordField = By.id("password");
    private By loginButton = By.className("bGzTaL");
    private By loginCheck = By.cssSelector(".sc-4e5ed0b1-4.cjlIut");
    private By alertMassagePassword = By.className("error-message");
    private By alertMassageEmail = By.cssSelector(".hctYXO");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }
    public void clickContinue() {
        driver.findElement(continueButton).click();
    }
    public void clickLoginWithPasswordField() {
        driver.findElement(loginWithPasswordField).click();
    }
    public void setPassword(String password) {
        driver.findElement(passWordField).sendKeys(password);
    }
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
    public boolean getLoggedin() {
        return driver.findElement(loginCheck).isDisplayed();
    }
    public String verifyAlertMassageforPassword() {
        return driver.findElement(alertMassagePassword).getText();
    }
    public String verifyAlertMassageforEmail() {
        return driver.findElement(alertMassageEmail).getText();
    }
    public void forWait() {
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
    }
}
