package signUpTests;

import baseTest.MainTest;
import org.testng.annotations.Test;
import pages.SignUpPage;

import static org.testng.Assert.assertEquals;

public class SignUpTests2 extends MainTest {
    @Test
    public void testFailedSingUpWithInValidEmailRestricted() throws InterruptedException {
        SignUpPage signUpPage = homePage.clickLoginButtonForSignUp();
        signUpPage = homePage.clickSignUpField();
        signUpPage.setEmail("shawky2020");
        signUpPage.clickContinue();
        Thread.sleep(1000);
        assertEquals(signUpPage.verifyAlertMassageforEmail(),"Invalid email address","Wrong Error Massage for Email");
    }
}
