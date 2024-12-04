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
    public String[] spliting(){
        String text=  driver.findElement(By.id("login_credentials")).getText();
        String[] lines = text.split("\n");
        String username = lines[1];
        String text2=driver.findElement(By.className("login_password")).getText();
        String[] lines2 = text2.split("\n");
        String password = lines2[1];
        System.out.println(username);
         System.out.println(password);
        return new String[] {username,password};

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