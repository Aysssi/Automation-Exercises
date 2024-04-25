package ShoppingCartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Tests.BaseTest.driver;

public class Header {
    private static final String burgerMenuId = "react-burger-menu-btn";
    private static final String shoppingCartIconId = "shopping_cart_container";
    private static final String titleHeaderClassName = "app_logo";
    private static final String menuClassName = "bm-menu";

    private static final String tShirtId = "add-to-cart-sauce-labs-bolt-t-shirt";
    private static final String jacketId = "add-to-cart-sauce-labs-fleece-jacket";
    private static final String bikeLightId = "add-to-cart-sauce-labs-bike-light";
    private static final String shoppingCartContainerCss  = "#shopping_cart_container > a > span";
    private static final String menuButtonContainerCss  = "#menu_button_container > div > div.bm-menu-wrap > div.bm-menu > nav";


    public static String verifyTheTitleInHeader(){
        driver.findElement(By.id(shoppingCartIconId)).click();
        return driver.findElement(By.className(titleHeaderClassName)).getText();
    }

    public static WebElement verifyTheMenuButtonIsPresented(){
        driver.findElement(By.id(shoppingCartIconId)).click();
        return driver.findElement(By.id(burgerMenuId));
    }

    public static WebElement verifyShoppingCartIconIsPresented(){
        driver.findElement(By.id(shoppingCartIconId)).click();
        return driver.findElement(By.id(shoppingCartIconId));
    }

    public static WebElement verifyTheMenuButtonIsEnable(){
        driver.findElement(By.id(shoppingCartIconId)).click();
        return driver.findElement(By.id(burgerMenuId));
    }

    public static WebElement verifyShoppingCartIconIsEnable(){
        driver.findElement(By.id(shoppingCartIconId)).click();
        return driver.findElement(By.id(shoppingCartIconId));
    }

    public static String verifyShoppingCartIconIsWorking(){
        driver.findElement(By.id(shoppingCartIconId)).click();
        return driver.getCurrentUrl();
    }

    public static String verifyShoppingCartIconHasCorrectNumberOfAddedItems(){
       driver.findElement(By.id(tShirtId)).click();
       driver.findElement(By.id(jacketId)).click();
       driver.findElement(By.id(bikeLightId)).click();

       return driver.findElement(By.cssSelector(shoppingCartContainerCss)).getText();
    }

    public static boolean verifyTheMenuButtonIsWorking() {
        driver.findElement(By.id(shoppingCartIconId)).click();
        driver.findElement(By.id(burgerMenuId)).click();

        return driver.findElement(By.className(menuClassName)).isDisplayed();
    }

    public static List<WebElement> verifyTheTitleOfAllOptionsInMenu() throws InterruptedException {
        driver.findElement(By.id(shoppingCartIconId)).click();
        driver.findElement(By.id(burgerMenuId)).click();
        Thread.sleep(1500);
        WebElement menuOptions = driver.findElement(By.cssSelector(menuButtonContainerCss));
        return  menuOptions.findElements(By.tagName("a"));
    }
}
