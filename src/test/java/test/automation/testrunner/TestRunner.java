package test.automation.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resource/feature/*.feature",
        plugin = { "pretty", "html:target/cucumber-reports" },
        glue = {"stepDefinition"},
        monochrome = true
)
public class TestRunner {
@AfterClass
public void reportGen()
{
	// To Be Imp
}

}
