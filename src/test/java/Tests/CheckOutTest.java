package Tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import Pages.AddToCartPage;
import Pages.CheckOutPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckOutTest extends TestBase {

    @Test(description = "Verify Completing Order ")
    @Description("Verify CheckOut Function")
    @Severity(SeverityLevel.CRITICAL)
    public void CheckOut(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLogin();
        new AddToCartPage(driver).addToCart();
        CheckOutPage checkOut=new CheckOutPage(driver);
        checkOut.clickOnCart();
        checkOut.clickOnCheckOutBtn();
        checkOut.enterFirstName("Mona");
        checkOut.enterLastName("Magdy");
        checkOut.enterPostalCode("123");
        checkOut.clickOnConBtn();
        checkOut.clickOnFinish();
        String txt=checkOut.getCompeteText();
        Assert.assertEquals(txt,"THANK YOU FOR YOUR ORDER");
    }
}
