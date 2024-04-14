package ProductsPage;

import io.qameta.allure.internal.shadowed.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.StaleElementReferenceException;

import static Tests.BaseTest.driver;

public class ShoppingCart {
    public static String shoppingCartIcon_css ="#shopping_cart_container > a";
    public static String addSauceLabsBikeLight_id = "add-to-cart-sauce-labs-bike-light";
    public static String addSauceLabsBackpack_id = "add-to-cart-sauce-labs-backpack";


    public static void verifyTheShoppingCartIsPresented(){
        WebElement shoppingCart = driver.findElement(By.cssSelector(shoppingCartIcon_css));

        Assert.assertTrue(shoppingCart.isDisplayed());
    }
    public static void verifyTheItemIsAddedInTheShoppingCartPageCorrectly(){
        WebElement addSauceLabsBikeLight = driver.findElement(By.id(addSauceLabsBikeLight_id));
        addSauceLabsBikeLight.click();

        driver.findElement(By.cssSelector(shoppingCartIcon_css)).click();
        WebElement shoppingCartCount = driver.findElement(By.cssSelector("#shopping_cart_container > a > span"));

        Assert.assertTrue(shoppingCartCount.isDisplayed());
    }
    public static void verifyShoppingCartIconIsUpdatedTheNumberItDisplayed()  {
       WebElement addSauceLabsBikeLight = driver.findElement(By.id(addSauceLabsBikeLight_id));
       addSauceLabsBikeLight.click();
       WebElement addSauceLabsBackpack = driver.findElement(By.id(addSauceLabsBackpack_id));
       addSauceLabsBackpack.click();

       String expectedShoppingCartCount = "2";
       String actualShoppingCartCount = driver.findElement(By.cssSelector("#shopping_cart_container > a > span")).getText();

       Assert.assertEquals(actualShoppingCartCount,expectedShoppingCartCount);
    }


}
