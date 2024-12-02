package Pages;

import Pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage extends PageBase {
    By cartLink=By.className("shopping_cart_link");
    By checkOutBtn=By.className("btn_action");
    By firstName=By.id("first-name");
    By lastName=By.id("last-name");
    By postalCode =By.id("postal-code");
    By contBtn=By.className("btn_primary");
    By total=By.className("summary_total_label");
    By finish=By.linkText("FINISH");
    By completeText=By.className("complete-header");

    public CheckOutPage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    public void clickOnCart(){

      driver.findElement(cartLink).click();
    }

    public void checkOutSteps(String firstName, String lastName,String postalCode){
        clickOnCheckOutBtn();
        enterFirstName(firstName);
        enterLastName(lastName);
        enterPostalCode(postalCode);
        clickOnConBtn();
    }
    public void clickOnCheckOutBtn(){

      driver.findElement(checkOutBtn).click();
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

      driver.findElement(contBtn).click();
    }
    public String getTotal(){
        return driver.findElement(total).getText();
    }
    public void clickOnFinish(){
      driver.findElement(finish).click();
    }
    public String getCompeteText(){

      return driver.findElement(completeText).getText();
    }
}
