package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static Tests.BaseTest.driver;

public class DataLoginFunctionality {
    private static final String usernameField = "user-name";
    private static final String passwordField = "password";
    private static final String loginButton = "login-button";

    public static void login(String username, String password, Boolean enterKey){
        driver.findElement(By.id(usernameField)).sendKeys(username);
        driver.findElement(By.id(passwordField)).sendKeys(password);

        if(enterKey){
            driver.findElement(By.id(loginButton)).sendKeys(Keys.ENTER);
        }
        else {
            driver.findElement(By.id(loginButton)).click();
        }
    }
    public static WebElement getErrorMessage(){
        return driver.findElement(By.tagName("h3"));
    }
    public static String getErrorMessageText(){
        return getErrorMessage().getText();
    }


}
