package Tests.ShoppingCartPageTest;

import LoginPage.LoginFunctionality;
import ShoppingCartPage.Header;
import Tests.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HeaderTest extends BaseTest {
    @BeforeMethod
    public void validateWithStandardUserAndPassword() throws InterruptedException {
        LoginFunctionality.verifyWithStandardUserAndPassword();
    }

    @Test
    public void validateTheTitleInHeader() {
        Header.verifyTheTitleInHeader();
    }

    @Test
    public void validateTheMenuButtonIsPresented() {
        Header.verifyTheMenuButtonIsPresented();
    }

    @Test
    public void validateShoppingCartIconIsPresented(){
        Header.verifyShoppingCartIconIsPresented();
    }

    @Test
    public void validateTheMenuButtonIsEnable(){
        Header.verifyTheMenuButtonIsEnable();
    }

    @Test
    public void validateShoppingCartIconIsEnable(){
        Header.verifyShoppingCartIconIsEnable();
    }

    @Test
    public void validateShoppingCartIconIsWorking(){
        Header.verifyShoppingCartIconIsWorking();
    }

    @Test
    public void validateShoppingCartIconHasCorrectNumberOfAddedItems(){
        Header.verifyShoppingCartIconHasCorrectNumberOfAddedItems();
    }
    @Test
    public void validateTheMenuButtonIsWorking(){
        Header.verifyTheMenuButtonIsWorking();
    }

    @Test
    public void validateTheTitleOfAllOptionsInMenu() throws InterruptedException {
        Header.verifyTheTitleOfAllOptionsInMenu();
    }

}
