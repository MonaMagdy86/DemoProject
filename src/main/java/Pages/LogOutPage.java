package Pages;

import Pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOutPage extends PageBase {
    By usernameInput=By.id("user-name");
    By passwordInput=By.id("password");
    By loginButton=By.id("login-button");

    By menu=By.className("bm-burger-button");
    By logout=By.id("logout_sidebar_link");

    public LogOutPage(WebDriver driver) {

        super(driver);
    }
    public  void enterUserName(String UserName){

        driver.findElement(usernameInput).sendKeys(UserName);
    }
    public void enterPassword(String password){

        driver.findElement(passwordInput).sendKeys(password);
    }
    public  void clickOnLogin(){

        driver.findElement(loginButton).click();
    }
    public  void clickMenu(){

        driver.findElement(menu).click();
    }
    public  void clickLogOut(){

        driver.findElement(logout).click();
    }
}
