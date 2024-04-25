package Tests.ProductsPageTest;

import LoginPage.LoginFunctionality;
import ProductsPage.Footer;
import Tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FooterTest extends BaseTest {

    @BeforeMethod
    public void validateWithStandardUserAndPassword () throws InterruptedException {
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
        String actualDataText = Footer.verifyTheCopyrightNoticeMessage();
        Assert.assertEquals(actualDataText,expectedDataText);
    }



}
