package com.Settingsforms.Utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class list  implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		 System.out.println("The name of the testcase started is :"+result.getName());	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		 System.out.println("The name of the testcase succes is :"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		 System.out.println("The name of the testcase testfailure is :"+result.getName());	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		 System.out.println("The name of the testcase skipped is :"+result.getName());	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		 System.out.println("The name of the testcase per is :"+result.getName());	
	}

	
	


	
	
}
	
		

							
		

/*
	    // When Test case get failed, this method is called.		
	    @Override		
	    public void onTestFailure(ITestResult Result) 					
	    {		
	    System.out.println("The name of the testcase failed is :"+Result.getName());					
	    }		

	    // When Test case get Skipped, this method is called.		
	    @Override		
	    public void onTestSkipped(ITestResult Result)					
	    {		
	    System.out.println("The name of the testcase Skipped is :"+Result.getName());					
	    }		

	    // When Test case get Started, this method is called.		
	    @Override		
	    public void onTestStart(ITestResult Result)					
	    {		
	    System.out.println(Result.getName()+" test case started");					
	    }		

	    // When Test case get passed, this method is called.		
	    @Override		
	    public void onTestSuccess(ITestResult Result)					
	    {		
	    System.out.println("The name of the testcase passed is :"+Result.getName());					
	    }		

	}	*/		

