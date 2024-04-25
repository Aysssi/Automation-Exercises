package ProductsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static Tests.BaseTest.driver;

public class Subheader {
    private static final String filterButtonClassName = "product_sort_container";
    private static final String titleClassName = "title";
    private static final String filterOptionsTagName = "option";
    private static final String inventoryItemNameClassName = "inventory_item_name";
    private static final String inventoryItemPriceClassName = "inventory_item_price";

    public static String verifyTheSubheaderTitle() {
        return driver.findElement(By.className(titleClassName)).getText();
    }

    public static WebElement verifyFilterButtonIsPresented() {
        return driver.findElement(By.className(filterButtonClassName));
    }

    public static List<WebElement> verifyExpectedTotalOptionsAndActualNumberOfFilterOptions() {
        WebElement filterOptions = driver.findElement(By.className(filterButtonClassName));
        return filterOptions.findElements(By.tagName(filterOptionsTagName));
    }

    public static List<WebElement> verifyTheSpellingOfAllFilterOptions() {
        WebElement filterOptions = driver.findElement(By.className(filterButtonClassName));
        return filterOptions.findElements(By.tagName(filterOptionsTagName));
    }

    public static boolean verifyTheAscendingNameFilterIsWorking() {
        Select filter = new Select(driver.findElement(By.className(filterButtonClassName)));
        filter.selectByVisibleText("Name (A to Z)");

        List<WebElement> inventoryItemNamesList = driver.findElements(By.className(inventoryItemNameClassName));
        List<String> itemNamesList = new ArrayList<>();

        for (WebElement name : inventoryItemNamesList) {
            String itemName = name.getText();
            if (itemName.startsWith("Sauce Labs")) {
                itemName = itemName.replace("Sauce Labs", "").trim();
                itemNamesList.add(itemName);

            } else {
                itemNamesList.add(itemName);
            }

        }
        int listSize = itemNamesList.size();

        boolean isAscending = true;
        for (int i = 0; i < listSize - 1; i++) {
            if (itemNamesList.get(i).compareTo(itemNamesList.get(i + 1)) > 0) {
                isAscending = false;
                break;
            }

        }
        return isAscending;
    }

    public static boolean verifyTheDescendingNameFilterIsWorking() {
        Select filter = new Select(driver.findElement(By.className(filterButtonClassName)));
        filter.selectByVisibleText("Name (Z to A)");

        List<WebElement> inventoryItemNamesList = driver.findElements(By.className(inventoryItemNameClassName));
        List<String> itemNamesList = new ArrayList<>();

        for (WebElement name : inventoryItemNamesList) {
            String itemName = name.getText();
            if (itemName.startsWith("Sauce Labs")) {
                itemName = itemName.replace("Sauce Labs", "").trim();
                itemNamesList.add(itemName);

            } else {
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
        return isDescending;
    }

    public static boolean verifyThePriceFromLowToHighFilterIsWorking() {
        Select filter = new Select(driver.findElement(By.className(filterButtonClassName)));
        filter.selectByVisibleText("Price (low to high)");

        List<WebElement> inventoryItemPricesList = driver.findElements(By.className(inventoryItemPriceClassName));
        List<Double> itemPricesList = new ArrayList<>();

        for (WebElement price : inventoryItemPricesList) {
            String itemPrice = price.getText();
            if (itemPrice.startsWith("$")) {
                itemPrice = itemPrice.replace("$", "").trim();

                Double itemPriceVal = Double.parseDouble(itemPrice);
                itemPricesList.add(itemPriceVal);
            }
        }
        int itemSize = itemPricesList.size();

        boolean isLowToHigh = true;
        for (int i = 0; i < itemSize - 1; i++) {
            if (itemPricesList.get(i) > itemPricesList.get(i + 1)) {
                isLowToHigh = false;
                break;
            }
        }
        return isLowToHigh;
    }

    public static boolean verifyThePriceFromHighToLowFilterIsWorking() {
        Select filter = new Select(driver.findElement(By.className(filterButtonClassName)));
        filter.selectByVisibleText("Price (high to low)");

        List<WebElement> inventoryItemPricesList = driver.findElements(By.className(inventoryItemPriceClassName));
        List<Double> itemPricesList = new ArrayList<>();

        for (WebElement price : inventoryItemPricesList) {
            String itemPrice = price.getText();
            itemPrice = itemPrice.replace("$", "").trim();

            Double itemPriceValue = Double.parseDouble(itemPrice);
            itemPricesList.add(itemPriceValue);
        }

        int listSize = itemPricesList.size();

        boolean isHighToLow = true;
        for (int i = 0; i < listSize - 1; i++) {
            if (itemPricesList.get(i) < itemPricesList.get(i + 1)) {
                isHighToLow = false;
                break;
            }
        }
       return isHighToLow;
    }

}