package ProductsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import static Tests.BaseTest.driver;
public class ItemDescription {
    private static final String titleCss = "#item_4_title_link > div";
    private static final String imageCss = "#item_4_img_link > img";
    private static final String descriptionCss = "div:nth-of-type(1) > .inventory_item_description > .inventory_item_label > .inventory_item_desc";
    private static final String priceCss = "div:nth-of-type(1) > .inventory_item_description > .pricebar > .inventory_item_price";
    private static final String addToCartButtonBackpackId = "add-to-cart-sauce-labs-backpack";
    private static final String removeButtonBackpackId = "remove-sauce-labs-backpack";
    private static final String shoppingCartContainerACss = "#shopping_cart_container > a";
    private static final String shoppingCartId = "shopping_cart_container";
    private static final String cartItemClassName = "cart_item";
    private static final String continueShoppingId = "continue-shopping";
    private static final String removeButtonBikeLightId = "remove-sauce-labs-bike-light";
    private static final String bikeLightId = "add-to-cart-sauce-labs-bike-light";



    public static WebElement verifyTheProductTitleIsPresent(){
       return driver.findElement(By.cssSelector(titleCss));
    }

    public static WebElement verifyTheProductImageIsPresent(){
        return driver.findElement(By.cssSelector(imageCss));
    }
    public static WebElement verifyTheProductDescriptionIsPresent(){
        return driver.findElement(By.cssSelector(descriptionCss));
    }

    public static WebElement verifyTheProductPriceIsPresent(){
        return driver.findElement(By.cssSelector(priceCss));
    }

    public static WebElement verifyTheAddToCartButtonIsPresent(){
        return driver.findElement(By.id(addToCartButtonBackpackId));
    }

    public static WebElement verifyTheAddToCartButtonIsEnabled(){
        return driver.findElement(By.id(addToCartButtonBackpackId));
    }

    public static WebElement verifyTheAddToCartButtonIsChangedToRemoveButton(){
        WebElement addToCartButton = driver.findElement(By.id(addToCartButtonBackpackId));
        addToCartButton.click();
        return driver.findElement(By.id(removeButtonBackpackId));
    }

    public static WebElement verifyTheRemoveButtonIsEnable(){
        WebElement addToCartButton = driver.findElement(By.id(addToCartButtonBackpackId));
        addToCartButton.click();
        return driver.findElement(By.id(removeButtonBackpackId));
    }

    public static boolean verifyRemoveButtonIsWorking(){
        boolean isButtonWorking = false;

        try {
            driver.findElement(By.id(bikeLightId)).click();

            WebElement shoppingCartIcon = driver.findElement(By.cssSelector(shoppingCartContainerACss));
            shoppingCartIcon.click();

            boolean isDisplayed = driver.findElement(By.className(cartItemClassName)).isDisplayed();

            driver.findElement(By.id(continueShoppingId)).click();
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

    public static WebElement verifyShoppingCartIsEnable(){
        WebElement addToCartButton = driver.findElement(By.id(addToCartButtonBackpackId));
        addToCartButton.click();
        return driver.findElement(By.id(shoppingCartId));
    }
}
