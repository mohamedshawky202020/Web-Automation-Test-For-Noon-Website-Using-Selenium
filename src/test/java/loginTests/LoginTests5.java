package loginTests;

import baseTest.MainTest;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;

public class LoginTests5 extends MainTest {
    @Test
    public void testFailedLoginWithValidEmailAndInValidPasswordRestricted() throws InterruptedException {
        LoginPage loginPage = homePage.clickLoginButtonForLogin();
        loginPage = homePage.clickLoginField();
        loginPage.setEmail("mohamedshawky202020@gmail.com");
        loginPage.clickContinue();
        loginPage.clickLoginWithPasswordField();
        loginPage.setPassword("12345");
        loginPage.clickLoginButton();
        Thread.sleep(1000);
        assertEquals(loginPage.verifyAlertMassageforPassword(),"Invalid password","Wrong Error Massage For Password");
    }
}
