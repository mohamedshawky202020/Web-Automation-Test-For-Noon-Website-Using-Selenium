package loginTests;

import baseTest.MainTest;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;

public class LoginTests3 extends MainTest {
    @Test
    public void testFailedLoginWithInValidEmailRestricted2() throws InterruptedException {
        LoginPage loginPage = homePage.clickLoginButtonForLogin();
        loginPage = homePage.clickLoginField();
        loginPage.setEmail("shawky2020@gmail");
        loginPage.clickContinue();
        Thread.sleep(1000);
        assertEquals(loginPage.verifyAlertMassageforEmail(),"Invalid email address","Wrong Error Massage for Email");
    }
}
