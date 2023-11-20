package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SignUpPage {
    private WebDriver driver;
    private By alertMassageEmail = By.cssSelector(".hctYXO");
    private By emailField = By.id("emailInput");
    private By continueButton = By.id("login-submit");
    private By verifyEmail = By.xpath("//h3[text()='Verify your email']");
    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }
    public void clickContinue() {
        driver.findElement(continueButton).click();
    }
    public String getVerifyEmail () {
        return driver.findElement(verifyEmail).getText();
    }
    public String verifyAlertMassageforEmail() {
        return driver.findElement(alertMassageEmail).getText();
    }
    public void forWait() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
}
