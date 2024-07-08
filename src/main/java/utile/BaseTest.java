package utile;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    public WebDriver driver;
    private ExtentTest extentTest;
    private ScreenshotUtils screenshotUtils;
    private static ExtentReports extentReports; //aici este modificare

    @BeforeClass
    public void setupClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        screenshotUtils = new ScreenshotUtils(driver);
        driver.get("http://apptest.go.ro:9999/login");

        if (extentReports == null) { //aici este modificare
            extentReports = new ExtentReports();
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter("ExtentReports.html");
            extentReports.attachReporter(sparkReporter);
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }

        if (extentReports != null) { //aici este modificare
            extentReports.flush();
        }
    }

    @AfterMethod
    public void afterMethod(ITestResult result) {
        if (extentTest == null) {
            return;
        }
        if (result.getStatus() == ITestResult.FAILURE) {
            String screenshotPath = captureAndSaveFailureScreenshot(result.getMethod().getMethodName());
            extentTest.log(Status.FAIL, MarkupHelper.createLabel("Test case Failed: " + result.getName(), ExtentColor.RED));
            extentTest.fail(result.getThrowable());

            if (screenshotPath != null) {
                try {
                    extentTest.addScreenCaptureFromPath(screenshotPath); //aici este modificare
                } catch (Throwable e) {
                    extentTest.log(Status.FAIL, "Failed to attach screenshot: " + e.getMessage());
                }
            }
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            extentTest.log(Status.PASS, MarkupHelper.createLabel("Test case Passed: " + result.getName(), ExtentColor.GREEN));
        } else {
            extentTest.log(Status.SKIP, MarkupHelper.createLabel("Test case Skipped: " + result.getName(), ExtentColor.YELLOW));
        }
    }

    public void initTest(String testName) {
        extentTest = extentReports.createTest(testName); //aici este modificare
    }

    private String captureAndSaveFailureScreenshot(String testName) {
        return screenshotUtils.captureAndSaveScreenshots(testName);
    }
}