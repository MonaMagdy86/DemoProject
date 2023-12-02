package Tests;

import Pages.LogOutPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogOutTest extends TestBase {
    @Test
    public void LogOutTest() {
        LogOutPage logout=new LogOutPage(driver);
        logout.enterUserName("standard_user");
        logout.enterPassword("secret_sauce");
        logout.clickOnLogin();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/v1/inventory.html");
        logout.clickMenu();
        logout.clickLogOut();
       String ExpectedURL="https://www.saucedemo.com/v1/index.html";
        Assert.assertEquals(ExpectedURL,driver.getCurrentUrl());
    }
}
