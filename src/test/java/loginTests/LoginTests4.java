package loginTests;

import baseTest.MainTest;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;

public class LoginTests4 extends MainTest {
    @Test
    public void testFailedLoginWithInValidEmailRestricted3() throws InterruptedException {
        LoginPage loginPage = homePage.clickLoginButtonForLogin();
        loginPage = homePage.clickLoginField();
        loginPage.setEmail("shawky2020@gmail.net");
        loginPage.clickContinue();
        Thread.sleep(1000);
        assertEquals(loginPage.verifyAlertMassageforEmail(),"Invalid email address","Wrong Error Massage for Email");
    }
}
