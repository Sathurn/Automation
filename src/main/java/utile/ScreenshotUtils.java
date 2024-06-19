package utile;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtils {

    private WebDriver driver;

    public ScreenshotUtils(WebDriver driverFromBaseTestClass){
        this.driver = driverFromBaseTestClass;
    }

    public void captureAndSaveScreenshots(String testName){

        try {

            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
            String screenshotName = testName + "_" + timeStamp + ".png";
            String screenshotDirectory = "Screenshots";

            File targetFile = new File(screenshotDirectory, screenshotName);
            FileUtils.copyFile(new File(screenshotName), targetFile);

            System.out.println("Screenshot saved to: " + targetFile.getAbsolutePath());

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

}
