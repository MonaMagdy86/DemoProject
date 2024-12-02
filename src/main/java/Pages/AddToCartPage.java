package Pages;

import Pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage extends PageBase {
    By addToCartBtn=By.xpath("//button[@class='btn_primary btn_inventory']");
    By itemName1=By.linkText("Sauce Labs Fleece Jacket");
    By backBtn=By.xpath("//button[@class='inventory_details_back_button']");
    By itemName2=By.linkText("Sauce Labs Onesie");
    By itemsNumber=By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']");

    By cartIcon= By.xpath("//a[@href=\"./cart.html\"]");
    public AddToCartPage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    public void addToCartSteps(){
        clickOnItem1();
        addToCart();
        clickOnBackButton();
        clickOnItem2();
        addToCart();

    }
    public void clickOnItem1(){
        driver.findElement(itemName1).click();

    }
    public void addToCart(){
        driver.findElement(addToCartBtn).click();

    }
public void clickOnBackButton(){
        driver.findElement(backBtn).click();
}
    public void clickOnItem2(){
        driver.findElement(itemName2).click();

    }
    public String getItemsNumber(){
        return driver.findElement(itemsNumber).getText();
    }
    public void clickOncartIcon(){
        driver.findElement(cartIcon).click();

    }
    public String getItem1Name(){
        return driver.findElement(itemName1).getText();
    }
    public String getItem2Name(){
        return driver.findElement(itemName2).getText();
    }
}

