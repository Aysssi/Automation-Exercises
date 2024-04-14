package ProductsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static Tests.BaseTest.driver;

public class Header {
    public static String burgerMenu_id = "react-burger-menu-btn";
    public static String shoppingCartIcon_css ="#shopping_cart_container > a";


    public static void verifyTheTitleInHeader(){
        String expectedTitleHeader = "Swag Labs";
        String actualTitleHeader = driver.findElement(By.cssSelector("#header_container > div.primary_header > div.header_label > div")).getText();

        Assert.assertEquals(actualTitleHeader, expectedTitleHeader);
    }

    public static void verifyMenuButtonIsPresent(){
         WebElement burgerMenu = driver.findElement(By.id(burgerMenu_id));

         Assert.assertTrue(burgerMenu.isDisplayed());
    }

    public static void verifyShoppingCartIconIsPresent(){
         WebElement shoppingCartIcon = driver.findElement(By.cssSelector(shoppingCartIcon_css));

        Assert.assertTrue(shoppingCartIcon.isDisplayed());
    }

    public static void verifyMenuButtonIsEnabled(){
         WebElement burgerMenu = driver.findElement(By.id(burgerMenu_id));

         Assert.assertTrue(burgerMenu.isEnabled());
    }

    public static void verifyShoppingCartIconIsEnabled() {
        WebElement shoppingCartIcon = driver.findElement(By.cssSelector(shoppingCartIcon_css));

        Assert.assertTrue(shoppingCartIcon.isEnabled());

    }

    public static void verifyMenuButtonIsWorking(){
        driver.findElement(By.id(burgerMenu_id)).click();

        boolean leftNavigation = driver.findElement(By.id(burgerMenu_id)).isDisplayed();

        Assert.assertTrue(leftNavigation);
    }
    public static void verifyShoppingCartIconIsWorking() {
        driver.findElement(By.cssSelector(shoppingCartIcon_css)).click();

        String expectedPageUrl = "https://www.saucedemo.com/cart.html";
        String actualPageUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualPageUrl,expectedPageUrl);

    }
    public static void verifyShoppingCartIconHasCorrectNumberOfAddedItems(){
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();


        driver.findElement(By.cssSelector(shoppingCartIcon_css)).click();

        String expectedItem = "3";
        String actualItem = driver.findElement(By.cssSelector("#shopping_cart_container > a > span")).getText();

        Assert.assertEquals(actualItem,expectedItem);
    }
}
