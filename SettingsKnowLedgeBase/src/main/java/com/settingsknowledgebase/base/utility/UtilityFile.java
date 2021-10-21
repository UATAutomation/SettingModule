package com.settingsknowledgebase.base.utility;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class UtilityFile
{
	static ArrayList<String> tab;
	public static void screenShot(WebDriver driver) 
	{
		DateFormat dateFormate=new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		Date date =new Date();
		String d=dateFormate.format(date);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:\\Users\\funak\\AutomationTester\\SettingsKnowLedgeBase\\ScreenShots\\"+d+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void NewTab(WebDriver driver)
	{
		try {
			tab = new ArrayList<>();
			Thread.sleep(3000);
			Robot b = new Robot();
			b.keyPress(KeyEvent.VK_CONTROL);
			//b.keyPress(KeyEvent.VK_SHIFT);
			b.keyPress(KeyEvent.VK_N);
			b.keyRelease(KeyEvent.VK_CONTROL);
			//b.keyRelease(KeyEvent.VK_SHIFT);
			b.keyRelease(KeyEvent.VK_N);
			Thread.sleep(3000);
			tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(1));
			driver.get("https://www.mailinator.com/");
		} catch (Throwable e) {
			System.out.println(e.getMessage());
			tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(1));
			driver.get("https://www.mailinator.com/");
		}
	}
	public static void Tab0(WebDriver driver)
	{
		try {
		tab = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(0));
		} catch (Exception e) {
			tab = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(tab.get(0));	
		}
	}
	public static void Tab1(WebDriver driver)
	{
		try {	
		tab = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
		} catch (Exception e) {
			tab = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
		}
	}
	public static ExtentReports getExtentInitialiser()
	{
		String path=System.getProperty("user.dir")+("\\reports\\")+"reports.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("E2E-reports");
		reporter.config().setDocumentTitle("Test Results");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester","Mark");
		
		return extent;
		
		
		
		
	}

}
