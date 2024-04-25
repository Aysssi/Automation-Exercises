package ShoppingCartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static Tests.BaseTest.driver;

public class Footer {
    private static final String twitterButtonClassName = "social_twitter";
    private static final String facebookButtonClassName = "social_facebook";
    private static final String linkedinButtonClassName = "social_linkedin";
    private static final String copyrightTextClassName = "footer_copy";
    private static final String shoppingCartIconId = "shopping_cart_container";

    public static WebElement verifyTwitterButtonIsPresented() {
        driver.findElement(By.id(shoppingCartIconId)).click();
        return driver.findElement(By.className(twitterButtonClassName));
    }

    public static WebElement verifyFacebookButtonIsPresented() {
        driver.findElement(By.id(shoppingCartIconId)).click();
        return driver.findElement(By.className(facebookButtonClassName));
    }

    public static WebElement verifyLinkedinButtonIsPresented() {
        driver.findElement(By.id(shoppingCartIconId)).click();
        return driver.findElement(By.className(linkedinButtonClassName));
    }

    public static String verifyTheCopyrightNoticeMessage() {
        driver.findElement(By.id(shoppingCartIconId)).click();
        return driver.findElement(By.className(copyrightTextClassName)).getText();
    }
}