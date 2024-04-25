package ProductsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Tests.BaseTest.driver;

public class ShoppingCart {
    private static final String shoppingCartIconCss ="#shopping_cart_container > a";
    private static final String addSauceLabsBikeLightId = "add-to-cart-sauce-labs-bike-light";
    private static final String addSauceLabsBackpackId = "add-to-cart-sauce-labs-backpack";
    private static final String shoppingCartContainerCss = "#shopping_cart_container > a > span";


    public static WebElement verifyTheShoppingCartIsPresented(){
         return driver.findElement(By.cssSelector(shoppingCartIconCss));
    }
    public static WebElement verifyTheItemIsAddedInTheShoppingCartPageCorrectly(){
        WebElement addSauceLabsBikeLight = driver.findElement(By.id(addSauceLabsBikeLightId));
        addSauceLabsBikeLight.click();

        driver.findElement(By.cssSelector(shoppingCartIconCss)).click();
        return driver.findElement(By.cssSelector(shoppingCartContainerCss));
    }
    public static String verifyShoppingCartIconIsUpdatedTheNumberItDisplayed()  {
       WebElement addSauceLabsBikeLight = driver.findElement(By.id(addSauceLabsBikeLightId));
       addSauceLabsBikeLight.click();
       WebElement addSauceLabsBackpack = driver.findElement(By.id(addSauceLabsBackpackId));
       addSauceLabsBackpack.click();

       return driver.findElement(By.cssSelector(shoppingCartContainerCss)).getText();
    }


}
