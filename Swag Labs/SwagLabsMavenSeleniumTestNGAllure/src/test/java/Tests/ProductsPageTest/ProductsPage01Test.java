package Tests.ProductsPageTest;

import LoginPage.LoginFunctionality;
import ProductsPage.ProductsPage01;
import Tests.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductsPage01Test extends BaseTest {

    @BeforeMethod
    public void validateWithStandardUserAndPassword() throws InterruptedException {
        LoginFunctionality.verifyWithStandardUserAndPassword();
    }

    @Test
    public void validateTheUrl(){
       ProductsPage01.verifyTheUrl();
    }

    @Test
    public void validateTheTitlePage(){
       ProductsPage01.verifyTheTitlePage();
    }

}
