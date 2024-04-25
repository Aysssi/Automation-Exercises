package LoginPage;
import static Tests.BaseTest.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private static final String usernameField = "user-name";
    private static final String passwordField = "password";
    private static final String loginButton = "login-button";
    private static final String loginLogoCss = "#root > div > div.login_logo";
    private static final String labelPlaceholderAttribute = "placeholder";
    private static final String labelLoginButtonValue = "value";
    public static String verifyTheURl(){
        return driver.getCurrentUrl();
    }

    public static String verifyTheTitlePage(){
        return driver.getTitle();
    }

    public static String verifyTheTitleInHeader(){
       return driver.findElement(By.cssSelector(loginLogoCss)).getText();
    }

    public static WebElement verifyUsernameFieldIsPresented(){
       return driver.findElement(By.id(usernameField));
    }

    public static WebElement verifyPasswordFieldIsPresented(){
        return driver.findElement(By.id(passwordField));
    }

    public static WebElement verifyLoginButtonIsPresented(){
        return driver.findElement(By.id(loginButton));
    }

    public static WebElement verifyUsernameFieldIsEnable(){
       return driver.findElement(By.id(usernameField));
    }

    public static WebElement verifyPasswordFieldIsEnable(){
        return driver.findElement(By.id(passwordField));
    }

    public static WebElement verifyLoginButtonIsEnable(){
        return driver.findElement(By.id(loginButton));
    }

    public static String verifyTheLabelOfUsernameField(){
        return driver.findElement(By.id(usernameField)).getAttribute(labelPlaceholderAttribute);

    }

    public static String verifyTheLabelOfPasswordField(){
        return driver.findElement(By.id(passwordField)).getAttribute(labelPlaceholderAttribute);
    }

    public static String verifyTheLabelOfLoginButton(){
        return driver.findElement(By.id(loginButton)).getAttribute(labelLoginButtonValue);
    }

    public static void verifyLoginButtonIsWorking(){
        driver.findElement(By.id(usernameField)).sendKeys("standard_user");
        driver.findElement(By.id(passwordField)).sendKeys("secret_sauce");
        driver.findElement(By.id(loginButton)).click();
    }
}
