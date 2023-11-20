package loginTests;

import baseTest.MainTest;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
public class LoginTests2 extends MainTest{
    @Test
    public void testFailedLoginWithInValidEmailRestricted() throws InterruptedException {
        LoginPage loginPage = homePage.clickLoginButtonForLogin();
        loginPage = homePage.clickLoginField();
        loginPage.setEmail("shawky2020");
        loginPage.clickContinue();
        Thread.sleep(1000);
        assertEquals(loginPage.verifyAlertMassageforEmail(),"Invalid email address","Wrong Error Massage for Email");
    }
}
