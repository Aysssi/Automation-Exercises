package Tests.ProductsPageTest;

import LoginPage.LoginFunctionality;

import ProductsPage.Menu;
import Tests.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenuTest extends BaseTest {

    @BeforeMethod
    public void validateWithStandardUserAndPassword() throws InterruptedException {
        LoginFunctionality.verifyWithStandardUserAndPassword();
    }


    @Test
    public void validateTheTotalNumberOfMenuOptions(){
        Menu.verifyTheTotalNumberOfMenuOptions();
    }
    @Test
    public void validateTheTitleOfAllOptionsInMenu() throws InterruptedException {
        Menu.verifyTheTitleOfAllOptionsInMenu();
    }

    @Test
    public void validateTheCloseMenuIsPresented() throws InterruptedException {
        Menu.verifyTheCloseMenuIsPresented();
    }

    @Test
    public void validateTheCloseMenuIsWorking() throws InterruptedException {
        Menu.verifyTheCloseMenuIsWorking();
    }

    @Test
    public void validateAllItemsLinkIsWorking() throws InterruptedException {
        Menu.verifyAllItemsLinkIsWorking();
    }

    @Test
    public void validateAboutLinkIsWorking() throws InterruptedException {
        Menu.verifyAboutLinkIsWorking();
    }

    @Test
    public void validateLogoutLinkIsWorking() throws InterruptedException {
        Menu.verifyLogoutLinkIsWorking();

    }
    @Test
    public void validateResetAppStateLinkIsWorking() throws InterruptedException {
        Menu.verifyResetAppStateLinkIsWorking();
    }
}
