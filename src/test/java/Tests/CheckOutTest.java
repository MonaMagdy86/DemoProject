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
        System.out.println(total);
        Assert.assertEquals(total,"Total: $62.62");
        checkOut.clickOnFinish();
        String txt=checkOut.getCompeteText();
        Assert.assertEquals(txt,"THANK YOU FOR YOUR ORDER");
    }
}
