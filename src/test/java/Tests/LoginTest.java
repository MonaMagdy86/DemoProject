package Tests;

import Tests.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

public class LoginTest extends TestBase {

    @Test(priority = 1,description = "Verify Login ")
    @Description(" Verify Login to Website")
    @Severity(SeverityLevel.BLOCKER)
    public void ValidLogin() {
        String [] data= loginPage.spliting();
        loginPage.loginSteps(data[0],data[1]);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/v1/inventory.html");

    }

   @Test(priority = 2)
    public void InValidLogin() throws IOException{
       loginPage.loginSteps("standard","secret");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/v1/");

    }

}