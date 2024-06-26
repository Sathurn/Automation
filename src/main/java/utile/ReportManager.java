package utile;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import javax.naming.ldap.ExtendedRequest;

public class ReportManager {

    public static ExtentReports extentReports;

    public static ExtentReports getInstance(){

        if(extentReports == null){
            String reportName = "test-report.html";
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportName);
            extentReports = new ExtentReports();
            extentReports.attachReporter(sparkReporter);
        }

        return extentReports;
    }

    public static ExtentTest createTest(String testName){

        return getInstance().createTest(testName);

    }

    public static void ReportGenerator(){

        extentReports.flush();

    }

}
