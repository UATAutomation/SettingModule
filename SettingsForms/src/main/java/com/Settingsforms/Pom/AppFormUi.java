package com.Settingsforms.Pom;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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

import com.Settingsforms.Base.Base;
import com.Settingsforms.Utility.UtilityFile;



public class AppFormUi extends Base {

	WebDriver driver;

	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;

	public AppFormUi(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath ="//*[@class='nav-link ng-star-inserted']//p[text()='Settings']")
	  WebElement Settings;
	@FindBy(xpath = "//*[@class='nav-link child-menu ng-star-inserted']//span[text()='Forms']")
	WebElement Forms;
	@FindBy(xpath = "//dx-data-grid/div/div[4]/div/div/div[3]/div[1]/div/button[2]/span/mat-icon")
	WebElement nexttab;
	@FindBy(xpath = "//div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement searchtab;

	@FindBy(xpath = "(//span[@class='mat-button-wrapper']//mat-icon)[1]")
	WebElement additional;
	@FindBy(xpath = "//*[@filetype='.jpg,.png,.pdf,.doc,.docx,.xlsx,.xls,.csv,.txt,.zip,.rar']//mat-icon[@title='Upload']")
	WebElement uploader;
	@FindBy(xpath = "//button[contains(text(),'add')]")
	WebElement add;
	@FindBy(xpath = "//span[text()='Institution']")
	WebElement Institution;
	@FindBy(xpath = "//*[@name='InstFilter']//input[@aria-label='dropdown search']")
	WebElement InstFilter;
	@FindBy(xpath = "//input[@name='DocTitle']")
	WebElement DocTitle;
	
	public void FormuiField() throws Throwable 
	{
			driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			exi=(JavascriptExecutor)driver;
			wait=new WebDriverWait(driver,30);
			a = new Actions(driver);
			 String dexpected="Dashboard";
			 String dactual=driver.findElement(By.xpath("//p[text()='Dashboard']")).getText();
			 Assert.assertEquals(dactual, dexpected);	
			 System.out.println("Enter In Dashboard Page");
		
			exi.executeScript("arguments[0].scrollIntoView();",Settings );
			Thread.sleep(3000);
			
			Settings.click();
			Thread.sleep(3000);
			exi.executeScript("arguments[0].scrollIntoView();",Forms );
			Thread.sleep(3000);
			
			Forms.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);
			additional.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);
			add.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);
			Institution.click();
			Thread.sleep(3000);

			InstFilter.sendKeys(prop.getProperty("ins")); 
			Thread.sleep(3000);
			InstFilter.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			DocTitle.sendKeys(prop.getProperty("dt"));
			Thread.sleep(3000);
			exi.executeScript("arguments[0].scrollIntoView();",uploader );
			uploader.click();
			  Thread.sleep(3000); 
			  StringSelection ss=new StringSelection(prop.getProperty("pt"));
			  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
			  Robot rb=new Robot();
			  rb.setAutoDelay(2000);
			  rb.keyPress(KeyEvent.VK_ENTER);
			  rb.keyRelease(KeyEvent.VK_ENTER);
			  rb.keyPress(KeyEvent.VK_CONTROL);
			  rb.keyPress(KeyEvent.VK_V);
			  rb.keyRelease(KeyEvent.VK_V);
			  rb.keyRelease(KeyEvent.VK_CONTROL);
			  rb.keyPress(KeyEvent.VK_ENTER);
			  rb.setAutoDelay(2000);
			  rb.keyRelease(KeyEvent.VK_ENTER);
			  Thread.sleep(3000);
			
			add.click();
			Thread.sleep(3000);
			nexttab.click();
			Thread.sleep(3000);
			searchtab.sendKeys(prop.getProperty("dt"));
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
}
}