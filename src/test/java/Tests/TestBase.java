package Tests;

import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

public class TestBase {
   protected final String URL = "https://www.saucedemo.com/v1/";
    protected static WebDriver driver;
    protected LoginPage loginPage;
    @BeforeMethod
    public void SetUp(Method method) {
        driver =new ChromeDriver();
       loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

    }
    @AfterMethod
    public void quit(Method method) throws IOException {
        TestUtil.TakeSnapshot(method.getName());
        driver.quit();
    }
}
