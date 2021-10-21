package com.settingsssfeewaiver.pom;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage  
{
	WebDriver driver;
	
	public LogInPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@name='UserName']")
	WebElement username;
	@FindBy(xpath = "//input[@name='Password']")
	WebElement password;
	@FindBy(xpath = "//input[@value='Login']")
	WebElement login;
	@FindBy(xpath = "//a[@data-toggle='collapse'] [@routerlink='/member/institutions']")
	WebElement instutation;
	
	public String Logdata(String email,String pass)
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//send the emailid from username field
		username.sendKeys(email);
		//send the password from password field
		password.sendKeys(pass);
		login.click();
		return pass;
	}
	public void Logfield(String em,String ps) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//send the emailid from username field
			username.sendKeys(em);
			//send the password from password field
			password.sendKeys(ps);
			login.click();
			Thread.sleep(5000);	
	}
	

	

}
