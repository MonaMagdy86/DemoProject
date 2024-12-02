package Pages;

import Pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase {
    By usernameInput=By.id("user-name");
    By passwordInput=By.id("password");
    By loginButton=By.id("login-button");

    public LoginPage(WebDriver driver) {

        super(driver);
}
    public void loginSteps(String userName,String pass){
        enterUserName(userName);
        enterPassword(pass);
        clickOnLogin();
    }
public void enterUserName( String UserName){

        driver.findElement(usernameInput).sendKeys(UserName);
}
public void enterPassword(String password){

        driver.findElement(passwordInput).sendKeys(password);
}
public void clickOnLogin(){

        driver.findElement(loginButton).click();
}

}