package com.settingsnwupdates.Pom;

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

import com.settingsnwupdates.Base.Base;
import com.settingsnwupdates.Utility.UtilityFile;



public class NewsUpdates extends Base {
	WebDriver driver;

	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;

	public NewsUpdates(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath ="//*[@class='nav-link']//p[text()='Settings']")
	  WebElement Settings;
	@FindBy(xpath = "//*[@class='nav-link']//span[text()='News & Updates']")
	WebElement NewsUpdates;
	@FindBy(xpath = "//*[@name='NewsSubject']")
	WebElement NewsSubject;

	@FindBy(xpath = "//*[@name='NewsDescription']//div[@data-placeholder='Description']")
	WebElement Description;

	@FindBy(xpath = "//input[@placeholder='End date']")
	WebElement enddate;
	
	@FindBy(xpath = "//input[@placeholder='Start date']")
	WebElement Startdate;
	@FindBy(xpath = "//button[text()='Add']")
	WebElement Add;
	@FindBy(xpath = "//dx-data-grid/div/div[4]/div/div/div[3]/div[1]/div/button[2]/span/mat-icon")
	WebElement nexttab;
	@FindBy(xpath = "//div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement searchtab;
	    
	@FindBy(xpath = "(//span[@class='mat-button-wrapper']//mat-icon)[1]")
	WebElement additional;
	public void NewsUpdatesField() throws Throwable 
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
			
			exi.executeScript("arguments[0].scrollIntoView();",NewsUpdates );
			Thread.sleep(3000);
			Assert.assertEquals(true, NewsUpdates.isDisplayed());
			System.out.println("NewsUpdates Tab Is Visible");
			
			
			NewsUpdates.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);
			
			 String nexpected="News & Updates";
			 String nactual=driver.findElement(By.xpath("(//span[text()='News & Updates'])[2]")).getText();
			 Assert.assertEquals(nactual, nexpected);	
			 System.out.println("Enter In News & Updates Page");
			
			
			additional.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);

			
			NewsSubject.sendKeys(prop.getProperty("ns"));
			Thread.sleep(3000);
			exi.executeScript("arguments[0].scrollIntoView();",Description );
			Thread.sleep(3000);
			
			
			Description.sendKeys(prop.getProperty("des"));
			Thread.sleep(3000);
			
			
			Startdate.sendKeys(prop.getProperty("sd"));
			Thread.sleep(3000);
		
			
			enddate.sendKeys(prop.getProperty("ed"));
			Thread.sleep(3000);
			
			Add.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);
			nexttab.click();
			Thread.sleep(3000);
			searchtab.sendKeys(prop.getProperty("st"));
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
}
}
