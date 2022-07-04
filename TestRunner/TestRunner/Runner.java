package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)	
@CucumberOptions(features="C://Users//ederw//Documents//QA//gherkinWithSelenium//features",
                 glue="C://Users//ederw//Documents//QA//gherkinWithSelenium//StepDefinition//StepDefinition//Steps.java",
                 format={"pretty","html:test-output"})
public class Runner 				
{		
    
}