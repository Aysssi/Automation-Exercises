package ShoppingCartPage;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import static Tests.BaseTest.driver;

public class CartPage {
    private static final String shoppingCartIconCss = "#shopping_cart_container > a";
    private static final String cartItemClassName = "cart_item";
    private static final String itemQTYCss = "#cart_contents_container > div > div.cart_list > div.cart_quantity_label";
    private static final String itemDescriptionCss = "#cart_contents_container > div > div.cart_list > div.cart_desc_label";
    private static final String itemTitleCss = "#item_1_title_link > div";
    private static final String itemPriceCss = "#cart_contents_container > div > div.cart_list > div.cart_item > div.cart_item_label > div.item_pricebar > div";
    private static final String removeButtonId = "remove-sauce-labs-bike-light";
    private static final String checkoutButtonId = "checkout";
    private static final String addToCartTShirtId = "add-to-cart-sauce-labs-bolt-t-shirt";
    private static final String addToCartBikeLightId = "add-to-cart-sauce-labs-bike-light";
    private static final String removeButtonBikeLightId = "remove-sauce-labs-bike-light";
    private static final String checkoutYourInformationCss = "#header_container > div.header_secondary_container > span";
    public static WebElement verifyItemQTYIsPresented(){
        driver.findElement(By.cssSelector(shoppingCartIconCss)).click();
        return driver.findElement(By.cssSelector(itemQTYCss));
    }

    public static WebElement verifyTheItemDescriptionIsPresented(){
        driver.findElement(By.cssSelector(shoppingCartIconCss)).click();
        return driver.findElement(By.cssSelector(itemDescriptionCss));
    }

    public static WebElement verifyTheItemTitleIsClickable(){
        driver.findElement(By.id(addToCartTShirtId)).click();
        driver.findElement(By.cssSelector(shoppingCartIconCss)).click();
        return driver.findElement(By.cssSelector(itemTitleCss));
    }

    public static String verifyTheItemTitleIsWorking(){
        driver.findElement(By.id(addToCartTShirtId)).click();
        driver.findElement(By.cssSelector(shoppingCartIconCss)).click();
        WebElement itemTitle = driver.findElement(By.cssSelector(itemTitleCss));
        itemTitle.click();
        return driver.getCurrentUrl();
    }
    public static WebElement verifyThePriceOfTheItemIsPresented(){
        driver.findElement(By.id(addToCartBikeLightId)).click();
        driver.findElement(By.cssSelector(shoppingCartIconCss)).click();
        return driver.findElement(By.cssSelector(itemPriceCss));
    }

    public static WebElement verifyTheRemoveButtonIsPresented(){
        driver.findElement(By.id(addToCartBikeLightId)).click();
        driver.findElement(By.cssSelector(shoppingCartIconCss)).click();
        return driver.findElement(By.id(removeButtonId));
    }

    public static boolean verifyTheRemoveButtonIsWorking(){
        boolean isButtonWorking = false;
        try {
            driver.findElement(By.id(addToCartBikeLightId)).click();

            WebElement shoppingCartIcon = driver.findElement(By.cssSelector(shoppingCartIconCss));
            shoppingCartIcon.click();

            boolean isDisplayed = driver.findElement(By.className(cartItemClassName)).isDisplayed();

            WebElement removeButton = driver.findElement(By.id(removeButtonBikeLightId));
            removeButton.click();
            shoppingCartIcon.click();

            boolean isNotDisplayed = driver.findElement(By.className(cartItemClassName)).isDisplayed();

            if (isDisplayed == isNotDisplayed) {
                isButtonWorking = true;
            }

        }
        catch (StaleElementReferenceException e) {
            isButtonWorking = true;
        }

       return isButtonWorking;
    }

    public static WebElement verifyTheCheckoutButtonIsPresented(){
        driver.findElement(By.id(addToCartBikeLightId)).click();
        driver.findElement(By.cssSelector(shoppingCartIconCss)).click();
        return driver.findElement(By.id(checkoutButtonId));
    }
    public static void verifyTheCheckoutButtonIsWorking(){
        driver.findElement(By.id(addToCartBikeLightId)).click();
        driver.findElement(By.cssSelector(shoppingCartIconCss)).click();

        WebElement checkoutButton = driver.findElement(By.id(checkoutButtonId));
        checkoutButton.click();
        driver.findElement(By.cssSelector(checkoutYourInformationCss));
    }
}
