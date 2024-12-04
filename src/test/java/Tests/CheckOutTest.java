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
        loginPage.loginSteps("standard_user","secret_sauce");
        new AddToCartPage(driver).addToCartSteps();
        CheckOutPage checkOut=new CheckOutPage(driver);
        checkOut.clickOnCart();
        checkOut.checkOutSteps("Mona","Magdy","123");
        String total=checkOut.getTotal();
        Assert.assertEquals(total,"Total: $62.62");
        checkOut.clickOnFinish();
        String completionText=checkOut.getCompeteText();
        Assert.assertEquals(completionText,"THANK YOU FOR YOUR ORDER\n" +
                "Your order has been dispatched, and will arrive just as fast as the pony can get there!");
    }
}
