package Tests.ShoppingCartPageTest;


import LoginPage.LoginFunctionality;
import ShoppingCartPage.Subheader;
import Tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SubheaderTest extends BaseTest {

    @BeforeMethod
    public void validateWithStandardUserAndPassword() throws InterruptedException {
        LoginFunctionality.verifyWithStandardUserAndPassword();
    }

    @Test
    public void validateTheItemTitleIsPresented() {
        Assert.assertTrue(Subheader.verifyTitleYourCardIsPresented().isDisplayed());
    }
}
