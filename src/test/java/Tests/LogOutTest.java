package Tests;

import Pages.LogOutPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogOutTest extends TestBase {
    @Test
    public void LogOutTest() {
        LogOutPage logout=new LogOutPage(driver);
        loginPage.loginSteps("standard_user","secret_sauce");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/v1/inventory.html");
        logout.logOutSteps();
       String ExpectedURL="https://www.saucedemo.com/v1/index.html";
        Assert.assertEquals(ExpectedURL,driver.getCurrentUrl());
    }
}
