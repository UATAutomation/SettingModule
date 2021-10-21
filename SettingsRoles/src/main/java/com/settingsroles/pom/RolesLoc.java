package com.settingsroles.pom;

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

import com.settingsroles.base.Base;
import com.settingsroles.utility.UtilityFile;

public class RolesLoc extends Base 
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;
	
	public RolesLoc(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath ="//p[text()='Settings']")
	WebElement settings;
	@FindBy(xpath = "//span[text()='Roles']")
	WebElement roles;
	@FindBy(xpath = "//mat-icon[text()='add']")
	WebElement additional;
	@FindBy(xpath = "//input[@name='RoleName']")
	WebElement rolename;
	@FindBy(xpath = "//button[text()='Add']")
	WebElement add;
	
	@FindBy(xpath = "//dx-data-grid/div/div[4]/div/div/div[3]/div[1]/div/button//span//*[text()='filter_list']")
	WebElement nexttab;
	@FindBy(xpath = "(//input[@class='dx-texteditor-input'])[1]")
	WebElement searchtab;
	@FindBy(xpath ="(//div/table/tbody)[2]/tr/td[4]/div//button/span/*[text()='keyboard_arrow_down']")
	WebElement actiontab;
	@FindBy(xpath ="//button[text()=' Permission ']")
	WebElement permissiontab;
	@FindBy(xpath ="//button[text()=' Delete ']")
	WebElement delete;
	@FindBy(xpath ="//button[text()=' Yes']")
	WebElement yes;
	
	
	public void RolesLocField() throws Throwable 
	{
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			a = new Actions(driver);
			wait = new WebDriverWait(driver, 40);
			exi = (JavascriptExecutor) driver;
			
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
				exi.executeScript("arguments[0].scrollIntoView();",roles);
				Thread.sleep(2000);
				roles.click();
				Thread.sleep(3000); 
				String kexpected="Roles";
				String kactual=driver.findElement(By.xpath("(//span[text()='Roles'])[2]")).getText();
				Assert.assertEquals(kactual, kexpected);	
				System.out.println("Enter In Roles Page");
				
				UtilityFile.screenShot(driver);
				additional.click();
				Thread.sleep(3000); 
				UtilityFile.screenShot(driver);
				rolename.sendKeys("MSM");
				Thread.sleep(3000);
				add.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				nexttab.click();
				Thread.sleep(3000);
				searchtab.sendKeys("MSM");
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				actiontab.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				permissiontab.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				driver.navigate().back();
				Thread.sleep(3000);
				nexttab.click();
				Thread.sleep(3000);
				searchtab.sendKeys("MSM");
				Thread.sleep(3000);
				actiontab.click();
				Thread.sleep(3000);
				delete.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				yes.click();
				Thread.sleep(3000);
				UtilityFile.screenShot(driver);
				a.moveToElement(searchtab).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
				
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}			 
	}
	
}