package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
        features = "src/test/resources/proprietati/features",
        glue = "stepDefinition"
)


public class TestRunner extends AbstractTestNGCucumberTests{



}
