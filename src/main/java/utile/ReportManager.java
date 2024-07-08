package utile;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportManager {
    private static ExtentReports extentReports;

    public static ExtentReports getInstance() {
        if (extentReports == null) {
            String reportName = "ExtentReports.html";
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportName);
            extentReports = new ExtentReports();
            extentReports.attachReporter(sparkReporter);
        }
        return extentReports;
    }

    public static ExtentTest createTest(String testName) {
        return getInstance().createTest(testName);
    }
}