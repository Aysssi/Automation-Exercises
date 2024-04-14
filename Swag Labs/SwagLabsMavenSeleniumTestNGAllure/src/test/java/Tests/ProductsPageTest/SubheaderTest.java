package Tests.ProductsPageTest;

import LoginPage.LoginFunctionality;
import ProductsPage.Subheader;
import Tests.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SubheaderTest extends BaseTest {

    @BeforeMethod
    public void validateWithStandardUserAndPassword() throws InterruptedException {
        LoginFunctionality.verifyWithStandardUserAndPassword();
    }


    @Test
    public void validateTheSubheaderTitle(){
        Subheader.verifyTheSubheaderTitle();
    }

    @Test
    public void validateFilterButtonIsPresented(){
        Subheader.verifyFilterButtonIsPresented();
    }

    @Test
    public void validateExpectedTotalOptionsAndActualNumberOfFilterOptions(){
        Subheader.verifyExpectedTotalOptionsAndActualNumberOfFilterOptions();
    }

    @Test
    public void validateTheSpellingOfAllFilterOptions(){
        Subheader.verifyTheSpellingOfAllFilterOptions();
    }

    @Test
    public void validateTheAscendingNameFilterIsWorking(){
        Subheader.verifyTheAscendingNameFilterIsWorking();
    }

    @Test
    public static void validateTheDescendingNameFilterIsWorking(){
        Subheader.verifyTheDescendingNameFilterIsWorking();
    }

    @Test
    public static void validateThePriceFromLowToHighFilterIsWorking(){
        Subheader.verifyThePriceFromLowToHighFilterIsWorking();
    }

    @Test
    public static void validateThePriceFromHighToLowFilterIsWorking(){
        Subheader.verifyThePriceFromHighToLowFilterIsWorking();
    }


}
