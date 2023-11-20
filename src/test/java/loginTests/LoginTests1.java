package loginTests;

import baseTest.MainTest;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTests1 extends MainTest {
    @Test
    public void testSuccessfullLoginWithValidEmailAndValidPassword() {
        LoginPage loginPage = homePage.clickLoginButtonForLogin();
        loginPage = homePage.clickLoginField();
        loginPage.setEmail("mohamedshawky202020@gmail.com");
        loginPage.clickContinue();
        loginPage.clickLoginWithPasswordField();
        loginPage.setPassword("123Sh@wky");
        loginPage.clickLoginButton();
        assertTrue(loginPage.getLoggedin());
    }
}
