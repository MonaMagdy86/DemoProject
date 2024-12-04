package Tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import Pages.AddToCartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends TestBase {

    @Test(priority = 1,description = "Verify Add to cart ")
    @Description("Verify adding item to cart")
    @Severity(SeverityLevel.CRITICAL)
    public void AddItemsToCart(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLogin();
        AddToCartPage add=new AddToCartPage(driver);
        add.addToCartSteps();
       String numOfItems = add.getItemsNumber();
        Assert.assertEquals(numOfItems,"2");
        add.clickOncartIcon();
        String firstItem=add.getItem1Name();
        Assert.assertEquals(firstItem,"Sauce Labs Fleece Jacket");
        String SecondItem=add.getItem2Name();
        Assert.assertEquals(SecondItem,"Sauce Labs Onesie");
    }

    }
