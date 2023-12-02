package Tests;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
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
   ATUTestRecorder recorder;
    @BeforeMethod
    public void SetUp(Method method) throws ATUTestRecorderException {
        driver =new ChromeDriver();
       loginPage = new LoginPage(driver);
        recorder = new ATUTestRecorder("D:\\projects\\POMPractice\\VideoRecording",method.getName(), false);
        recorder.start();
        driver.manage().window().maximize();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

    }
    @AfterMethod
    public void quit(Method method) throws ATUTestRecorderException, IOException {
        TestUtil.TakeSnapshot(method.getName());
        recorder.stop();
        driver.quit();
    }
}
