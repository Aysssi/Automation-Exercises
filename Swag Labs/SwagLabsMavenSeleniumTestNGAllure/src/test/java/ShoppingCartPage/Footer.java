package ShoppingCartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static Tests.BaseTest.driver;

public class Footer {
    public static String twitterButton_className = "social_twitter";
    public static String facebookButton_className = "social_facebook";
    public static String linkedinButton_className = "social_linkedin";
    public static String copyrightText_className = "footer_copy";
    public static String shoppingCartIcon_id = "shopping_cart_container";

    public static void verifyTwitterButtonIsPresented() {
        driver.findElement(By.id(shoppingCartIcon_id)).click();
        WebElement twitterButton = driver.findElement(By.className(twitterButton_className));

        Assert.assertTrue(twitterButton.isDisplayed());
    }

    public static void verifyFacebookButtonIsPresented() {
        driver.findElement(By.id(shoppingCartIcon_id)).click();
        WebElement facebookButton = driver.findElement(By.className(facebookButton_className));

        Assert.assertTrue(facebookButton.isDisplayed());
    }

    public static void verifyLinkedinButtonIsPresented() {
        driver.findElement(By.id(shoppingCartIcon_id)).click();
        WebElement linkedinButton = driver.findElement(By.className(linkedinButton_className));

        Assert.assertTrue(linkedinButton.isDisplayed());
    }

    public static void verifyTheCopyrightNoticeMessage() {
        driver.findElement(By.id(shoppingCartIcon_id)).click();
        String expectedDataText = "© 2024 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy";
        String actualDataText = driver.findElement(By.className(copyrightText_className)).getText();

        Assert.assertEquals(actualDataText, expectedDataText);
    }
}