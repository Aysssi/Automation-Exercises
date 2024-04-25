package Tests.ProductsPageTest;

import LoginPage.LoginFunctionality;

import ProductsPage.ShoppingCart;
import Tests.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShoppingCartTest extends BaseTest {

    @BeforeMethod
    public void validateWithStandardUserAndPassword() throws InterruptedException {
        LoginFunctionality.verifyWithStandardUserAndPassword();
    }

    @Test
    public void validateTheShoppingCartIsPresented(){
        Assert.assertTrue(ShoppingCart.verifyTheShoppingCartIsPresented().isDisplayed());
    }

    @Test
    public void validateTheItemIsAddedInTheShoppingCartPageCorrectly(){
        Assert.assertTrue(ShoppingCart.verifyTheItemIsAddedInTheShoppingCartPageCorrectly().isDisplayed());
    }
    @Test
    public void validateShoppingCartIconIsUpdatedTheNumberItDisplayed() {
        String expectedShoppingCartCount = "2";
        String actualShoppingCartCount = ShoppingCart.verifyShoppingCartIconIsUpdatedTheNumberItDisplayed();
        Assert.assertEquals(actualShoppingCartCount,expectedShoppingCartCount);
    }


}
