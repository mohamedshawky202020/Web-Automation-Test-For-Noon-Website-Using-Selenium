package addToWishList;

import baseTest.MainTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SearchedProductsPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
public class RemoveFromWishList extends MainTest{
    @Test
    public void testSuccessfullRemoveFromWishList() throws InterruptedException {
        LoginPage loginPage = homePage.clickLoginButtonForLogin();
        loginPage = homePage.clickLoginField();
        loginPage.setEmail("mohamedshawky202020@gmail.com");
        loginPage.clickContinue();
        loginPage.clickLoginWithPasswordField();
        loginPage.setPassword("123Sh@wky");
        loginPage.clickLoginButton();
        loginPage.forWait();
        Thread.sleep(2000);
        SearchedProductsPage searchedProductsPage = homePage.searchForProduct("Energizer Battery");
        Thread.sleep(3000);
        searchedProductsPage.clickAddToWishList();
        Thread.sleep(3000);
        assertTrue(searchedProductsPage.verifyAlertMassage());
    }
}
