package com.settingsaetrieveapplication.End;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.settingsaetrieveapplication.Base.Base;
import com.settingsaetrieveapplication.Pom.LogInPage;
import com.settingsaetrieveapplication.Pom.RetrieveApplication;


@Listeners(com.settingsaetrieveapplication.Utility.list.class)

public class EndToEndTest extends Base {

	@BeforeTest(alwaysRun = true)

	public void intibase() throws Throwable {
		Base base = new Base();
		base.initialization();
	}


	@Test(priority = 0, groups = { "smoke" })
	public void login() throws Throwable {

		LogInPage log1 = new LogInPage(driver);
		log1.Logdata(prop.getProperty("email"), prop.getProperty("pass"));

	}

	@Test(priority = 1, groups = { "smoke" })
	public void RetriveAplicationui() throws Throwable {

		RetrieveApplication fw = new RetrieveApplication(driver);
		fw.RetriveApplicatinField();;
	}
}