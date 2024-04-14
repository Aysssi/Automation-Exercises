package Tests.LoginTest;

import LoginPage.LoginFunctionality;
import Tests.BaseTest;
import org.testng.annotations.Test;

public class LoginFunctionalityTest extends BaseTest {

    @Test
    public void validateWithStandardUserAndPassword () throws InterruptedException {
        LoginFunctionality.verifyWithStandardUserAndPassword();
    }

    @Test
    public void validateWithVisualUserAndPassword () throws InterruptedException {
        LoginFunctionality.verifyWithVisualUserAndPassword();
    }

    @Test
    public void validateWithPerformanceGlitchUserAndPassword() throws InterruptedException {
        LoginFunctionality.verifyWithPerformanceGlitchUserAndPassword();
    }

    @Test
    public void validateLoginWithCorrectUsernameAndIncorrectPassword (){
        LoginFunctionality.verifyLoginWithCorrectUsernameAndIncorrectPassword();
    }

   @Test
    public void validateLoginWithIncorrectUsernameAndCorrectPassword (){
        LoginFunctionality.verifyLoginWithIncorrectUsernameAndCorrectPassword();
   }

   @Test
    public void validateLoginWithEmptyUsernameAndPassword (){
        LoginFunctionality.verifyLoginWithEmptyUsernameAndPassword();
   }

   @Test
   public void validateLoginWithEmptyUsernameAndCorrectPassword(){
        LoginFunctionality.verifyLoginWithEmptyUsernameAndCorrectPassword();
   }

   @Test
   public void validateErrorMessageWhenUsernameAndPasswordDoNotMatch(){
        LoginFunctionality.verifyErrorMessageWhenUsernameAndPasswordDoNotMatch();
   }

   @Test
   public void validateErrorMessageWithEmptyUsernameAndCorrectPasswordField(){
        LoginFunctionality.verifyErrorMessageWithEmptyUsernameAndCorrectPasswordField();
   }

   @Test
    public void validateErrorMessageWithEmptyPasswordField(){
        LoginFunctionality.verifyErrorMessageWithCorrectUsernameAndEmptyPasswordField();
   }

}
