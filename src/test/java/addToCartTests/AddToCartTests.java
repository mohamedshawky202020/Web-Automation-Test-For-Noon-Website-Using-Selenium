package addToCartTests;

import baseTest.MainTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RequiredProductPage;
import pages.SearchedProductsPage;

import static org.testng.Assert.assertTrue;

public class AddToCartTests extends MainTest {
    @Test
    public void testSuccessfullAddToCart() throws InterruptedException {
        LoginPage loginPage = homePage.clickLoginButtonForLogin();
        loginPage = homePage.clickLoginField();
        loginPage.setEmail("mohamedshawky202020@gmail.com");
        loginPage.clickContinue();
        loginPage.clickLoginWithPasswordField();
        loginPage.setPassword("123Sh@wky");
        loginPage.clickLoginButton();
        Thread.sleep(3000);
        SearchedProductsPage searchedProductsPage = homePage.searchForProduct("Energizer Battery");
        searchedProductsPage.forWait();
        RequiredProductPage requiredProductPage = searchedProductsPage.clickTheRequiredProduct();
        requiredProductPage.forWait();
        requiredProductPage.clickAddToCart();
        Thread.sleep(3000);
        assertTrue(requiredProductPage.verifyProductAdded());
    }
}
