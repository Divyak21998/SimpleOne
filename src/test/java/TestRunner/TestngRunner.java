package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/Features",glue="StepDefenition",monochrome = true,tags = "@smoketese",
plugin= {"pretty", "html:target/cucumber.html","json:target/cucumber.json"})
public class TestngRunner extends AbstractTestNGCucumberTests {

}
