package ShoppingCartPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static Tests.BaseTest.driver;

public class Subheader {
    public static String shoppingCartIcon_css ="#shopping_cart_container > a";

    public static void verifyTitleYourCardIsPresented(){
        driver.findElement(By.cssSelector(shoppingCartIcon_css)).click();
        WebElement yourCard = driver.findElement(By.cssSelector("#header_container > div.header_secondary_container > span"));

        Assert.assertTrue(yourCard.isDisplayed());
    }
}
