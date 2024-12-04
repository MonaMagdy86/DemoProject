package Pages;

import Pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOutPage extends PageBase {
    By menu=By.className("bm-burger-button");
    By logout=By.id("logout_sidebar_link");

    public LogOutPage(WebDriver driver) {

        super(driver);
    }
    public void logOutSteps(){
        clickMenu();
        clickLogOut();
    }
    public  void clickMenu(){

        driver.findElement(menu).click();
    }
    public  void clickLogOut(){

        driver.findElement(logout).click();
    }
}
