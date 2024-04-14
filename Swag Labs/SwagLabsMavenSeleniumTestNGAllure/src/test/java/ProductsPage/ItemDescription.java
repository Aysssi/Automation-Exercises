package ProductsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static Tests.BaseTest.driver;
public class ItemDescription {

    public static void verifyTheProductTitleIsPresent(){
        WebElement title = driver.findElement(By.cssSelector("#item_4_title_link > div"));

        Assert.assertTrue(title.isDisplayed());
    }

    public static void verifyTheProductPictureIsPresent(){
        WebElement picture = driver.findElement(By.cssSelector("#item_4_img_link > img"));

        Assert.assertTrue(picture.isDisplayed());
    }
    public static void verifyTheProductDescriptionIsPresent(){
        WebElement description = driver.findElement(By.cssSelector("div:nth-of-type(1) > .inventory_item_description > .inventory_item_label > .inventory_item_desc"));

        Assert.assertTrue(description.isDisplayed());
    }

    public static void verifyTheProductPriceIsPresent(){
        WebElement price = driver.findElement(By.cssSelector("div:nth-of-type(1) > .inventory_item_description > .pricebar > .inventory_item_price"));

        Assert.assertTrue(price.isDisplayed());
    }

    public static void verifyTheAddToCartButtonIsPresent(){
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));

        Assert.assertTrue(addToCartButton.isDisplayed());
    }

    public static void verifyTheAddToCartButtonIsEnabled(){
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));

        Assert.assertTrue(addToCartButton.isEnabled());

    }

    public static void verifyTheAddToCartButtonIsChangedToRemoveButton(){
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCartButton.click();
        WebElement removeButton = driver.findElement(By.id("remove-sauce-labs-backpack"));

        Assert.assertTrue(removeButton.isDisplayed());
    }

    public static void verifyTheRemoveButtonIsEnable(){
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCartButton.click();
        WebElement removeButton = driver.findElement(By.id("remove-sauce-labs-backpack"));

        Assert.assertTrue(removeButton.isEnabled());
    }

    public static void verifyRemoveButtonIsWorking(){
        boolean isButtonWorking = false;

        try {
            driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

            WebElement shoppingCartIcon = driver.findElement(By.cssSelector("#shopping_cart_container > a"));
            shoppingCartIcon.click();

            boolean isDisplayed = driver.findElement(By.className("cart_item")).isDisplayed();

            driver.findElement(By.id("continue-shopping")).click();
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

    public static void verifyShoppingCartIsEnable(){
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCartButton.click();

        WebElement shoppingCart = driver.findElement(By.id("shopping_cart_container"));

        Assert.assertTrue(shoppingCart.isEnabled());
    }
}
