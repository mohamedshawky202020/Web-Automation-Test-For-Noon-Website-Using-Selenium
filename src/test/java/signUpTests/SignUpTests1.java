package signUpTests;

import baseTest.MainTest;
import org.testng.annotations.Test;
import pages.SignUpPage;

import static org.testng.Assert.assertEquals;

public class SignUpTests1 extends MainTest {
    @Test
    public void testSuccessfullSignUp() {
        SignUpPage signUpPage = homePage.clickLoginButtonForSignUp();
        signUpPage = homePage.clickSignUpField();
        signUpPage.setEmail("mowabi4309@nexxterp.com");
        signUpPage.clickContinue();
        assertEquals(signUpPage.getVerifyEmail(),"Verify your email");
    }
}
