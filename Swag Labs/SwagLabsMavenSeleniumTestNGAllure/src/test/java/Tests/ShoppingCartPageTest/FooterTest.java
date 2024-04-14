package Tests.ShoppingCartPageTest;

import LoginPage.LoginFunctionality;
import ShoppingCartPage.Footer;
import Tests.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FooterTest extends BaseTest {

    @BeforeMethod
    public void validateWithStandardUserAndPassword() throws InterruptedException {
        LoginFunctionality.verifyWithStandardUserAndPassword();
    }

    @Test
    public void validateTwitterButtonIsPresented(){
        Footer.verifyTwitterButtonIsPresented();
    }

    @Test
    public void validateFacebookButtonIsPresented(){
        Footer.verifyFacebookButtonIsPresented();
    }

    @Test
    public void validateLinkedinButtonIsPresented(){
        Footer.verifyLinkedinButtonIsPresented();
    }

    @Test
    public void validateTheCopyrightNoticeMessage(){
        Footer.verifyTheCopyrightNoticeMessage();
    }
}
