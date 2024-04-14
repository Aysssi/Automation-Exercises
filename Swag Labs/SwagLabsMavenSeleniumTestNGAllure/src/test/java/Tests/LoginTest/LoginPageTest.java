package Tests.LoginTest;

import LoginPage.LoginPage;
import Tests.BaseTest;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public void validateTheURl() {
        LoginPage.verifyTheURl();
    }

    @Test
    public void validateTheTitlePage() {
        LoginPage.verifyTheTitlePage();
    }

    @Test
    public void validateTheTitleInHeader() {
        LoginPage.verifyTheTitleInHeader();
    }

    @Test
    public void validateUsernameFieldIsPresented() {
        LoginPage.verifyUsernameFieldIsPresented();
    }

    @Test
    public void validatePasswordFieldIsPresented() {
        LoginPage.verifyPasswordFieldIsPresented();
    }

    @Test
    public void validateLoginButtonIsPresented() {
        LoginPage.verifyLoginButtonIsPresented();
    }

    @Test
    public void validateUsernameFieldIsEnable() {
        LoginPage.verifyUsernameFieldIsEnable();
    }

    @Test
    public void verifyPasswordFieldIsEnable() {
        LoginPage.verifyPasswordFieldIsEnable();
    }

    @Test
    public void validateLoginButtonIsEnable() {
        LoginPage.verifyLoginButtonIsEnable();
    }

    @Test
    public void validateTheLabelOfUsernameField() {
        LoginPage.verifyTheLabelOfUsernameField();
    }

    @Test
    public void validateTheLabelOfPasswordField() {
        LoginPage.verifyTheLabelOfPasswordField();
    }

    @Test
    public void validateTheLabelOfLoginButton() {
        LoginPage.verifyTheLabelOfLoginButton();
    }

    @Test
    public void validateLoginButtonIsWorking(){
       LoginPage.verifyLoginButtonIsWorking();
    }
}
