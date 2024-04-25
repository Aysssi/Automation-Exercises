package ProductsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Tests.BaseTest.driver;

public class Menu {
   private static final String menuButtonId = "react-burger-menu-btn";
   private static final String closeMenuButtonId = "react-burger-cross-btn";
   private static final String menuOptionsCss = "#menu_button_container > div > div.bm-menu-wrap > div.bm-menu";
   private static final String inventorySidebarId = "inventory_sidebar_link";
   private static final String aboutSidebarLinkId = "about_sidebar_link";
   private static final String logoutSidebarLinkId = "logout_sidebar_link";
   private static final String resetSidebarLinkId = "reset_sidebar_link";
   private static final String shoppingCartContainerCss = "#shopping_cart_container > a";
   private static final String addToCartBikeLightId = "add-to-cart-sauce-labs-bike-light";
   private static final String addToCartBackpackId = "add-to-cart-sauce-labs-backpack";
   private static final String addToCartOnesieId = "add-to-cart-sauce-labs-onesie";

    public static int verifyTheTotalNumberOfMenuOptions(){
        driver.findElement(By.id(menuButtonId)).click();
        WebElement menuOptions = driver.findElement(By.cssSelector(menuOptionsCss));
        List<WebElement> actualMenuOptions = menuOptions.findElements(By.tagName("a"));
        driver.findElements(By.tagName("a"));
        return actualMenuOptions.size();
    }

    public static List<WebElement> verifyTheTitleOfAllOptionsInMenu() throws InterruptedException {
        driver.findElement(By.id(menuButtonId)).click();
        Thread.sleep(1500);
        WebElement menuOptions = driver.findElement(By.cssSelector(menuOptionsCss));
        return menuOptions.findElements(By.tagName("a"));
    }
    public static WebElement verifyTheCloseMenuIsPresented() throws InterruptedException {
        driver.findElement(By.id(menuButtonId)).click();
        Thread.sleep(1000);
        return driver.findElement(By.id(closeMenuButtonId));
    }

    public static WebElement verifyTheCloseMenuIsWorking() throws InterruptedException {
        driver.findElement(By.id(menuButtonId)).click();
        Thread.sleep(1000);
        WebElement closeMenuX = driver.findElement(By.id(closeMenuButtonId));
        closeMenuX.click();
        Thread.sleep(1000);
        return closeMenuX;
    }
    public static String verifyAllItemsLinkIsWorking() throws InterruptedException {
        driver.findElement(By.id(menuButtonId)).click();
        Thread.sleep(1000);
        driver.findElement(By.id(inventorySidebarId)).click();
        Thread.sleep(1500);
        return driver.getCurrentUrl();
    }

    public static String verifyAboutLinkIsWorking() throws InterruptedException {
        driver.findElement(By.id(menuButtonId)).click();
        Thread.sleep(1000);
        driver.findElement(By.id(aboutSidebarLinkId)).click();
        Thread.sleep(2000);
        return driver.getCurrentUrl();
    }
    public static String verifyLogoutLinkIsWorking() throws InterruptedException {
        driver.findElement(By.id(menuButtonId)).click();
        Thread.sleep(1500);
        driver.findElement(By.id(logoutSidebarLinkId)).click();
        Thread.sleep(1500);
        return driver.getCurrentUrl();
    }
    public static String verifyResetAppStateLinkIsWorking() throws InterruptedException {
       driver.findElement(By.id(addToCartBikeLightId)).click();
       driver.findElement(By.id(addToCartBackpackId)).click();
       driver.findElement(By.id(addToCartOnesieId)).click();

       driver.findElement(By.id(menuButtonId)).click();
       Thread.sleep(1000);
       driver.findElement(By.id(resetSidebarLinkId)).click();
       Thread.sleep(1000);
       return driver.findElement(By.cssSelector(shoppingCartContainerCss)).getText();
    }

}
