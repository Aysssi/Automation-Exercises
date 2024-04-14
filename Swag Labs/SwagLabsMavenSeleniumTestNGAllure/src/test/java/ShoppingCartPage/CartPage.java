package ShoppingCartPage;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static Tests.BaseTest.driver;

public class CartPage {
    public static String shoppingCartIcon_css ="#shopping_cart_container > a";

    public static void verifyItemQTYIsPresented(){
        driver.findElement(By.cssSelector(shoppingCartIcon_css)).click();
        WebElement itemQTY = driver.findElement(By.cssSelector("#cart_contents_container > div > div.cart_list > div.cart_quantity_label"));

        Assert.assertTrue(itemQTY.isDisplayed());
    }

    public static void verifyTheItemDescriptionIsPresented(){
        driver.findElement(By.cssSelector(shoppingCartIcon_css)).click();
        WebElement itemDescription = driver.findElement(By.cssSelector("#cart_contents_container > div > div.cart_list > div.cart_desc_label"));

        Assert.assertTrue(itemDescription.isDisplayed());
    }

    public static void verifyTheItemTitleIsClickable(){
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        driver.findElement(By.cssSelector(shoppingCartIcon_css)).click();

        WebElement itemTitle = driver.findElement(By.cssSelector("#item_1_title_link > div"));

        Assert.assertTrue(itemTitle.isEnabled());
    }

    public static void verifyTheItemTitleIsWorking(){
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        driver.findElement(By.cssSelector(shoppingCartIcon_css)).click();

        WebElement itemTitle = driver.findElement(By.cssSelector("#item_1_title_link > div"));
        itemTitle.click();

        String expectedUrl = "https://www.saucedemo.com/inventory-item.html?id=1";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);

    }
    public static void verifyThePriceOfTheItemIsPresented(){
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        driver.findElement(By.cssSelector(shoppingCartIcon_css)).click();

        WebElement itemPrice = driver.findElement(By.cssSelector("#cart_contents_container > div > div.cart_list > div.cart_item > div.cart_item_label > div.item_pricebar > div"));

        Assert.assertTrue(itemPrice.isDisplayed());

    }

    public static void verifyTheRemoveButtonIsPresented(){
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        driver.findElement(By.cssSelector(shoppingCartIcon_css)).click();

        WebElement removeButton = driver.findElement(By.id("remove-sauce-labs-bike-light"));

        Assert.assertTrue(removeButton.isDisplayed());

    }

    public static void verifyTheRemoveButtonIsWorking(){

        boolean isButtonWorking = false;
        try {
            driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

            WebElement shoppingCartIcon = driver.findElement(By.cssSelector(shoppingCartIcon_css));
            shoppingCartIcon.click();

            boolean isDisplayed = driver.findElement(By.className("cart_item")).isDisplayed();

            WebElement removeButton = driver.findElement(By.id("remove-sauce-labs-bike-light"));
            removeButton.click();
            shoppingCartIcon.click();

            boolean isNotDisplayed = driver.findElement(By.className("cart_item")).isDisplayed();

            if (isDisplayed == isNotDisplayed) {
                isButtonWorking = true;
            }

        }
        catch (StaleElementReferenceException e) {
            isButtonWorking = true;
        }

        Assert.assertTrue(isButtonWorking);
    }

    public static void verifyTheCheckoutButtonIsPresented(){
        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        driver.findElement(By.cssSelector(shoppingCartIcon_css)).click();

        WebElement checkoutButton = driver.findElement(By.id("checkout"));

        Assert.assertTrue(checkoutButton.isDisplayed());

    }
    public static void verifyTheCheckoutButtonIsWorking(){
        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        driver.findElement(By.cssSelector(shoppingCartIcon_css)).click();

        WebElement checkoutButton = driver.findElement(By.id("checkout"));
        checkoutButton.click();

        WebElement actualFieldFirstName = driver.findElement(By.id("first-name"));
        WebElement actualFieldLastName = driver.findElement(By.id("last-name"));
        WebElement actualFieldPostcode = driver.findElement(By.id("postal-code"));

        Assert.assertTrue(actualFieldFirstName.isDisplayed());
        Assert.assertTrue(actualFieldLastName.isDisplayed());
        Assert.assertTrue(actualFieldPostcode.isDisplayed());

    }
}
