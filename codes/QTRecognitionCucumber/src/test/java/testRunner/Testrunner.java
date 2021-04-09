package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="src/test/java/features",
		glue="StepDefinition"
		)

public class Testrunner extends AbstractTestNGCucumberTests {
	

}
