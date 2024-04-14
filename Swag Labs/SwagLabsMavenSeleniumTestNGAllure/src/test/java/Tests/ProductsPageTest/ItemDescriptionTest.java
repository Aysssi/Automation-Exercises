package Tests.ProductsPageTest;

import LoginPage.LoginFunctionality;
import ProductsPage.ItemDescription;
import Tests.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ItemDescriptionTest extends BaseTest {

    @BeforeMethod
    public void validateWithStandardUserAndPassword() throws InterruptedException {
        LoginFunctionality.verifyWithStandardUserAndPassword();
    }

    @Test
    public void validateTheProductTitleIsPresent(){
        ItemDescription.verifyTheProductTitleIsPresent();
    }

    @Test
    public void validateTheProductPictureIsPresent(){
        ItemDescription.verifyTheProductPictureIsPresent();
    }

    @Test
    public void validateTheProductDescriptionIsPresent(){
        ItemDescription.verifyTheProductDescriptionIsPresent();
    }

    @Test
    public void validateTheProductPriceIsPresent(){
        ItemDescription.verifyTheProductPriceIsPresent();
    }

    @Test
    public void validateTheAddToCartButtonIsPresent(){
        ItemDescription.verifyTheAddToCartButtonIsPresent();
    }

    @Test
    public void validateTheAddToCartButtonIsEnabled(){
        ItemDescription.verifyTheAddToCartButtonIsEnabled();
    }

    @Test
    public void validateTheAddToCartButtonIsChangedToRemoveButton(){
        ItemDescription.verifyTheAddToCartButtonIsChangedToRemoveButton();
    }

    @Test
    public void validateTheRemoveButtonIsEnable(){
        ItemDescription.verifyTheRemoveButtonIsEnable();
    }

    @Test
    public void validateRemoveButtonIsWorking(){
        ItemDescription.verifyRemoveButtonIsWorking();
    }

    @Test
    public void validateShoppingCartIsEnable(){
        ItemDescription.verifyShoppingCartIsEnable();
    }

}
