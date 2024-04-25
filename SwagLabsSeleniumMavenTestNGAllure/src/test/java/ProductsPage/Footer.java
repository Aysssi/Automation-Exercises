package ProductsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

;

import static Tests.BaseTest.driver;

public class Footer {
    private static final String twitterButtonCss = "#page_wrapper > footer > ul > li.social_twitter > a";
    private static final String facebookButtonCss = "#page_wrapper > footer > ul > li.social_facebook > a";
    private static final String linkedinButtonCss = "#page_wrapper > footer > ul > li.social_linkedin > a";
    private static final String copyrightCss = "#page_wrapper > footer > div";

    public static WebElement verifyTwitterButtonIsPresented(){
       return driver.findElement(By.cssSelector(twitterButtonCss));
    }
    public static WebElement verifyFacebookButtonIsPresented(){
        return driver.findElement(By.cssSelector(facebookButtonCss));
    }
    public static WebElement verifyLinkedinButtonIsPresented(){
      return driver.findElement(By.cssSelector(linkedinButtonCss));
    }
    public static String verifyTheCopyrightNoticeMessage(){
        return driver.findElement(By.cssSelector(copyrightCss)).getText();
    }

}
