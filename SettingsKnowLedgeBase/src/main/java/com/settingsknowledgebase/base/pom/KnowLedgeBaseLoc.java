package com.settingsknowledgebase.base.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.settingsknowledgebase.base.Base;
import com.settingsknowledgebase.base.utility.UtilityFile;

public class KnowLedgeBaseLoc extends Base 
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;
	
	public KnowLedgeBaseLoc(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath ="//p[text()='Settings']")
	WebElement settings;
	@FindBy(xpath = "//span[text()='Knowledge Base']")
	WebElement knowledgebhase;
	@FindBy(xpath = "//mat-icon[text()='add']")
	WebElement additional;
	@FindBy(xpath = "//*[@name='CategoryID']//span[text()='Category']")
	WebElement category;
	@FindBy(xpath = "//input[@aria-label='dropdown search']")
	WebElement dropdownsearch;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
	WebElement selctvalue;
	@FindBy(xpath = "//input[@name='DocumentTitle']")
	WebElement title;
	@FindBy(xpath = "//*[@data-placeholder='Description']")
	WebElement description;
	@FindBy(xpath = "(//mat-icon[text()='add'])[2]")
	WebElement adddoc;
	@FindBy(xpath = "//input[@name='DocumentName']")
	WebElement docnm;
	@FindBy(xpath = "//input[@name='DocumentFile']")
	WebElement choosefile;
	@FindBy(xpath = "//button[text()='Upload']")
	WebElement upload;
	
	@FindBy(xpath = "//button[text()='Add']")
	WebElement add;
	
	
	public void KnowLedgeBaseField() throws Throwable 
	{
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			a = new Actions(driver);
			wait = new WebDriverWait(driver, 40);
			exi = (JavascriptExecutor) driver;
			
			try 
			{
				driver.navigate().refresh();
				Thread.sleep(3000);
				String dexpected="Dashboard";
				String dactual=driver.findElement(By.xpath("//p[text()='Dashboard']")).getText();
				Assert.assertEquals(dactual, dexpected);	
				System.out.println("Enter In Dashboard Page");
				
				settings.click();
				Thread.sleep(3000); 
				UtilityFile.screenShot(driver);
				exi.executeScript("arguments[0].scrollIntoView();",knowledgebhase);
				knowledgebhase.click();
				Thread.sleep(3000); 
				String kexpected="Knowledge Base";
				String kactual=driver.findElement(By.xpath("(//span[text()='Knowledge Base'])[2]")).getText();
				Assert.assertEquals(kactual, kexpected);	
				System.out.println("Enter In Knowledge Base Page");
				
				UtilityFile.screenShot(driver);
				additional.click();
				Thread.sleep(3000); 
				UtilityFile.screenShot(driver);
				category.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				dropdownsearch.sendKeys("Dron");
				Thread.sleep(3000);
				selctvalue.click();
				Thread.sleep(3000);
				title.sendKeys("Doremon");
				Thread.sleep(3000);
				description.sendKeys("hi plz add the doc");
				Thread.sleep(3000);
				exi.executeScript("arguments[0].scrollIntoView();",adddoc);
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				adddoc.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				docnm.sendKeys("Birth Certificate");
				Thread.sleep(3000);
				choosefile.sendKeys("C:\\Users\\funak\\Desktop\\EmptyExcel.xlsx");
				Thread.sleep(3000);
				upload.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				add.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}			 
	}
	
}