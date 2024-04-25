package Tests.ShoppingCartPageTest;

import LoginPage.LoginFunctionality;
import ShoppingCartPage.CartPage;
import Tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartPageTest extends BaseTest {
    private static final String fieldFirstNameId = "first-name";
    private static final String fieldLastNameId = "last-name";
    private static final String fieldPostcodeId = "postal-code";

    @BeforeMethod
    public void validateWithStandardUserAndPassword() throws InterruptedException {
        LoginFunctionality.verifyWithStandardUserAndPassword();
    }

    @Test
    public void validateItemQTYIsPresented(){
        Assert.assertTrue(CartPage.verifyItemQTYIsPresented().isDisplayed());
    }

    @Test
    public void validateTheItemDescriptionIsPresented(){
        Assert.assertTrue( CartPage.verifyTheItemDescriptionIsPresented().isDisplayed());
    }

    @Test
    public void validateTheItemTitleIsClickable(){
        Assert.assertTrue( CartPage.verifyTheItemTitleIsClickable().isEnabled());
    }

    @Test
    public void validateTheItemTitleIsWorking(){
        String expectedUrl = "https://www.saucedemo.com/inventory-item.html?id=1";
        String actualUrl = CartPage.verifyTheItemTitleIsWorking();
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @Test
    public void validateThePriceOfTheItemIsPresented(){
        Assert.assertTrue(CartPage.verifyThePriceOfTheItemIsPresented().isDisplayed());
    }

    @Test
    public void validateTheRemoveButtonIsPresented(){
        Assert.assertTrue(CartPage.verifyTheRemoveButtonIsPresented().isDisplayed());
    }

    @Test
    public void validateTheRemoveButtonIsWorking(){
        Assert.assertTrue(CartPage.verifyTheRemoveButtonIsWorking());
    }

    @Test
    public void validateTheCheckoutButtonIsPresented(){
        Assert.assertTrue(CartPage.verifyTheCheckoutButtonIsPresented().isDisplayed());

    }

    @Test
    public void validateTheCheckoutButtonIsWorking(){
        CartPage.verifyTheCheckoutButtonIsWorking();
        WebElement actualFieldFirstName = driver.findElement(By.id(fieldFirstNameId));
        WebElement actualFieldLastName = driver.findElement(By.id(fieldLastNameId));
        WebElement actualFieldPostcode = driver.findElement(By.id(fieldPostcodeId));

        Assert.assertTrue(actualFieldFirstName.isDisplayed());
        Assert.assertTrue(actualFieldLastName.isDisplayed());
        Assert.assertTrue(actualFieldPostcode.isDisplayed());
    }
}
