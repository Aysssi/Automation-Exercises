package ProductsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static Tests.BaseTest.driver;

public class Menu {
   public static String menuButton_id = "react-burger-menu-btn";
   public static String closeMenuButton_id = "react-burger-cross-btn";;

    public static void verifyTheTotalNumberOfMenuOptions(){
        driver.findElement(By.id(menuButton_id)).click();

        WebElement menuOptions = driver.findElement(By.cssSelector("#menu_button_container > div > div.bm-menu-wrap > div.bm-menu"));
        List<WebElement> actualMenuOptions = menuOptions.findElements(By.tagName("a"));
        driver.findElements(By.tagName("a"));

        Assert.assertEquals(actualMenuOptions.size(),4);
    }

    public static void verifyTheTitleOfAllOptionsInMenu() throws InterruptedException {
        driver.findElement(By.id(menuButton_id)).click();
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
    public static void verifyTheCloseMenuIsPresented() throws InterruptedException {
        driver.findElement(By.id(menuButton_id)).click();
        Thread.sleep(1000);
        WebElement closeMenuX = driver.findElement(By.id(closeMenuButton_id));

        Assert.assertTrue(closeMenuX.isDisplayed());

    }

    public static void verifyTheCloseMenuIsWorking() throws InterruptedException {
        driver.findElement(By.id(menuButton_id)).click();
        Thread.sleep(1000);
        WebElement closeMenuX = driver.findElement(By.id(closeMenuButton_id));
        closeMenuX.click();
        Thread.sleep(1000);

        Assert.assertFalse(closeMenuX.isDisplayed());


    }
    public static void  verifyAllItemsLinkIsWorking() throws InterruptedException {
        driver.findElement(By.id(menuButton_id)).click();
        Thread.sleep(1000);
        String expectedPage = "https://www.saucedemo.com/inventory.html";
        driver.findElement(By.id("inventory_sidebar_link")).click();
        Thread.sleep(1500);
        String actualPage = driver.getCurrentUrl();

        System.out.println(expectedPage);
        System.out.println(actualPage);
        Assert.assertEquals(actualPage, expectedPage);

    }

    public static void verifyAboutLinkIsWorking() throws InterruptedException {
        driver.findElement(By.id(menuButton_id)).click();
        Thread.sleep(1000);

        String expectedPage = "https://saucelabs.com/";
        driver.findElement(By.id("about_sidebar_link")).click();
        Thread.sleep(2000);
        String actualPage = driver.getCurrentUrl();

        System.out.println(expectedPage);
        System.out.println(actualPage);
        Assert.assertEquals(actualPage,expectedPage);
    }
    public static void verifyLogoutLinkIsWorking() throws InterruptedException {
        driver.findElement(By.id(menuButton_id)).click();
        Thread.sleep(1500);
        String expectedPage = "https://www.saucedemo.com/";
        driver.findElement(By.id("logout_sidebar_link")).click();
        Thread.sleep(1500);
        String actualPage = driver.getCurrentUrl();

        System.out.println(expectedPage);
        System.out.println(actualPage);
        Assert.assertEquals(actualPage,expectedPage);
    }
    public static void verifyResetAppStateLinkIsWorking() throws InterruptedException {
       driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
       driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
       driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();

       driver.findElement(By.id(menuButton_id)).click();
       Thread.sleep(1000);
       driver.findElement(By.id("reset_sidebar_link")).click();
       Thread.sleep(1000);
       String appState = driver.findElement(By.cssSelector("#shopping_cart_container > a")).getText();

       Assert.assertEquals("", appState);
    }

}
