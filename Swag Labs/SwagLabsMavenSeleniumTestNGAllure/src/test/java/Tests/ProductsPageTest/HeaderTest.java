package Tests.ProductsPageTest;

import LoginPage.LoginFunctionality;
import ProductsPage.Header;
import Tests.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HeaderTest extends BaseTest {

    @BeforeMethod
    public void validateWithStandardUserAndPassword() throws InterruptedException {
        LoginFunctionality.verifyWithStandardUserAndPassword();
    }

    @Test
    public void validateTheTitleInHeader(){
        Header.verifyTheTitleInHeader();
    }

    @Test
    public void validateMenuIsDisplayed(){
        Header.verifyMenuButtonIsPresent();
    }

    @Test
   public void validateShoppingCartIconIsPresent(){
        Header.verifyShoppingCartIconIsPresent();
    }

    @Test
    public void validateMenuButtonIsEnabled(){
        Header.verifyMenuButtonIsEnabled();
    }

    @Test
    public void validateShoppingCartIconIsEnabled(){
        Header.verifyShoppingCartIconIsEnabled();
    }

    @Test
    public void validateMenuButtonIsWorking(){
        Header.verifyMenuButtonIsWorking();
    }

    @Test
    public void validateShoppingCartIconIsWorking(){
        Header.verifyShoppingCartIconIsWorking();
    }

    @Test
    public void validateShoppingCartIconHasCorrectNumberOfAddedItems(){
        Header.verifyShoppingCartIconHasCorrectNumberOfAddedItems();
    }

}
