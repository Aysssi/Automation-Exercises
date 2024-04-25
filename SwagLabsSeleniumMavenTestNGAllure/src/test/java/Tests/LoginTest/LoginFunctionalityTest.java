package Tests.LoginTest;

import LoginPage.LoginFunctionality;
import Tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginFunctionalityTest extends BaseTest {

    @Test
    public void validateWithStandardUserAndPassword () throws InterruptedException {
        LoginFunctionality.verifyWithStandardUserAndPassword();
        String expectedPage = "https://www.saucedemo.com/inventory.html";
        String actualPage = driver.getCurrentUrl();
        Assert.assertEquals(actualPage,expectedPage);
    }

    @Test
    public void validateWithVisualUserAndPassword () throws InterruptedException {
        LoginFunctionality.verifyWithVisualUserAndPassword();
        String expectedPage = "https://www.saucedemo.com/inventory.html";
        String actualPage = driver.getCurrentUrl();
        Assert.assertEquals(actualPage,expectedPage);
    }

    @Test
    public void validateWithPerformanceGlitchUserAndPassword() throws InterruptedException {
        LoginFunctionality.verifyWithPerformanceGlitchUserAndPassword();
        String expectedPage = "https://www.saucedemo.com/inventory.html";
        String actualPage = driver.getCurrentUrl();
        Assert.assertEquals(actualPage,expectedPage);
    }

    @Test
    public void validateLoginWithCorrectUsernameAndIncorrectPassword (){
        LoginFunctionality.verifyLoginWithCorrectUsernameAndIncorrectPassword();
        String expectedPage = "https://www.saucedemo.com/";
        String actualPage = driver.getCurrentUrl();
        Assert.assertEquals(actualPage,expectedPage);
    }

   @Test
    public void validateLoginWithIncorrectUsernameAndCorrectPassword (){
        LoginFunctionality.verifyLoginWithIncorrectUsernameAndCorrectPassword();
        String expectedPage = "https://www.saucedemo.com/";
        String actualPage = driver.getCurrentUrl();
        Assert.assertEquals(actualPage,expectedPage);
   }

   @Test
    public void validateLoginWithEmptyUsernameAndPassword (){
        LoginFunctionality.verifyLoginWithEmptyUsernameAndPassword();
        String expectedPage = "https://www.saucedemo.com/";
        String actualPage = driver.getCurrentUrl();
        Assert.assertEquals(actualPage,expectedPage);
   }

   @Test
   public void validateLoginWithEmptyUsernameAndCorrectPassword(){
        LoginFunctionality.verifyLoginWithEmptyUsernameAndCorrectPassword();
        String expectedPage = "https://www.saucedemo.com/";
        String actualPage = driver.getCurrentUrl();
        Assert.assertEquals(actualPage,expectedPage);
   }

   @Test
   public void validateErrorMessageWhenUsernameAndPasswordDoNotMatch(){
        String expectedMessage = "Epic sadface: Username and password do not match any user in this service";
        String actualMessage =  LoginFunctionality.verifyErrorMessageWhenUsernameAndPasswordDoNotMatch();
        Assert.assertEquals(actualMessage, expectedMessage);
   }

   @Test
   public void validateErrorMessageWithEmptyUsernameAndCorrectPasswordField(){
        String expectedMessage = "Epic sadface: Username is required";
        String actualMessage = LoginFunctionality.verifyErrorMessageWithEmptyUsernameAndCorrectPasswordField();
        Assert.assertEquals(actualMessage, expectedMessage);
   }

   @Test
    public void validateErrorMessageWithEmptyPasswordField(){
        String expectedMessage = "Epic sadface: Password is required";
        String actualMessage = LoginFunctionality.verifyErrorMessageWithCorrectUsernameAndEmptyPasswordField();
        Assert.assertEquals(actualMessage, expectedMessage);
   }

}
