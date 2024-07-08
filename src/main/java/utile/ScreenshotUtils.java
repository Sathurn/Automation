package utile;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtils {
    private WebDriver driver;

    public ScreenshotUtils(WebDriver driverFromBaseTestClass) {
        this.driver = driverFromBaseTestClass;
    }

    public String captureAndSaveScreenshots(String testName) {
        String screenshotPath = null; //aici este modificare
        try {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
            String screenshotName = testName + "_" + timeStamp + ".png";
            String screenshotDirectory = "Screenshots";

            new File(screenshotDirectory).mkdirs();
            File targetFile = new File(screenshotDirectory, screenshotName);
            FileUtils.copyFile(screenshotFile, targetFile);

            screenshotPath = targetFile.getAbsolutePath(); //aici este modificare
            System.out.println("Screenshot saved to: " + screenshotPath);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return screenshotPath; //aici este modificare
    }
}