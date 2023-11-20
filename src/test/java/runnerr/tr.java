package runnerr;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/test/resources/ff/mercurytours.feature"},glue= {"defenetion"},plugin = {"html:report/myreport.html"})
public class tr extends AbstractTestNGCucumberTests{

}
