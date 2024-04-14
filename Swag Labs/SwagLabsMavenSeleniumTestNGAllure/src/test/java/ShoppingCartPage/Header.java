package ShoppingCartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static Tests.BaseTest.driver;

public class Header {
    public static String burgerMenu_id = "react-burger-menu-btn";
    public static String shoppingCartIcon_id = "shopping_cart_container";
    public static void verifyTheTitleInHeader(){
        driver.findElement(By.id(shoppingCartIcon_id)).click();
        String expectedTitleHeader = "Swag Labs";
        String actualTitleHeader = driver.findElement(By.className("app_logo")).getText();

        Assert.assertEquals(actualTitleHeader,expectedTitleHeader);
    }

    public static void verifyTheMenuButtonIsPresented(){
        driver.findElement(By.id(shoppingCartIcon_id)).click();
        WebElement burgerMenu = driver.findElement(By.id(burgerMenu_id));

        Assert.assertTrue(burgerMenu.isDisplayed());
    }

    public static void verifyShoppingCartIconIsPresented(){
        driver.findElement(By.id(shoppingCartIcon_id)).click();
        WebElement shoppingCartIcon = driver.findElement(By.id(shoppingCartIcon_id));

        Assert.assertTrue(shoppingCartIcon.isDisplayed());
    }

    public static void verifyTheMenuButtonIsEnable(){
        driver.findElement(By.id(shoppingCartIcon_id)).click();
        WebElement burgerMenu = driver.findElement(By.id(burgerMenu_id));

        Assert.assertTrue(burgerMenu.isEnabled());
    }

    public static void verifyShoppingCartIconIsEnable(){
        driver.findElement(By.id(shoppingCartIcon_id)).click();
        WebElement shoppingCartIcon = driver.findElement(By.id(shoppingCartIcon_id));

        Assert.assertTrue(shoppingCartIcon.isEnabled());
    }

    public static void  verifyShoppingCartIconIsWorking(){
        driver.findElement(By.id(shoppingCartIcon_id)).click();
        String expectedPage = "https://www.saucedemo.com/cart.html";
        String actualPage = driver.getCurrentUrl();

        Assert.assertEquals(actualPage,expectedPage);
    }

    public static void verifyShoppingCartIconHasCorrectNumberOfAddedItems(){
       driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
       driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
       driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();


        String expectedShoppingCartCount = "3";
        String actualShoppingCartCount = driver.findElement(By.cssSelector("#shopping_cart_container > a > span")).getText();

        Assert.assertEquals(actualShoppingCartCount,expectedShoppingCartCount);
    }

    public static void verifyTheMenuButtonIsWorking() {
        driver.findElement(By.id(shoppingCartIcon_id)).click();
        driver.findElement(By.id(burgerMenu_id)).click();
        boolean leftNavigation = driver.findElement(By.className("bm-menu")).isDisplayed();

        Assert.assertTrue(leftNavigation);
    }

    public static void verifyTheTitleOfAllOptionsInMenu() throws InterruptedException {
        driver.findElement(By.id(shoppingCartIcon_id)).click();
        driver.findElement(By.id(burgerMenu_id)).click();
        Thread.sleep(1500);
        WebElement menuOptions = driver.findElement(By.cssSelector("#menu_button_container > div > div.bm-menu-wrap > div.bm-menu > nav"));
        List<WebElement> menuOptionsTag = menuOptions.findElements(By.tagName("a"));
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
