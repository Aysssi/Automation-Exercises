package Tests.ProductsPageTest;

import LoginPage.LoginFunctionality;
import ProductsPage.Header;
import Tests.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HeaderTest extends BaseTest {
    private static final String burgerMenuID = "react-burger-menu-btn";
    private static final String shoppingCartContainerCSS = "#shopping_cart_container > a > span";


    @BeforeMethod
    public void validateWithStandardUserAndPassword() throws InterruptedException {
        LoginFunctionality.verifyWithStandardUserAndPassword();
    }


    @Test
    public void validateTheTitleInHeader(){
        String expectedTitleHeader = "Swag Labs";
        String actualTitleHeader =  Header.verifyTheTitleInHeader();
        Assert.assertEquals(actualTitleHeader, expectedTitleHeader);
    }

    @Test
    public void validateMenuIsDisplayed(){
        Assert.assertTrue(Header.verifyMenuButtonIsPresent().isDisplayed());
    }

    @Test
   public void validateShoppingCartIconIsPresent(){
        Assert.assertTrue(Header.verifyShoppingCartIconIsPresent().isDisplayed());
    }

    @Test
    public void validateMenuButtonIsEnabled(){
        Assert.assertTrue(Header.verifyMenuButtonIsEnabled().isEnabled());
    }

    @Test
    public void validateShoppingCartIconIsEnabled(){
        Assert.assertTrue(Header.verifyShoppingCartIconIsEnabled().isEnabled());
    }

    @Test
    public void validateMenuButtonIsWorking(){
        Header.verifyMenuButtonIsWorking();
        boolean leftNavigation = driver.findElement(By.id(burgerMenuID)).isDisplayed();

        Assert.assertTrue(leftNavigation);
    }

    @Test
    public void validateShoppingCartIconIsWorking(){
        Header.verifyShoppingCartIconIsWorking();
        String expectedPageUrl = "https://www.saucedemo.com/cart.html";
        String actualPageUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualPageUrl,expectedPageUrl);
    }

    @Test
    public void validateShoppingCartIconHasCorrectNumberOfAddedItems(){
        Header.verifyShoppingCartIconHasCorrectNumberOfAddedItems();
        String expectedItem = "3";
        String actualItem = driver.findElement(By.cssSelector(shoppingCartContainerCSS)).getText();
        Assert.assertEquals(actualItem,expectedItem);
    }

}
