package com.listeners;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Utilities.Actions;

public class Listeners implements ITestListener{
	WebDriver driver;
	
	 @Override
	    public void onTestStart(ITestResult result) {
	        System.out.println("Test case started: " + result.getName());
	    }
	    
	    @Override
	    public void onTestSuccess(ITestResult result) {
	        System.out.println("Test case passed: " + result.getName());
	        try {
				Actions.captureScreenshot(driver);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    @Override
	    public void onTestFailure(ITestResult result) {
	        System.out.println("Test case failed: " + result.getName());
	    }
	    
	    @Override
	    public void onTestSkipped(ITestResult result) {
	        System.out.println("Test case skipped: " + result.getName());
	    }
	    
	    @Override
	    public void onStart(ITestContext context) {
	        System.out.println("context");
	    }
	
	
}
