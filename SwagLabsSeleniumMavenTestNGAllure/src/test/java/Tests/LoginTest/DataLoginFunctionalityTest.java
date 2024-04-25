package Tests.LoginTest;

import LoginPage.DataLoginFunctionality;
import Tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataLoginFunctionalityTest extends BaseTest {
     DataLoginFunctionality dataLoginFunctionality;

    @DataProvider(name="loginCredentials")
    public Object[][] loginCredentials(){
        return new Object[][] {
                {"standard_user", "secret_sauce"},
                {"locked_out_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"performance_glitch_user","secret_sauce"},
                {"error_user","secret_sauce"},
                {"visual_user","secret_sauce"}
        };
    }

    @Test(dataProvider = "loginCredentials", description = "VerifyUserIsLogInSuccessfullyClickingButton")
    public static void login(String username, String password){

        DataLoginFunctionality.login(username, password,false);
        if(username.equalsIgnoreCase("locked_out_user")){

            Assert.assertEquals(DataLoginFunctionality.getErrorMessageText(), "Epic sadface: Sorry, this user has been locked out.");

        } else {
            String expectedPage = "https://www.saucedemo.com/inventory.html";
            String actualPage = driver.getCurrentUrl();

            Assert.assertEquals(actualPage,expectedPage);
        }
    }

}
