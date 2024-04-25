package Tests.ProductsPageTest;

import LoginPage.LoginFunctionality;
import ProductsPage.ProductsPage01;
import Tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductsPage01Test extends BaseTest {

    @BeforeMethod
    public void validateWithStandardUserAndPassword() throws InterruptedException {
        LoginFunctionality.verifyWithStandardUserAndPassword();
    }

    @Test
    public void validateTheUrl(){
        String expectedPage = "https://www.saucedemo.com/inventory.html";
        String actualPage = ProductsPage01.verifyTheUrl();;

        Assert.assertEquals(actualPage,expectedPage);
    }

    @Test
    public void validateTheTitlePage(){
        ProductsPage01.verifyTheTitlePage();
        String expectedTitle = "Swag Labs";
        String actualTitle = ProductsPage01.verifyTheTitlePage();;
        Assert.assertEquals(actualTitle,expectedTitle);
    }

}
