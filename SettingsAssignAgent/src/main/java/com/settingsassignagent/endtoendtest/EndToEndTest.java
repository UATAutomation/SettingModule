package com.settingsassignagent.endtoendtest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.settingsassignagent.base.Base;
import com.settingsassignagent.pom.AssignAgentLoc;
import com.settingsassignagent.pom.LogInPage;


@Listeners(com.settingsassignagent.itestlistener.ListenerClass.class)
public class EndToEndTest extends Base
{
	@BeforeTest(alwaysRun = true)
	public void BrowserFirst() throws Throwable
	{
		try 
		{
		Base base=new Base();
		base.initialization();
		}
		catch (Throwable e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 0, groups = { "smoke" })
	public void login()
	{
		try 
		{
			LogInPage log = new LogInPage(driver);
			log.Logdata(prop.getProperty("email"), prop.getProperty("pass"));
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 1, groups = { "regration" })
	public void AssignAgent() 
	{
		try 
		{
			AssignAgentLoc aal= new AssignAgentLoc(driver);
			aal.AssignAgentField();
			
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
			
			
		}
	}	
}
	
