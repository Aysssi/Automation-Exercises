package ProductsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
;

import static Tests.BaseTest.driver;

public class Footer {
    public static String twitterButton_css = "#page_wrapper > footer > ul > li.social_twitter > a";
    public static String facebookButton_css = "#page_wrapper > footer > ul > li.social_facebook > a";
    public static String linkedinButton_css = "#page_wrapper > footer > ul > li.social_linkedin > a";
    public static String copyright_css = "#page_wrapper > footer > div";
    public static void verifyTwitterButtonIsPresented(){
        WebElement twitterButton = driver.findElement(By.cssSelector(twitterButton_css));

        Assert.assertTrue(twitterButton.isDisplayed());
    }
    public static void verifyFacebookButtonIsPresented(){
        WebElement facebookButton = driver.findElement(By.cssSelector(facebookButton_css));

        Assert.assertTrue(facebookButton.isDisplayed());
    }
    public static void verifyLinkedinButtonIsPresented(){
        WebElement linkedinButton = driver.findElement(By.cssSelector(linkedinButton_css));

        Assert.assertTrue(linkedinButton.isDisplayed());
    }
    public static void  verifyTheCopyrightNoticeMessage(){
        String expectedDataText = "© 2024 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy";
        String actualDataText = driver.findElement(By.cssSelector(copyright_css)).getText();

        Assert.assertEquals(actualDataText,expectedDataText);

    }

}
