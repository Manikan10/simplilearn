package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; 

@RunWith(Cucumber.class) 
@CucumberOptions(features = "src/test/java/features.Simplilearn/simplilearn.feature",glue= {"seleniumgluecode.Simplilearn"},
plugin = {"pretty", "html:Result/Simplilearn"})
//plugin = { "de.monochromata.cucumber.report.PrettyReports:Result/cucumber" })

public class simplilearnrunner { }
