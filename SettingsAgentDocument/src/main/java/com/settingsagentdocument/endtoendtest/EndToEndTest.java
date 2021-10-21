package com.settingsagentdocument.endtoendtest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.settingsagentdocument.base.Base;
import com.settingsagentdocument.pom.AgentDocumentLoc;
import com.settingsagentdocument.pom.LogInPage;


@Listeners(com.settingsagentdocument.itestlistener.ListenerClass.class)
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
	public void AddAgentDocumentField() 
	{
		try 
		{
			AgentDocumentLoc ad= new AgentDocumentLoc(driver);
			ad.AgentDocumentLocField();	
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();		
		}
	}
}
	
