package ProductsPage;
import org.testng.Assert;

import static Tests.BaseTest.driver;

public class ProductsPage01 {

    public static void verifyTheUrl(){

        String expectedPage = "https://www.saucedemo.com/inventory.html";
        String actualPage = driver.getCurrentUrl();

        Assert.assertEquals(actualPage,expectedPage);
    }

    public static void verifyTheTitlePage(){

         String expectedTitle = "Swag Labs";
         String actualTitle = driver.getTitle();

         Assert.assertEquals(actualTitle,expectedTitle);
    }


}
