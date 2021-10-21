package com.settingsaetrieveapplication.Pom;

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

import com.settingsaetrieveapplication.Base.Base;
import com.settingsaetrieveapplication.Utility.UtilityFile;




public class RetrieveApplication extends Base{
	WebDriver driver;

	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;

	public RetrieveApplication(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath ="//*[@class='nav-link']//p[text()='Settings']")
	  WebElement Settings;
	@FindBy(xpath = "//*[@class='nav-link']//span[text()='Retrieve Application']")
	WebElement RetrieveApplication;
	@FindBy(xpath = "//*[@class='nav-link']//p[text()='Operation']")
	WebElement Operation;

	@FindBy(xpath = "//*[@class='nav-link']//span[text()='Applications']")
	WebElement Applications;

	@FindBy(xpath = "//div[1]/div[6]/div[2]/table[1]/tbody[1]/tr[1]/td[3]")
	WebElement retrieve;
	
	@FindBy(xpath = "//button[text()=' Yes']")
	WebElement Yes;
	@FindBy(xpath = "//button[text()='Add']")
	WebElement Add;
	@FindBy(xpath = "//dx-data-grid/div/div[4]/div/div/div[3]/div[1]/div/button[2]/span/mat-icon")
	WebElement nexttab;
	@FindBy(xpath = "//div[2]/table/tbody/tr[2]/td[4]/div/div[2]/div/div/div[1]/input")
	WebElement searchtab;
	@FindBy(xpath = "//div[2]/table/tbody/tr[2]/td[3]/div/div[2]/div/div/div[1]/input")
	WebElement searchtab2;
	@FindBy(xpath = "//mat-icon[contains(text(),'filter_list')]")
	WebElement nexttab2;   
	@FindBy(xpath = "(//span[@class='mat-button-wrapper']//mat-icon)[1]")
	WebElement additional;
	public void RetriveApplicatinField() throws Throwable 
	{
			driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			exi=(JavascriptExecutor)driver;
			wait=new WebDriverWait(driver,30);
			a = new Actions(driver);
			
			 String dexpected="Dashboard";
			 String dactual=driver.findElement(By.xpath("//p[text()='Dashboard']")).getText();
			 Assert.assertEquals(dactual, dexpected);	
			 System.out.println("Enter In Dashboard Page");
		
			 Assert.assertEquals(true, Operation.isDisplayed());
			 System.out.println("Operation Tab Is Visible");
			 Operation.click();
			 Thread.sleep(3000);
			 Assert.assertEquals(true, Applications.isDisplayed());
			 System.out.println("Applications Tab Is Visible");	
			 Applications.click();
			 Thread.sleep(3000);
			 
			 String aexpected="Applications";
			 String aactual=driver.findElement(By.xpath("(//span[text()='Applications'])[2]")).getText();
			 Assert.assertEquals(aactual, aexpected);	
			 System.out.println("Enter In Applications Page");
			
			 nexttab.click();
			 Thread.sleep(3000);
			 searchtab.sendKeys(prop.getProperty("id"));
		
			 Thread.sleep(3000);
			 UtilityFile.screenShot(driver);
			 Thread.sleep(3000);
			 driver.navigate().back();
			 exi.executeScript("arguments[0].scrollIntoView();",Settings );
			 Thread.sleep(3000);
			 Assert.assertEquals(true, Settings.isDisplayed());
			 System.out.println("Settings Tab Is Visible");
			
			
			Settings.click();
			Thread.sleep(3000);
			
			exi.executeScript("arguments[0].scrollIntoView();",RetrieveApplication );
			Thread.sleep(3000);
			Assert.assertEquals(true, RetrieveApplication.isDisplayed());
			System.out.println("RetrieveApplication Tab Is Visible");
			
			
			RetrieveApplication.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);
			
			 String rexpected="Retrieve Deleted Application";
			 String ractual=driver.findElement(By.xpath("//span[text()='Retrieve Deleted Application']")).getText();
			 Assert.assertEquals(ractual, rexpected);	
			 System.out.println("Enter In Retrieve Deleted Application Page");
			
			
			 nexttab2.click();
			 Thread.sleep(3000);
			 a.moveToElement(searchtab2).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
			 Thread.sleep(3000);
			 searchtab2.sendKeys(prop.getProperty("id"));
			 Thread.sleep(3000);
			 
			 exi.executeScript("arguments[0].scrollIntoView();",retrieve );
			 Thread.sleep(3000);
			
			 retrieve.click();
			 Thread.sleep(3000);
			 Yes.click();
			 Thread.sleep(3000);
			
			  System.out.println("Application Retrieve Succesfully");
			  System.out.println("        ");
			  
			  exi.executeScript("arguments[0].scrollIntoView();",Applications );
			  Thread.sleep(3000);
				
			  
			  Assert.assertEquals(true, Applications.isDisplayed());
			  System.out.println("Applications Tab Is Visible");	
			  Applications.click();
			  Thread.sleep(3000);
			  nexttab.click();
			  Thread.sleep(3000);
			  searchtab.sendKeys(prop.getProperty("id"));
			
			  Thread.sleep(3000);
			  UtilityFile.screenShot(driver);
			  Thread.sleep(3000);
				
}
}
