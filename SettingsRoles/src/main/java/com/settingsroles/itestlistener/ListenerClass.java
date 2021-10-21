package com.settingsroles.itestlistener;

import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener
{
	 @Override
	  public void onFinish(ITestContext context) 
	  {
		 System.out.println("The name of the testcase Finished is :"+context.getName());	
	  }
	  @Override public void onTestStart(ITestResult result) 
	  {  
	  System.out.println("The name of the testcase started is :"+result.getName());
	  }
	  @Override public void onTestSuccess(ITestResult result) 
	  {
	  System.out.println("The name of the testcase succes is :"+result.getName());
	  }
	  @Override public void onTestFailure(ITestResult result) 
	  {
	  System.out.println("The name of the testcase testfailure is :"+result.getName ()); 
	  }
	  @Override public void onTestSkipped(ITestResult result) 
	  {
	  System.out.println("The name of the testcase skipped is :"+result.getName());
	  }
	  @Override 
	  public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	  { 
	  System.out.println("The name of the testcase per is :"+result.getName());
	  }

}
