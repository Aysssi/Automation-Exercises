package Tests.ProductsPageTest;

import LoginPage.LoginFunctionality;

import ProductsPage.Menu;
import Tests.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class MenuTest extends BaseTest {

    @BeforeMethod
    public void validateWithStandardUserAndPassword() throws InterruptedException {
        LoginFunctionality.verifyWithStandardUserAndPassword();
    }


    @Test
    public void validateTheTotalNumberOfMenuOptions(){
        int expectedMenuOptionsSize = 4;
        Assert.assertEquals(Menu.verifyTheTotalNumberOfMenuOptions(),expectedMenuOptionsSize);
    }
    @Test
    public void validateTheTitleOfAllOptionsInMenu() throws InterruptedException {
        List<WebElement> menuOptionsTag = Menu.verifyTheTitleOfAllOptionsInMenu();
        List<String> menuOptionsList = new ArrayList<>();

        for (WebElement option : menuOptionsTag){
            String title = option.getText();
            menuOptionsList.add(title);
        }
        String title0 = menuOptionsList.get(0) ;
        String title1 = menuOptionsList.get(1);
        String title2 = menuOptionsList.get(2);
        String title3 = menuOptionsList.get(3);

        Assert.assertEquals(title0, "All Items");
        Assert.assertEquals(title1, "About");
        Assert.assertEquals(title2, "Logout");
        Assert.assertEquals(title3, "Reset App State");
    }

    @Test
    public void validateTheCloseMenuIsPresented() throws InterruptedException {
        Assert.assertTrue(Menu.verifyTheCloseMenuIsPresented().isDisplayed());
    }

    @Test
    public void validateTheCloseMenuIsWorking() throws InterruptedException {
        Assert.assertFalse(Menu.verifyTheCloseMenuIsWorking().isDisplayed());
    }

    @Test
    public void validateAllItemsLinkIsWorking() throws InterruptedException {
        String expectedPage = "https://www.saucedemo.com/inventory.html";
        String actualPage = Menu.verifyAllItemsLinkIsWorking();

        System.out.println(expectedPage);
        System.out.println(actualPage);
        Assert.assertEquals(actualPage, expectedPage);
    }

    @Test
    public void validateAboutLinkIsWorking() throws InterruptedException {
        String expectedPage = "https://saucelabs.com/";
        String actualPage = Menu.verifyAboutLinkIsWorking();

        System.out.println(expectedPage);
        System.out.println(actualPage);
        Assert.assertEquals(actualPage,expectedPage);
    }

    @Test
    public void validateLogoutLinkIsWorking() throws InterruptedException {
        String expectedPage = "https://www.saucedemo.com/";
        String actualPage = Menu.verifyLogoutLinkIsWorking();

        System.out.println(expectedPage);
        System.out.println(actualPage);
        Assert.assertEquals(actualPage,expectedPage);
    }
    @Test
    public void validateResetAppStateLinkIsWorking() throws InterruptedException {
        String expectedAppState = "";
        String actualAppState = Menu.verifyResetAppStateLinkIsWorking();
        Assert.assertEquals(actualAppState,expectedAppState);

    }
}
