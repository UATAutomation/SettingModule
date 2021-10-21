package com.Settingsforms.End;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Settingsforms.Base.Base;
import com.Settingsforms.Pom.AppFormUi;
import com.Settingsforms.Pom.LogInPage;

@Listeners(com.Settingsforms.Utility.list.class)
public class EndToEnd2 extends Base {
	
	@BeforeTest(alwaysRun = true)

	public void intibase() throws Throwable {
		Base base=new Base();
		base.initialization();
		}

	@Test(priority = 0,  groups= {"sanity"})
	public void log() {
		
	         LogInPage log = new LogInPage(driver);
			log.Logdata(prop.getProperty("em"), prop.getProperty("ps"));	
	}

	@Test(priority = 1,  groups= {"sanity"})
	public void All() throws Throwable {
		AppFormUi af = new AppFormUi(driver);
		af.FormuiField();
		
		    
	}
	

	
	/*
	 * @AfterTest(alwaysRun = true) public void quit() {
	 * 
	 * driver.quit(); }
	 */
	
	
	
	

}
