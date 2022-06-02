package runnner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = "src/test/java/feat/Create.feature", 
				 glue = "stepdefi",
				 monochrome = true,
				 publish = true)			
public class Run extends AbstractTestNGCucumberTests{

}
