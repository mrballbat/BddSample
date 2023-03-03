package com.runner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(
        features = {"src/test/resources/Feature"},
        glue = {"com.stepdefinition"},
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	private TestNGCucumberRunner tcr;
	
	@BeforeClass(alwaysRun = true)
	public void setup() {
		tcr = new TestNGCucumberRunner(this.getClass());
	}
	@Test(groups="cucumber",dataProvider="input")
	public void feature(
			
			
			PickleWrapper pickle,FeatureWrapper feature) {
		tcr.runScenario(pickle.getPickle());
		
	}
	
	@DataProvider
	public Object[][] input(){
		return tcr.provideScenarios();
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDownClass() {
		tcr.finish();
	}
	
}
