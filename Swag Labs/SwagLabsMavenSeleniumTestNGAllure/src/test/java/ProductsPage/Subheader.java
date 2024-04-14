package ProductsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.lang.management.LockInfo;
import java.util.ArrayList;
import java.util.List;

import static Tests.BaseTest.driver;

public class Subheader {
    public static String filterButton_className = "product_sort_container";

    public static void verifyTheSubheaderTitle() {

        String expectedSubheader = "Products";
        String actualSubheader = driver.findElement(By.className("title")).getText();

        Assert.assertEquals(expectedSubheader, actualSubheader);
    }

    public static void verifyFilterButtonIsPresented() {
        WebElement filerButton = driver.findElement(By.className(filterButton_className));

        Assert.assertTrue(filerButton.isDisplayed());
    }

    public static void verifyExpectedTotalOptionsAndActualNumberOfFilterOptions() {
        WebElement filterOptions = driver.findElement(By.className(filterButton_className));
        List<WebElement> filterOptionsListTagName = filterOptions.findElements(By.tagName("option"));
        List<String> filterOptionsList = new ArrayList<>();

        for (WebElement filter : filterOptionsListTagName) {
            String option = filter.getText();
            filterOptionsList.add(option);
        }

        Assert.assertEquals(filterOptionsList.size(), 4);
    }

    public static void verifyTheSpellingOfAllFilterOptions() {
        WebElement filterOptions = driver.findElement(By.className(filterButton_className));
        List<WebElement> filterOptionsListTagName = filterOptions.findElements(By.tagName("option"));
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

    public static void verifyTheAscendingNameFilterIsWorking() {
        Select filter = new Select(driver.findElement(By.className(filterButton_className)));
        filter.selectByVisibleText("Name (A to Z)");

        List<WebElement> itemListClassName = driver.findElements(By.className("inventory_item_name"));
        List<String> itemNamesList = new ArrayList<>();

        for (WebElement name : itemListClassName) {
            String itemName = name.getText();
            if (itemName.startsWith("Sauce Labs")){
                itemName = itemName.replace("Sauce Labs", "").trim();
                itemNamesList.add(itemName);

            }else {
                itemNamesList.add(itemName);
            }

        }
        int listSize = itemNamesList.size();

        boolean isAscending = true; // true if the list is in ascending order else false
        for (int i = 0; i < listSize -1; i++) {
            if (itemNamesList.get(i).compareTo(itemNamesList.get(i + 1)) > 0) {
                isAscending = false;
                break;
            }

        }

        Assert.assertTrue(isAscending);
    }

    public static void verifyTheDescendingNameFilterIsWorking() {
        Select filter = new Select(driver.findElement(By.className(filterButton_className)));
        filter.selectByVisibleText("Name (Z to A)");

        List<WebElement> itemListClassName = driver.findElements(By.className("inventory_item_name"));
        List<String> itemNamesList = new ArrayList<>();

        for (WebElement name : itemListClassName) {
            String itemName = name.getText();
            if (itemName.startsWith("Sauce Labs")){
                itemName = itemName.replace("Sauce Labs", "").trim();
                itemNamesList.add(itemName);

            }else {
                itemNamesList.add(itemName);
            }
        }

        int listSize = itemNamesList.size();

        boolean isDescending = true;
        for (int i = 0; i < listSize - 1; i++) {
            if (itemNamesList.get(i).compareTo(itemNamesList.get(i + 1)) < 0) {
                isDescending = false;
                break;
            }
        }

        Assert.assertTrue(isDescending);
    }

    public static void verifyThePriceFromLowToHighFilterIsWorking() {
        Select filter = new Select(driver.findElement(By.className(filterButton_className)));
        filter.selectByVisibleText("Price (low to high)");

        List<WebElement> itemPricesListClassName = driver.findElements(By.className("inventory_item_price"));
        List<Double> itemPricesList = new ArrayList<>();

        for (WebElement price : itemPricesListClassName) {
            String itemPrice = price.getText();
            if (itemPrice.startsWith("$")) {
                itemPrice = itemPrice.replace("$", "").trim();

                Double itemPriceVal = Double.parseDouble(itemPrice);
                itemPricesList.add(itemPriceVal);
            }
        }
        int itemSize = itemPricesList.size();

        boolean isLowToHigh = true;
        for (int i = 0; i < itemSize -1; i++) {
            if (itemPricesList.get(i) > itemPricesList.get(i + 1)) {
                isLowToHigh = false;
                break;
            }
        }

        Assert.assertTrue(isLowToHigh);
    }

    public static void verifyThePriceFromHighToLowFilterIsWorking(){
        Select filter = new Select(driver.findElement(By.className(filterButton_className)));
        filter.selectByVisibleText("Price (high to low)");

        List<WebElement> itemPricesListClassName = driver.findElements(By.className("inventory_item_price"));
        List<Double> itemPricesList = new ArrayList<>();

        for (WebElement price : itemPricesListClassName){
            String itemPrice = price.getText();
            itemPrice = itemPrice.replace("$", "").trim();

            Double itemPriceValue = Double.parseDouble(itemPrice);
            itemPricesList.add(itemPriceValue);
        }

        int listSize = itemPricesList.size();

        boolean isHighToLow = true;
        for (int i = 0; i < listSize -1; i++) {
            if (itemPricesList.get(i) < itemPricesList.get(i +1)){
                isHighToLow = false;
                break;
            }
        }

        Assert.assertTrue(isHighToLow);
    }
}