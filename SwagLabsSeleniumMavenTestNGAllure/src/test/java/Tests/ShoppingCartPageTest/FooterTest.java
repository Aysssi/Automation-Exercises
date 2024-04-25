package Tests.ShoppingCartPageTest;

import LoginPage.LoginFunctionality;
import ShoppingCartPage.Footer;
import Tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FooterTest extends BaseTest {

    @BeforeMethod
    public void validateWithStandardUserAndPassword() throws InterruptedException {
        LoginFunctionality.verifyWithStandardUserAndPassword();
    }

    @Test
    public void validateTwitterButtonIsPresented(){
        Assert.assertTrue(Footer.verifyTwitterButtonIsPresented().isDisplayed());
    }

    @Test
    public void validateFacebookButtonIsPresented(){
        Assert.assertTrue(Footer.verifyFacebookButtonIsPresented().isDisplayed());
    }

    @Test
    public void validateLinkedinButtonIsPresented(){
        Assert.assertTrue(Footer.verifyLinkedinButtonIsPresented().isDisplayed());
    }

    @Test
    public void validateTheCopyrightNoticeMessage(){
        String expectedDataText = "© 2024 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy";
        String actualDataText = Footer.verifyTheCopyrightNoticeMessage();;
        Assert.assertEquals(actualDataText, expectedDataText);
    }
}
