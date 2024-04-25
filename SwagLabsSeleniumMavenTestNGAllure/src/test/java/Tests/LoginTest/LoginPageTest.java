package Tests.LoginTest;

import LoginPage.LoginPage;
import Tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public void validateTheURl() {
        String expectedURL = "https://www.saucedemo.com/";
        String actualURL = LoginPage.verifyTheURl();
        Assert.assertEquals(expectedURL, actualURL);
    }

    @Test
    public void validateTheTitlePage() {
        String expectedTitle = "Swag Labs";
        String actualTitle = LoginPage.verifyTheTitlePage();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void validateTheTitleInHeader() {
        LoginPage.verifyTheTitleInHeader();
        String expectedTitle = "Swag Labs";
        String actualTitle = LoginPage.verifyTheTitleInHeader();;
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test
    public void validateUsernameFieldIsPresented() {
        Assert.assertTrue(LoginPage.verifyUsernameFieldIsPresented().isDisplayed());
    }

    @Test
    public void validatePasswordFieldIsPresented() {
        Assert.assertTrue(LoginPage.verifyPasswordFieldIsPresented().isDisplayed());
    }

    @Test
    public void validateLoginButtonIsPresented() {
        Assert.assertTrue(LoginPage.verifyLoginButtonIsPresented().isDisplayed());
    }

    @Test
    public void validateUsernameFieldIsEnable() {
        Assert.assertTrue(LoginPage.verifyUsernameFieldIsEnable().isEnabled());
    }

    @Test
    public void verifyPasswordFieldIsEnable() {
        Assert.assertTrue( LoginPage.verifyPasswordFieldIsEnable().isEnabled());
    }

    @Test
    public void validateLoginButtonIsEnable() {
        Assert.assertTrue( LoginPage.verifyLoginButtonIsEnable().isEnabled());
    }

    @Test
    public void validateTheLabelOfUsernameField() {
        String expectedLabel = "Username";
        String actualLabel = LoginPage.verifyTheLabelOfUsernameField();
        Assert.assertEquals(actualLabel, expectedLabel);
    }

    @Test
    public void validateTheLabelOfPasswordField() {
        String expectedLabel = "Password";
        String actualLabel = LoginPage.verifyTheLabelOfPasswordField();
        Assert.assertEquals(expectedLabel, actualLabel);
    }

    @Test
    public void validateTheLabelOfLoginButton() {
        String expectedLabel = "Login";
        String actualLabel = LoginPage.verifyTheLabelOfLoginButton();
        Assert.assertEquals(actualLabel, expectedLabel);
    }

    @Test
    public void validateLoginButtonIsWorking(){
        LoginPage.verifyLoginButtonIsWorking();
        String expectedPage = "https://www.saucedemo.com/inventory.html";
        String actualPage = driver.getCurrentUrl();
        Assert.assertEquals(actualPage, expectedPage);
    }
}
