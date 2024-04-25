package Tests.ProductsPageTest;

import LoginPage.LoginFunctionality;
import ProductsPage.ItemDescription;
import Tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ItemDescriptionTest extends BaseTest {

    @BeforeMethod
    public void validateWithStandardUserAndPassword() throws InterruptedException {
        LoginFunctionality.verifyWithStandardUserAndPassword();
    }

    @Test
    public void validateTheProductTitleIsPresent(){
        Assert.assertTrue( ItemDescription.verifyTheProductTitleIsPresent().isDisplayed());
    }

    @Test
    public void validateTheProductImageIsPresent(){
        Assert.assertTrue(ItemDescription.verifyTheProductImageIsPresent().isDisplayed());
    }

    @Test
    public void validateTheProductDescriptionIsPresent(){
        Assert.assertTrue(ItemDescription.verifyTheProductDescriptionIsPresent().isDisplayed());
    }

    @Test
    public void validateTheProductPriceIsPresent(){
        Assert.assertTrue(ItemDescription.verifyTheProductPriceIsPresent().isDisplayed());
    }

    @Test
    public void validateTheAddToCartButtonIsPresent(){
        Assert.assertTrue(ItemDescription.verifyTheAddToCartButtonIsPresent().isDisplayed());
    }

    @Test
    public void validateTheAddToCartButtonIsEnabled(){
        Assert.assertTrue(ItemDescription.verifyTheAddToCartButtonIsEnabled().isEnabled());
    }

    @Test
    public void validateTheAddToCartButtonIsChangedToRemoveButton(){
        Assert.assertTrue(ItemDescription.verifyTheAddToCartButtonIsChangedToRemoveButton().isDisplayed());
    }

    @Test
    public void validateTheRemoveButtonIsEnable(){
        Assert.assertTrue(ItemDescription.verifyTheRemoveButtonIsEnable().isEnabled());
    }

    @Test
    public void validateRemoveButtonIsWorking(){
         Assert.assertTrue(ItemDescription.verifyRemoveButtonIsWorking());
    }

    @Test
    public void validateShoppingCartIsEnable(){
        Assert.assertTrue( ItemDescription.verifyShoppingCartIsEnable().isEnabled());
    }

}
