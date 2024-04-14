package Tests.ShoppingCartPageTest;

import LoginPage.LoginFunctionality;
import ShoppingCartPage.CartPage;
import Tests.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartPageTest extends BaseTest {

    @BeforeMethod
    public void validateWithStandardUserAndPassword() throws InterruptedException {
        LoginFunctionality.verifyWithStandardUserAndPassword();
    }

    @Test
    public void validateItemQTYIsPresented(){
        CartPage.verifyItemQTYIsPresented();
    }

    @Test
    public void validateTheItemDescriptionIsPresented(){
        CartPage.verifyTheItemDescriptionIsPresented();
    }

    @Test
    public void validateTheItemTitleIsClickable(){
        CartPage.verifyTheItemTitleIsClickable();
    }

    @Test
    public void validateTheItemTitleIsWorking(){
        CartPage.verifyTheItemTitleIsWorking();
    }

    @Test
    public void validateThePriceOfTheItemIsPresented(){
        CartPage.verifyThePriceOfTheItemIsPresented();
    }

    @Test
    public void validateTheRemoveButtonIsPresented(){
        CartPage.verifyTheRemoveButtonIsPresented();
    }

    @Test
    public void validateTheRemoveButtonIsWorking(){
        CartPage.verifyTheRemoveButtonIsWorking();
    }

    @Test
    public void validateTheCheckoutButtonIsPresented(){
        CartPage.verifyTheCheckoutButtonIsPresented();
    }

    @Test
    public void validateTheCheckoutButtonIsWorking(){
        CartPage.verifyTheCheckoutButtonIsWorking();
    }
}
