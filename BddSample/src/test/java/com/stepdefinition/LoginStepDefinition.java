package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import Utilities.Actions;
import Utilities.DriverManager;
import io.cucumber.java.en.*;

public class LoginStepDefinition {
@Given("Navigation url is working")
	public void navigation_url_is_working() throws Exception {
	    
	    WebDriver driver =DriverManager.launchBrowser();
	    
	    String url =driver.getCurrentUrl();
	    System.out.println(url);
	    
	}

	@When("I navigate to the ritual website")
	public void i_navigate_to_the_ritual_website() {
	  
	    System.out.println("when class");
		
	}

	@Then("validate that we landed in the ritual website")
	public void validate_that_we_landed_in_the_ritual_website() {
	    
	    System.out.println("then class");
		
	}
}
