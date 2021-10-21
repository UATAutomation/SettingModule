package com.settingsnwupdates.End;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.settingsnwupdates.Base.Base;
import com.settingsnwupdates.Pom.LogInPage;
import com.settingsnwupdates.Pom.NewsUpdates;


@Listeners(com.settingsnwupdates.Utility.list.class)

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
	public void NewUpdatsui() throws Throwable {

		NewsUpdates fw = new NewsUpdates(driver);
		fw.NewsUpdatesField();
	}
}