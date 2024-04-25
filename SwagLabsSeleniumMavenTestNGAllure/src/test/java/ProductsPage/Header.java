package ProductsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static Tests.BaseTest.driver;

public class Header {
    private static final String burgerMenuId = "react-burger-menu-btn";
    private static final String shoppingCartIconCss = "#shopping_cart_container > a";
    private static final String titleInHeaderCss = "#header_container > div.primary_header > div.header_label > div";

    private static final String backpackId = "add-to-cart-sauce-labs-backpack";
    private static final String tShirtId = "add-to-cart-sauce-labs-bolt-t-shirt";
    private static final String jacketId = "add-to-cart-sauce-labs-fleece-jacket";


    public static String verifyTheTitleInHeader(){
        return driver.findElement(By.cssSelector(titleInHeaderCss)).getText();
    }

    public static WebElement verifyMenuButtonIsPresent(){
         return driver.findElement(By.id(burgerMenuId));
    }

    public static WebElement verifyShoppingCartIconIsPresent(){
         return driver.findElement(By.cssSelector(shoppingCartIconCss));
    }

    public static WebElement verifyMenuButtonIsEnabled(){
         return driver.findElement(By.id(burgerMenuId));
    }

    public static WebElement verifyShoppingCartIconIsEnabled() {
         return driver.findElement(By.cssSelector(shoppingCartIconCss));
    }

    public static void verifyMenuButtonIsWorking(){
        driver.findElement(By.id(burgerMenuId)).click();
    }
    public static void verifyShoppingCartIconIsWorking() {
        driver.findElement(By.cssSelector(shoppingCartIconCss)).click();
    }
    public static void verifyShoppingCartIconHasCorrectNumberOfAddedItems(){
        driver.findElement(By.id(backpackId)).click();
        driver.findElement(By.id(tShirtId)).click();
        driver.findElement(By.id(jacketId)).click();

        driver.findElement(By.cssSelector(shoppingCartIconCss)).click();
    }
}
