package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features="features", glue={"stepDefination"}, plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml" }, tags = {"@tag1"},
//strict = true, dryRun = true)
@CucumberOptions(features = "C:/Users/shubham.kumar/workspace/com.learnautomation.cucumber/features/MyApplication.feature",
                glue={"stepDefination"},
                format={"pretty", "html:test-outout"},
                monochrome=true, // display the console output in a proper format
                strict=true, // it will check if any steps is not define in step defenation file 
                dryRun=false //it will check mapping between step definiton and feature file  
                
  
)
public class TestRunner {

}
