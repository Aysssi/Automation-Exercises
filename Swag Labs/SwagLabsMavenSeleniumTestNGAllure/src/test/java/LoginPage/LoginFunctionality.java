package LoginPage;

import org.openqa.selenium.By;
import org.testng.Assert;

import static Tests.BaseTest.driver;

public class LoginFunctionality {
    public static String username_id = "user-name";
    public static String password_id = "password";
    public static String loginButton_id = "login-button";

    public static void verifyWithStandardUserAndPassword() throws InterruptedException {
        driver.findElement(By.id(username_id)).sendKeys("standard_user");
        driver.findElement(By.id(password_id)).sendKeys("secret_sauce");
        driver.findElement(By.id(loginButton_id)).click();

        Thread.sleep(2000);
        String expectedPage = "https://www.saucedemo.com/inventory.html";
        String actualPage = driver.getCurrentUrl();

        Assert.assertEquals(actualPage,expectedPage);
    }
    public static void verifyWithVisualUserAndPassword() throws InterruptedException {
        driver.findElement(By.id(username_id)).sendKeys("visual_user");
        driver.findElement(By.id(password_id)).sendKeys("secret_sauce");
        driver.findElement(By.id(loginButton_id)).click();

        Thread.sleep(2000);
        String expectedPage = "https://www.saucedemo.com/inventory.html";
        String actualPage = driver.getCurrentUrl();

        Assert.assertEquals(actualPage,expectedPage);
    }

    public static void verifyWithPerformanceGlitchUserAndPassword() throws InterruptedException {
        driver.findElement(By.id(username_id)).sendKeys("performance_glitch_user");
        driver.findElement(By.id(password_id)).sendKeys("secret_sauce");
        driver.findElement(By.id(loginButton_id)).click();

        Thread.sleep(3000);
        String expectedPage = "https://www.saucedemo.com/inventory.html";
        String actualPage = driver.getCurrentUrl();

        Assert.assertEquals(actualPage,expectedPage);
    }

    public static void verifyLoginWithCorrectUsernameAndIncorrectPassword(){
        driver.findElement(By.id(username_id)).sendKeys("standard_user");
        driver.findElement(By.id(password_id)).sendKeys("Burgasss");
        driver.findElement(By.id(loginButton_id)).click();

        String expectedPage = "https://www.saucedemo.com/";
        String actualPage = driver.getCurrentUrl();

        Assert.assertEquals(actualPage,expectedPage);
    }
    public static void verifyLoginWithIncorrectUsernameAndCorrectPassword(){
        driver.findElement(By.id(username_id)).sendKeys("JackRussellTerrier");
        driver.findElement(By.id(password_id)).sendKeys("secret_sauce");
        driver.findElement(By.id(loginButton_id)).click();

        String expectedPage = "https://www.saucedemo.com/";
        String actualPage = driver.getCurrentUrl();

        Assert.assertEquals(actualPage,expectedPage);
    }

    public static void verifyLoginWithEmptyUsernameAndPassword(){
        driver.findElement(By.id(username_id)).sendKeys("");
        driver.findElement(By.id(password_id)).sendKeys("");
        driver.findElement(By.id(loginButton_id)).click();

        String expectedPage = "https://www.saucedemo.com/";
        String actualPage = driver.getCurrentUrl();

        Assert.assertEquals(actualPage,expectedPage);
    }

    public static void verifyLoginWithEmptyUsernameAndCorrectPassword(){
        driver.findElement(By.id(username_id)).sendKeys("");
        driver.findElement(By.id(password_id)).sendKeys("secret_sauce");
        driver.findElement(By.id(loginButton_id)).click();

        String expectedPage = "https://www.saucedemo.com/";
        String actualPage = driver.getCurrentUrl();

        Assert.assertEquals(actualPage,expectedPage);
    }

    public static void  verifyErrorMessageWhenUsernameAndPasswordDoNotMatch (){
        driver.findElement(By.id(username_id)).sendKeys("standard_user");
        driver.findElement(By.id(password_id)).sendKeys("Burgasss");
        driver.findElement(By.id(loginButton_id)).click();

        String expectedMessage = "Epic sadface: Username and password do not match any user in this service";
        String actualMessage = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

    public static void verifyErrorMessageWithEmptyUsernameAndCorrectPasswordField (){
        driver.findElement(By.id(username_id)).sendKeys("");
        driver.findElement(By.id(password_id)).sendKeys("secret_sauce");
        driver.findElement(By.id(loginButton_id)).click();

        String expectedMessage = "Epic sadface: Username is required";
        String actualMessage = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[3]/h3")).getText();

        Assert.assertEquals(actualMessage, expectedMessage);
    }
    public static void verifyErrorMessageWithCorrectUsernameAndEmptyPasswordField (){
        driver.findElement(By.id(username_id)).sendKeys("standard_user");
        driver.findElement(By.id(password_id)).sendKeys("");
        driver.findElement(By.id(loginButton_id)).click();

        String expectedMessage = "Epic sadface: Password is required";
        String actualMessage = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[3]/h3")).getText();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

}
