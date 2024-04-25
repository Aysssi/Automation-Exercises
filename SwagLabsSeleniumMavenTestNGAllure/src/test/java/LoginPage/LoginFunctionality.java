package LoginPage;

import org.openqa.selenium.By;

import static Tests.BaseTest.driver;

public class LoginFunctionality {
    private static final String usernameField = "user-name";
    private static final String passwordField = "password";
    private static final String loginButton = "login-button";
    private static final String errorMessagedXpath = "/html/body/div/div/div[2]/div[1]/div/div/form/div[3]/h3";
    private static final String errorMessagedLoginButtonXpath = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3";

    private static final String password = "secret_sauce";
    private static final String standardUser = "standard_user";

    public static void verifyWithStandardUserAndPassword() throws InterruptedException {
        driver.findElement(By.id(usernameField)).sendKeys(standardUser);
        driver.findElement(By.id(passwordField)).sendKeys(password);
        driver.findElement(By.id(loginButton)).click();
        Thread.sleep(2000);
    }
    public static void verifyWithVisualUserAndPassword() throws InterruptedException {
        driver.findElement(By.id(usernameField)).sendKeys("visual_user");
        driver.findElement(By.id(passwordField)).sendKeys(password);
        driver.findElement(By.id(loginButton)).click();
        Thread.sleep(2000);
    }

    public static void verifyWithPerformanceGlitchUserAndPassword() throws InterruptedException {
        driver.findElement(By.id(usernameField)).sendKeys("performance_glitch_user");
        driver.findElement(By.id(passwordField)).sendKeys(password);
        driver.findElement(By.id(loginButton)).click();
        Thread.sleep(3000);
    }

    public static void verifyLoginWithCorrectUsernameAndIncorrectPassword(){
        driver.findElement(By.id(usernameField)).sendKeys(standardUser);
        driver.findElement(By.id(passwordField)).sendKeys("Burgasss");
        driver.findElement(By.id(loginButton)).click();
    }
    public static void verifyLoginWithIncorrectUsernameAndCorrectPassword(){
        driver.findElement(By.id(usernameField)).sendKeys("JackRussellTerrier");
        driver.findElement(By.id(passwordField)).sendKeys(password);
        driver.findElement(By.id(loginButton)).click();
    }

    public static void verifyLoginWithEmptyUsernameAndPassword(){
        driver.findElement(By.id(usernameField)).sendKeys("");
        driver.findElement(By.id(passwordField)).sendKeys("");
        driver.findElement(By.id(loginButton)).click();
    }

    public static void verifyLoginWithEmptyUsernameAndCorrectPassword(){
        driver.findElement(By.id(usernameField)).sendKeys("");
        driver.findElement(By.id(passwordField)).sendKeys(password);
        driver.findElement(By.id(loginButton)).click();
    }

    public static String verifyErrorMessageWhenUsernameAndPasswordDoNotMatch (){
        driver.findElement(By.id(usernameField)).sendKeys(standardUser);
        driver.findElement(By.id(passwordField)).sendKeys("Burgasss");
        driver.findElement(By.id(loginButton)).click();
        return driver.findElement(By.xpath(errorMessagedLoginButtonXpath)).getText();
    }

    public static String verifyErrorMessageWithEmptyUsernameAndCorrectPasswordField (){
        driver.findElement(By.id(usernameField)).sendKeys("");
        driver.findElement(By.id(passwordField)).sendKeys(password);
        driver.findElement(By.id(loginButton)).click();
        return driver.findElement(By.xpath(errorMessagedXpath)).getText();
    }
    public static String verifyErrorMessageWithCorrectUsernameAndEmptyPasswordField (){
        driver.findElement(By.id(usernameField)).sendKeys(standardUser);
        driver.findElement(By.id(passwordField)).sendKeys("");
        driver.findElement(By.id(loginButton)).click();
        return driver.findElement(By.xpath(errorMessagedXpath)).getText();
    }

}
