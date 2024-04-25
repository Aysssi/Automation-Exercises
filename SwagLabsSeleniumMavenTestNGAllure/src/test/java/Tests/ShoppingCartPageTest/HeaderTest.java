package Tests.ShoppingCartPageTest;

import LoginPage.LoginFunctionality;
import ShoppingCartPage.Header;
import Tests.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HeaderTest extends BaseTest {
    @BeforeMethod
    public void validateWithStandardUserAndPassword() throws InterruptedException {
        LoginFunctionality.verifyWithStandardUserAndPassword();
    }

    @Test
    public void validateTheTitleInHeader() {
        String expectedTitleHeader = "Swag Labs";
        Assert.assertEquals( Header.verifyTheTitleInHeader(),expectedTitleHeader);
    }

    @Test
    public void validateTheMenuButtonIsPresented() {
        Assert.assertTrue( Header.verifyTheMenuButtonIsPresented().isDisplayed());
    }

    @Test
    public void validateShoppingCartIconIsPresented(){
        Assert.assertTrue(Header.verifyShoppingCartIconIsPresented().isDisplayed());
    }

    @Test
    public void validateTheMenuButtonIsEnable(){
        Assert.assertTrue(Header.verifyTheMenuButtonIsEnable().isEnabled());
    }

    @Test
    public void validateShoppingCartIconIsEnable(){
        Assert.assertTrue(Header.verifyShoppingCartIconIsEnable().isEnabled());
    }

    @Test
    public void validateShoppingCartIconIsWorking(){
        String expectedPage = "https://www.saucedemo.com/cart.html";
        String actualPage = Header.verifyShoppingCartIconIsWorking();
        Assert.assertEquals(actualPage,expectedPage);
    }

    @Test
    public void validateShoppingCartIconHasCorrectNumberOfAddedItems(){
        String expectedShoppingCartCount = "3";
        String actualShoppingCartCount = Header.verifyShoppingCartIconHasCorrectNumberOfAddedItems();
        Assert.assertEquals(actualShoppingCartCount,expectedShoppingCartCount);
    }
    @Test
    public void validateTheMenuButtonIsWorking(){
        boolean leftNavigation = Header.verifyTheMenuButtonIsWorking();
        Assert.assertTrue(leftNavigation);
    }

    @Test
    public void validateTheTitleOfAllOptionsInMenu() throws InterruptedException {
        List<WebElement> menuOptionsTag = Header.verifyTheTitleOfAllOptionsInMenu();
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

}
