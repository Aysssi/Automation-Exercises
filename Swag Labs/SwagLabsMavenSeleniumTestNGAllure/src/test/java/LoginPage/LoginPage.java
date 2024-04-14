package LoginPage;
import static Tests.BaseTest.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {

    public static String usernameField_id = "user-name";
    public static String passwordField_id = "password";
    public static String loginButton_id = "login-button";
    public static void  verifyTheURl(){
        String expectedURL = "https://www.saucedemo.com/";
        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(expectedURL, actualURL);
    }

    public static void verifyTheTitlePage(){
        String expectedTitle = "Swag Labs";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);
    }

    public static void verifyTheTitleInHeader(){
        String expectedTitle = "Swag Labs";
        String actualTitle = driver.findElement(By.cssSelector("#root > div > div.login_logo")).getText();

        Assert.assertEquals(actualTitle,expectedTitle);
    }

    public static void verifyUsernameFieldIsPresented(){
        WebElement usernameField = driver.findElement(By.id(usernameField_id));

        Assert.assertTrue(usernameField.isDisplayed());
    }

    public static void verifyPasswordFieldIsPresented(){
        WebElement passwordField = driver.findElement(By.id(passwordField_id));

        Assert.assertTrue(passwordField.isDisplayed());
    }

    public static void verifyLoginButtonIsPresented(){
        WebElement loginButton = driver.findElement(By.id(loginButton_id));

        Assert.assertTrue(loginButton.isDisplayed());
    }

    public static void verifyUsernameFieldIsEnable(){
        WebElement usernameField = driver.findElement(By.id(usernameField_id));

        Assert.assertTrue(usernameField.isEnabled());
    }

    public static void verifyPasswordFieldIsEnable(){
        WebElement passwordField = driver.findElement(By.id(passwordField_id));

        Assert.assertTrue(passwordField.isEnabled());
    }

    public static void verifyLoginButtonIsEnable(){
        WebElement loginButton = driver.findElement(By.id(loginButton_id));

        Assert.assertTrue(loginButton.isEnabled());
    }

    public static void verifyTheLabelOfUsernameField(){
        String expectedLabel = "Username";
        String actualLabel = driver.findElement(By.id(usernameField_id)).getAttribute("placeholder");

        Assert.assertEquals(actualLabel, expectedLabel);
    }

    public static void verifyTheLabelOfPasswordField(){
        String expectedLabel = "Password";
        String actualLabel = driver.findElement(By.id(passwordField_id)).getAttribute("placeholder");

        Assert.assertEquals(expectedLabel, actualLabel);
    }

    public static void verifyTheLabelOfLoginButton(){
        String expectedLabel = "Login";
        String actualLabel = driver.findElement(By.id(loginButton_id)).getAttribute("value");

        Assert.assertEquals(actualLabel, expectedLabel);
    }

    public static void verifyLoginButtonIsWorking(){
        driver.findElement(By.id(usernameField_id)).sendKeys("standard_user");
        driver.findElement(By.id(passwordField_id)).sendKeys("secret_sauce");
        driver.findElement(By.id(loginButton_id)).click();

        String expectedPage = "https://www.saucedemo.com/inventory.html";
        String actualPage = driver.getCurrentUrl();

        Assert.assertEquals(actualPage, expectedPage);
    }
}
