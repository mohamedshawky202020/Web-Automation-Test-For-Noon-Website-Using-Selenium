package signUpTests;

import baseTest.MainTest;
import org.testng.annotations.Test;
import pages.SignUpPage;

import static org.testng.Assert.assertEquals;

public class SignUpTests3 extends MainTest {
    @Test
    public void testFailedSingUpWithInValidEmailRestricted2() throws InterruptedException {
        SignUpPage signUpPage = homePage.clickLoginButtonForSignUp();
        signUpPage = homePage.clickSignUpField();
        signUpPage.setEmail("shawky2020@gmail");
        signUpPage.clickContinue();
        Thread.sleep(1000);
        assertEquals(signUpPage.verifyAlertMassageforEmail(),"Invalid email address","Wrong Error Massage for Email");
    }
}
