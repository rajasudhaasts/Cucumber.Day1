package runner;

import io.cucumber.testng.CucumberOptions;
import stepDef.ProjectSpecificMethod;

@CucumberOptions(features = "src/test/java/features/editLead.feature", 
				 glue = "stepDef",
				 monochrome = true,
				 publish = true)
public class RunCucumberTest extends ProjectSpecificMethod {

}
