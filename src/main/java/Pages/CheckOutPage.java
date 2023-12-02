package Pages;

import Pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage extends PageBase {
    By CartLink=By.className("shopping_cart_link");
    By checkoutbtn=By.className("btn_action");
    By firstName=By.id("first-name");
    By lastName=By.id("last-name");
    By postalCode =By.id("postal-code");
    By conbtn=By.className("btn_primary");
    By finish=By.linkText("FINISH");
    By completeText=By.className("complete-header");

    public CheckOutPage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    public void clickOnCart(){

      driver.findElement(CartLink).click();
    }
    public void clickOnCheckOutBtn(){

      driver.findElement(checkoutbtn).click();
    }
    public void enterFirstName(String FirstName){

      driver.findElement(firstName).sendKeys(FirstName);
    }
    public void enterLastName(String LastName){

      driver.findElement(lastName).sendKeys(LastName);
    }
    public void enterPostalCode(String Code){

      driver.findElement(postalCode).sendKeys(Code);
    }
    public void clickOnConBtn(){

      driver.findElement(conbtn).click();
    }
    public void clickOnFinish(){
      driver.findElement(finish).click();
    }
    public String getCompeteText(){

      return driver.findElement(completeText).getText();
    }
}
