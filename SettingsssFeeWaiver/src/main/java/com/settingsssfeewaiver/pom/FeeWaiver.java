package com.settingsssfeewaiver.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.settingsssfeewaiver.utility.UtilityFile;


public class FeeWaiver  extends com.settingsssfeewaiver.base.Base {
	WebDriver driver;

	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;

	public FeeWaiver(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath ="//*[@class='nav-link']//p[text()='Settings']")
	  WebElement Settings;
	@FindBy(xpath = "//*[@class='nav-link']//span[text()='Fee Waivers']")
	WebElement FeeWaivers;
	@FindBy(xpath = "//*[@placeholder='Region']//span[text()='Region']")
	WebElement region;
	@FindBy(xpath = "//*[@name='regFilter']//input[@aria-label='dropdown search']")
	WebElement searchregion;
	@FindBy(xpath = "//div[1]/div[1]/div[1]/mat-option[3]/span[1]")
	WebElement searchregionclick;
	@FindBy(xpath = "//*[@placeholder='Agent']//span[text()='Agent']")
	WebElement agent;
	@FindBy(xpath = "//*[@name='agentFilter']//input[@aria-label='dropdown search']")
	WebElement searchagent;
	@FindBy(xpath = "//*[@placeholder='Institution']//span[text()='Institution']")
	WebElement institution;
	@FindBy(xpath = "//*[@name='instFilter']//input[@aria-label='dropdown search']")
	WebElement searchinstitution;
	@FindBy(xpath = "//*[@name='ProgramId']//span[text()='Program']")
	WebElement program;
	@FindBy(xpath = "//*[@name='prgFilter']//input[@aria-label='dropdown search']")
	WebElement searchprogram;
	@FindBy(xpath = "//input[@placeholder='Upto Date']")
	WebElement update;
	@FindBy(xpath = "//input[@placeholder='Applications']")
	WebElement Applications;
	@FindBy(xpath = "//input[@placeholder='Days']")
	WebElement Days;
	@FindBy(xpath = "//button[text()='Add']")
	WebElement Add;
	@FindBy(xpath = "//*[@name='IntakeId']//span[text()='Intake']")
	WebElement intake;
	@FindBy(xpath = "//div[1]/div[1]/mat-option[2]/span[1]")
	WebElement searchintake;

	@FindBy(xpath = "(//span[@class='mat-button-wrapper']//mat-icon)[1]")
	WebElement additional;
	@FindBy(xpath = "//dx-data-grid/div/div[4]/div/div/div[3]/div[1]/div/button[2]/span/mat-icon")
	WebElement nexttab;
	@FindBy(xpath = "//div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement searchtab;
	    
	public void FeWaivrField() throws Throwable 
	{
			driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			exi=(JavascriptExecutor)driver;
			wait=new WebDriverWait(driver,30);
			a = new Actions(driver);
			
			 String dexpected="Dashboard";
			 String dactual=driver.findElement(By.xpath("//p[text()='Dashboard']")).getText();
			 Assert.assertEquals(dactual, dexpected);	
			 System.out.println("Enter In Dashboard Page");
		
			
			
			
			Assert.assertEquals(true, Settings.isDisplayed());
			System.out.println("Settings Tab Is Visible");
			exi.executeScript("arguments[0].scrollIntoView();",Settings );
			Thread.sleep(3000);
			
			Settings.click();
			Thread.sleep(3000);
			Assert.assertEquals(true, FeeWaivers.isDisplayed());
			System.out.println("FeeWaivers Tab Is Visible");
			exi.executeScript("arguments[0].scrollIntoView();",FeeWaivers );
			Thread.sleep(3000);
			
			FeeWaivers.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);
			
			 String fexpected="Fee Waivers";
			 String factual=driver.findElement(By.xpath("(//span[text()='Fee Waivers'])[2]")).getText();
			 Assert.assertEquals(factual, fexpected);	
			 System.out.println("Enter In FeeWaivers Page");
			
			
			additional.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);

			region.click();
			Thread.sleep(3000);
            searchregion.sendKeys(prop.getProperty("rg"));
			Thread.sleep(3000);
			searchregionclick.click();
			Thread.sleep(3000);
			
			agent.click();
			Thread.sleep(3000);
			searchagent.sendKeys(prop.getProperty("sa"));  
			Thread.sleep(3000);
			searchregionclick.click();
			Thread.sleep(3000);
			
			
			institution.click();
			Thread.sleep(3000);
			searchinstitution.sendKeys(prop.getProperty("si"));
			Thread.sleep(3000);
			searchregionclick.click();
			Thread.sleep(3000);
			
			
			program.click();
			Thread.sleep(3000);
			searchprogram.sendKeys(prop.getProperty("sp"));
			Thread.sleep(3000);
			searchregionclick.click();
			Thread.sleep(3000);
			
			intake.click();
			Thread.sleep(3000);
			searchintake.click();
			Thread.sleep(3000);
			update.sendKeys(prop.getProperty("up"));
			Thread.sleep(3000);
			Add.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);
			nexttab.click();
			Thread.sleep(3000);
			searchtab.sendKeys(prop.getProperty("rg"));
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			
			
			
}
}
