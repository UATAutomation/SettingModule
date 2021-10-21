package com.settingsassignagent.pom;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.settingsassignagent.base.Base;
import com.settingsassignagent.utility.UtilityFile;

public class AssignAgentLoc extends Base 
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;
	
	public AssignAgentLoc(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath ="//p[text()='Settings']")
	WebElement settings;
	@FindBy(xpath = "//span[text()='Assign Agent']")
	WebElement assignagent;
	@FindBy(xpath = "//*[@aria-label='Marketing Manager']//div[@class='mat-select-value']")
	WebElement marketingmanager;
	@FindBy(xpath = "//mat-icon[text()='add']")
	WebElement additional;
	@FindBy(xpath = "//*[@name='CountryId']//span[text()='Select Country']")
	WebElement country;
	@FindBy(xpath = "//input[@aria-label='dropdown search']")
	WebElement dropdownsearch;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
	WebElement selctcountry;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
	WebElement selctothercountry;
	@FindBy(xpath = "//*[@name='ProvinceId']//span[text()='Select Province']")
	WebElement province;
	@FindBy(xpath = "//input[@aria-label='Search by keyword']")
	WebElement searchkeyword;
	@FindBy(xpath = "//button[text()='Search']")
	WebElement search;
	@FindBy(xpath = "//span[text()='Select All']")
	WebElement selectall;
	@FindBy(xpath = "//*[@id='mat-checkbox-2']/label/div")
	WebElement checkbox;
	@FindBy(xpath = "//button[text()='Close']")
	WebElement close;
	
	public void AssignAgentField() throws Throwable 
	{
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			a = new Actions(driver);
			wait = new WebDriverWait(driver, 40);
			exi = (JavascriptExecutor) driver;
			String cnt="India";
			try 
			{
				
				Thread.sleep(3000); 
				settings.click();
				Thread.sleep(3000); 
				UtilityFile.screenShot(driver);
				assignagent.click();
				Thread.sleep(3000); 
				UtilityFile.screenShot(driver);
				marketingmanager.click();
				Thread.sleep(3000); 
				UtilityFile.screenShot(driver);
				dropdownsearch.sendKeys("Amit");
				Thread.sleep(3000); 
				selctcountry.click();
				Thread.sleep(3000); 
				additional.click();
				Thread.sleep(3000); 
				UtilityFile.screenShot(driver);
				country.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				dropdownsearch.sendKeys(cnt);
				if(cnt.equals("India"))
				{
					selctothercountry.click();
				}
				else
				{
					selctcountry.click();
				}
				Thread.sleep(3000);
				province.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				dropdownsearch.sendKeys("Maharashtra");
				Thread.sleep(3000);
				selctothercountry.click();
				Thread.sleep(3000);
				searchkeyword.sendKeys("Dhiraj");
				Thread.sleep(3000);
				search.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				selectall.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				close.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}			 
	}
	
}