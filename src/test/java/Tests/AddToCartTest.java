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
    public void AddToCart(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLogin();
        AddToCartPage add=new AddToCartPage(driver);
        add.addToCart();
        String txt=add.getItemName();
        System.out.println(txt);
        Assert.assertEquals(txt,"Sauce Labs Backpack");
         add.removeBtn();
         String text=add.getItemName();
        System.out.println(text);



    }


    }
