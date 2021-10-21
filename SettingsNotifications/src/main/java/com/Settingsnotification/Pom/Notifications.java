package com.Settingsnotification.Pom;

import java.util.List;
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

import com.Settingsnotification.Base.Base;
import com.Settingsnotification.Utility.UtilityFile;



public class Notifications extends Base{
	WebDriver driver;

	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;

	public Notifications(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath ="//*[@class='nav-link']//p[text()='Settings']")
	  WebElement Settings;
	@FindBy(xpath = "//*[@class='nav-link']//span[text()='Notifications']")
	WebElement Notifications;
	@FindBy(xpath = "//*[@placeholder='Region']//span[text()='Region']")
	WebElement region;
	@FindBy(xpath = "//*[@name='regionFilter']//input[@aria-label='dropdown search']")
	WebElement searchregion;
	@FindBy(xpath = "//div[1]/div[1]/div[1]/mat-option[3]/span[1]")
	WebElement searchPartnerclick;
	@FindBy(xpath = "//*[@placeholder='Partner']//span[text()='Partner']")
	WebElement Partner;
	@FindBy(xpath = "//*[@name='partnerFilter']//input[@aria-label='dropdown search']")
	WebElement partnerFilter;
	@FindBy(xpath = "//*[@placeholder='Institution']//span[text()='Institution']")
	WebElement institution;
	@FindBy(xpath = "//*[@name='instFilter']//input[@aria-label='dropdown search']")
	WebElement searchinstitution;
	@FindBy(xpath = "//*[@name='ProgramId']//span[text()='Program']")
	WebElement program;
	@FindBy(xpath = "//*[@name='prgFilter']//input[@aria-label='dropdown search']")
	WebElement searchprogram;
	@FindBy(xpath = "//span[text()='Daily']")
	WebElement Daily;
	@FindBy(xpath = "//*[@name='SendSchedule']//span[text()='Schedule']")
	WebElement Schedule;
	@FindBy(xpath = "//*[@name='NotificationStatus']/label/div")
	WebElement NotificationStatus;
	@FindBy(xpath = "//button[text()='Add']")
	WebElement Add;
	@FindBy(xpath = "//*[@name='SenderId']//span[text()='Sender']")
	WebElement Sender;
	@FindBy(xpath = "//*[@name='senderFilter']//input[@aria-label='dropdown search']")
	WebElement senderFilter;
	@FindBy(xpath = "//input[@name='SubjectLine']")
	WebElement SubjectLine;


	@FindBy(xpath = "(//span[@class='mat-button-wrapper']//mat-icon)[1]")
	WebElement additional;
	@FindBy(xpath = "//dx-data-grid/div/div[4]/div/div/div[3]/div[1]/div/button[2]/span/mat-icon")
	WebElement nexttab;
	@FindBy(xpath = "//div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement searchtab;
	    
	public void NotificatinField() throws Throwable 
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
			exi.executeScript("arguments[0].scrollIntoView();",Notifications );
			Thread.sleep(3000);
			Assert.assertEquals(true, Notifications.isDisplayed());
			System.out.println("Notifications Tab Is Visible");
			
			
			Notifications.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);
			
			 String fexpected="Notifications";
			 String factual=driver.findElement(By.xpath("(//span[text()='Notifications'])[2]")).getText();
			 Assert.assertEquals(factual, fexpected);	
			 System.out.println("Enter In Notifications grid Page");
			
			
			additional.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);

			Partner.click();
			Thread.sleep(3000);
			
			System.out.println("==============");
			System.out.println("Elements present in Partner Field ");

			
			List<WebElement> list = driver.findElements(By.xpath("//span[@class='mat-option-text']"));
			for(WebElement lists : list) 
			{
			System.out.println(lists.getText());
				}
			
			partnerFilter.sendKeys(prop.getProperty("pf"));
			Thread.sleep(3000);
	
			searchPartnerclick.click();
			Thread.sleep(3000);
			
			region.click();
			Thread.sleep(3000);
			searchregion.sendKeys(prop.getProperty("sr"));
			Thread.sleep(3000);
			searchPartnerclick.click();
			Thread.sleep(3000);
			
			
			institution.click();
			Thread.sleep(3000);
			searchinstitution.sendKeys(prop.getProperty("si"));
			Thread.sleep(3000);
			searchPartnerclick.click();
			Thread.sleep(3000);
			
			
	
			Sender.click();
			Thread.sleep(3000);
			System.out.println("==============");
			System.out.println("Elements present in Sender Field ");

			List<WebElement> listi = driver.findElements(By.xpath("//span[@class='mat-option-text']"));
			for(WebElement listsi : listi) 
			{
			System.out.println(listsi.getText());
				}
			
			senderFilter.sendKeys(prop.getProperty("sf"));
			Thread.sleep(3000);
		
			senderFilter.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			exi.executeScript("arguments[0].scrollIntoView();",SubjectLine );
			Thread.sleep(3000);
			SubjectLine.sendKeys(prop.getProperty("sl"));
			Thread.sleep(3000);
			exi.executeScript("arguments[0].scrollIntoView();",Schedule );
			Thread.sleep(3000);
			
			
			
			
			
			Schedule.click();
			Thread.sleep(3000);
			
			System.out.println("==============");
			System.out.println("Elements present in Schedule Field ");
			
			List<WebElement> listis = driver.findElements(By.xpath("//span[@class='mat-option-text']"));
			for(WebElement listsis : listis) 
			{
			System.out.println(listsis.getText());
				}
			Daily.click();
			Thread.sleep(3000);
			NotificationStatus.click();
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			Thread.sleep(3000);
			Add.click();
			Thread.sleep(3000);
			
			
			
			nexttab.click();
			Thread.sleep(3000);
			searchtab.sendKeys("test");
			Thread.sleep(3000);
			UtilityFile.screenShot(driver);
			
			
			
}
}
