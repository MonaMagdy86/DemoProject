package Tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestUtil extends TestBase {

    static void TakeSnapshot(String name) throws IOException {
        File SrcFile= ((TakesScreenshot) TestBase.driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(SrcFile, new File("D:\\projects\\POMPractice\\SnapShots\\"+name+".png"));

    }


    }
