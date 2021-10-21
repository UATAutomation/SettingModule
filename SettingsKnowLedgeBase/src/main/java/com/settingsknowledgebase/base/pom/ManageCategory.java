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
import com.settingsknowledgebase.base.utility.UtilityFile;

public class ManageCategory 
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;
	
	public ManageCategory(WebDriver driver) 
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
	@FindBy(xpath = "//a[text()='Manage Category']")
	WebElement managecategory;
	@FindBy(xpath = "(//mat-icon[text()='add'])[3]")
	WebElement addcate;
	@FindBy(xpath = "//input[@name='CategoryName']")
	WebElement categoryname;
	@FindBy(xpath = "//*[@name='ParentCategoryId']//span[text()='Parent Category']")
	WebElement parentcategory;
	@FindBy(xpath = "//input[@aria-label='dropdown search']")
	WebElement dropdownsearch;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
	WebElement selctvalue;
	@FindBy(xpath = "//button[text()=' Add ']")
	WebElement add;
	@FindBy(xpath = "(//button[text()='Close'])[2]")
	WebElement close;
	
	public void ManageCategoryField() throws Throwable 
	{
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			a = new Actions(driver);
			wait = new WebDriverWait(driver, 40);
			exi = (JavascriptExecutor) driver;
			
			try 
			{
				String dexpected="Dashboard";
				String dactual=driver.findElement(By.xpath("//p[text()='Dashboard']")).getText();
				Assert.assertEquals(dactual, dexpected);	
				System.out.println("Enter In Dashboard Page");
				
				Thread.sleep(3000); 
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
				managecategory.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				addcate.click();
				Thread.sleep(3000);
				categoryname.sendKeys("Dron");
				Thread.sleep(3000);
				parentcategory.click();
				Thread.sleep(3000);
				dropdownsearch.sendKeys("Laptop");
				Thread.sleep(3000);
				selctvalue.click();
				Thread.sleep(3000);
				add.click();
				Thread.sleep(3000);
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
