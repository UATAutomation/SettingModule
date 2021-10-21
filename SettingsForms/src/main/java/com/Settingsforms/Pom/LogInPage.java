package com.Settingsforms.Pom;

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
	public WebElement Username()
	{
		return username;
	}
	public WebElement Password()
	{
		return password;
	}
	public WebElement Login()
	{
		return login;
	}
	public String Logdata(String email,String pass)
	{
		//send the emailid from username field
		username.sendKeys(email);
		//send the password from password field
		password.sendKeys(pass);
		login.click();
		return pass;
	}
	public void Logfield(String em,String ps) throws InterruptedException
	{
		//send the emailid from username field
			username.sendKeys(em);
			//send the password from password field
			password.sendKeys(ps);
			login.click();
			Thread.sleep(5000);
				 
		
	}

	public void Logfieldadmin(String adun,String adps) throws InterruptedException
	{
		//send the emailid from username field
			username.sendKeys(adun);
			//send the password from password field
			password.sendKeys(adps);
			login.click();
			Thread.sleep(5000);
				 
		
	}


}
