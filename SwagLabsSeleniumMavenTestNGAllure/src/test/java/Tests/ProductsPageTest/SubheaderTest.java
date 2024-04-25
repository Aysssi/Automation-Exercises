package Tests.ProductsPageTest;

import LoginPage.LoginFunctionality;
import ProductsPage.Subheader;
import Tests.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class SubheaderTest extends BaseTest {

    @BeforeMethod
    public void validateWithStandardUserAndPassword() throws InterruptedException {
        LoginFunctionality.verifyWithStandardUserAndPassword();
    }

    @Test
    public void validateTheSubheaderTitle(){
        String expectedSubheader = "Products";
        String actualSubheader =  Subheader.verifyTheSubheaderTitle();;
        Assert.assertEquals(expectedSubheader, actualSubheader);
    }

    @Test
    public void validateFilterButtonIsPresented(){
        Assert.assertTrue(Subheader.verifyFilterButtonIsPresented().isDisplayed());
    }

    @Test
    public void validateExpectedTotalOptionsAndActualNumberOfFilterOptions(){
        Subheader.verifyExpectedTotalOptionsAndActualNumberOfFilterOptions();
        List<WebElement> filterOptionsListTagName = Subheader.verifyExpectedTotalOptionsAndActualNumberOfFilterOptions();
        List<String> filterOptionsList = new ArrayList<>();

        for (WebElement filter : filterOptionsListTagName) {
            String option = filter.getText();
            filterOptionsList.add(option);
        }
        Assert.assertEquals(filterOptionsList.size(), 4);
    }

    @Test
    public void validateTheSpellingOfAllFilterOptions(){
        List<WebElement> filterOptionsListTagName = Subheader.verifyTheSpellingOfAllFilterOptions();
        List<String> filterOptionsList = new ArrayList<>();

        for (WebElement filter : filterOptionsListTagName) {
            String option = filter.getText();
            filterOptionsList.add(option);
        }

        String option0 = filterOptionsList.get(0);
        String option1 = filterOptionsList.get(1);
        String option2 = filterOptionsList.get(2);
        String option3 = filterOptionsList.get(3);

        Assert.assertEquals(option0, "Name (A to Z)");
        Assert.assertEquals(option1, "Name (Z to A)");
        Assert.assertEquals(option2, "Price (low to high)");
        Assert.assertEquals(option3, "Price (high to low)");
    }

    @Test
    public void validateTheAscendingNameFilterIsWorking(){
        Assert.assertTrue( Subheader.verifyTheAscendingNameFilterIsWorking());
    }

    @Test
    public static void validateTheDescendingNameFilterIsWorking(){
        Assert.assertTrue(Subheader.verifyTheDescendingNameFilterIsWorking());
    }

    @Test
    public static void validateThePriceFromLowToHighFilterIsWorking(){
        Assert.assertTrue(Subheader.verifyThePriceFromLowToHighFilterIsWorking());;
    }

    @Test
    public static void validateThePriceFromHighToLowFilterIsWorking(){
        Assert.assertTrue(Subheader.verifyThePriceFromHighToLowFilterIsWorking());
    }


}
