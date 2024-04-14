package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/Features",glue="StepDefenitions",monochrome = true,
dryRun=true,plugin = {"pretty","html:taret/cucumber.html"})
public class TestNgTestRunner extends AbstractTestNGCucumberTests {

}
