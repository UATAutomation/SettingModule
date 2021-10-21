package com.settingsroles.endtoendtest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.settingsroles.base.Base;
import com.settingsroles.pom.LogInPage;
import com.settingsroles.pom.RolesLoc;


@Listeners(com.settingsroles.itestlistener.ListenerClass.class)
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
	@Test(priority = 1, groups = { "smoke" })
	public void AddRolesField() 
	{
		try 
		{
			RolesLoc mc= new RolesLoc(driver);
			mc.RolesLocField();	
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();		
		}
	}
}
	
