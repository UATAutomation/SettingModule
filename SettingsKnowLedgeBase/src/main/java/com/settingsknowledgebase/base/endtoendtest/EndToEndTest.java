package com.settingsknowledgebase.base.endtoendtest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.settingsknowledgebase.base.Base;
import com.settingsknowledgebase.base.pom.KnowLedgeBaseLoc;
import com.settingsknowledgebase.base.pom.LogInPage;
import com.settingsknowledgebase.base.pom.ManageCategory;


@Listeners(com.settingsknowledgebase.base.itestlistener.ListenerClass.class)
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
	public void ManageCategoryLoc() 
	{
		try 
		{
			ManageCategory mc= new ManageCategory(driver);
			mc.ManageCategoryField();
			
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
			
			
		}
	}	
	@Test(priority = 2, groups = { "regration" })
	public void KnowLedgeBase() 
	{
		try 
		{
			KnowLedgeBaseLoc klb= new KnowLedgeBaseLoc(driver);
			klb.KnowLedgeBaseField();
			
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
			
			
		}
	}	
}
	
