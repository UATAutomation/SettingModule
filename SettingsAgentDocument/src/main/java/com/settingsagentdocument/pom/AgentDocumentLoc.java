package com.settingsagentdocument.pom;

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

import com.settingsagentdocument.base.Base;
import com.settingsagentdocument.utility.UtilityFile;

public class AgentDocumentLoc extends Base 
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;
	
	public AgentDocumentLoc(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath ="//p[text()='Settings']")
	WebElement settings;
	@FindBy(xpath = "//span[text()='Agent Document']")
	WebElement agentdocument;
	@FindBy(xpath = "//mat-icon[text()='add']")
	WebElement additional;
	@FindBy(xpath = "//*[@name='CountryId']//div[@class='mat-select-value']")
	WebElement country;
	@FindBy(xpath = "//input[@aria-label='dropdown search']")
	WebElement dropdownsearch;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
	WebElement selctcountry;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[4]")
	WebElement selctothercountry;
	@FindBy(xpath = "//*[@name='ProvinceId']//div[@class='mat-select-value']")
	WebElement province;
	@FindBy(xpath = "//*[@name='DocumentTypeId']//div[@class='mat-select-value']")
	WebElement document;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
	WebElement docselct;
	@FindBy(xpath = "//button[text()='Add']")
	WebElement add;
	@FindBy(xpath = "//dx-data-grid/div/div[4]/div/div/div[3]/div[1]/div/button//span//*[text()='filter_list']")
	WebElement nexttab;
	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[4]")
	WebElement searchtab;
	@FindBy(xpath ="(//div//table//tbody)[3]//tr[1]//td[4]//div//button//*[text()='close']")
	WebElement delete;
	@FindBy(xpath ="//button[text()=' Yes']")
	WebElement yes;

	public void AgentDocumentLocField() 
	{
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			a = new Actions(driver);
			wait = new WebDriverWait(driver, 40);
			exi = (JavascriptExecutor) driver;
			String cnt="India";
			try 
			{
				Thread.sleep(3000);
				String dexpected="Dashboard";
				String dactual=driver.findElement(By.xpath("//p[text()='Dashboard']")).getText();
				Assert.assertEquals(dactual, dexpected);	
				System.out.println("Enter In Dashboard Page");
				
				settings.click();
				Thread.sleep(3000); 
				UtilityFile.screenShot(driver);
				exi.executeScript("arguments[0].scrollIntoView();",agentdocument);
				Thread.sleep(2000);
				agentdocument.click();
				Thread.sleep(3000); 
				String kexpected="Agent Document";
				String kactual=driver.findElement(By.xpath("(//span[text()='Agent Document'])[2]")).getText();
				Assert.assertEquals(kactual, kexpected);	
				System.out.println("Enter In Agent Document Page");
		
				UtilityFile.screenShot(driver);
				additional.click();
				Thread.sleep(3000); 
				UtilityFile.screenShot(driver);
				country.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				dropdownsearch.sendKeys("India");
				Thread.sleep(3000);
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
				document.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				dropdownsearch.sendKeys("Pan Card");
				Thread.sleep(3000);
				docselct.click();
				Thread.sleep(3000);
				add.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				nexttab.click();
				Thread.sleep(3000);
				searchtab.sendKeys("Pan Card");
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				delete.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				yes.click();
				Thread.sleep(3000);	
				UtilityFile.screenShot(driver);
				a.moveToElement(searchtab).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
			} 
			catch (Throwable e) 
			{
				e.printStackTrace();
			}			 
	}
	
}