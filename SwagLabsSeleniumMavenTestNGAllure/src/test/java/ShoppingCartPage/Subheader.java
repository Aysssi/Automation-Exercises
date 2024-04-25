package ShoppingCartPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Tests.BaseTest.driver;

public class Subheader {
    private static final String shoppingCartIconSss ="#shopping_cart_container > a";
    private static final String yourCardSss ="#header_container > div.header_secondary_container > span";


    public static WebElement verifyTitleYourCardIsPresented(){
        driver.findElement(By.cssSelector(shoppingCartIconSss)).click();
        return driver.findElement(By.cssSelector(yourCardSss));
    }
}
