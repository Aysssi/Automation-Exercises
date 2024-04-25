package ProductsPage;

import static Tests.BaseTest.driver;

public class ProductsPage01 {

    public static String verifyTheUrl(){
        return driver.getCurrentUrl();
    }

    public static String verifyTheTitlePage(){
         return driver.getTitle();
    }


}
