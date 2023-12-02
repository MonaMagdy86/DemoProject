package Pages;

import Pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage extends PageBase {
    By AddToCartBtn=By.className("btn_primary");
    By ItemName=By.linkText("Sauce Labs Backpack");
    By Remove=By.className("btn_secondary");
    public AddToCartPage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    public void addToCart(){
        driver.findElement(AddToCartBtn).click();

    }

    public void removeBtn(){
         driver.findElement(Remove).click();
    }

    public String getItemName(){
        return driver.findElement(ItemName).getText();
    }
}
