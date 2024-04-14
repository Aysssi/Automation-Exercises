package Tests.ProductsPageTest;

import LoginPage.LoginFunctionality;

import ProductsPage.ShoppingCart;
import Tests.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShoppingCartTest extends BaseTest {

    @BeforeMethod
    public void validateWithStandardUserAndPassword() throws InterruptedException {
        LoginFunctionality.verifyWithStandardUserAndPassword();
    }

    @Test
    public void validateTheShoppingCartIsPresented(){
        ShoppingCart.verifyTheShoppingCartIsPresented();
    }

    @Test
    public void validateTheItemIsAddedInTheShoppingCartPageCorrectly(){
        ShoppingCart.verifyTheItemIsAddedInTheShoppingCartPageCorrectly();
    }
    @Test
    public void validateShoppingCartIconIsUpdatedTheNumberItDisplayed() throws InterruptedException {
        ShoppingCart.verifyShoppingCartIconIsUpdatedTheNumberItDisplayed();
    }


}
