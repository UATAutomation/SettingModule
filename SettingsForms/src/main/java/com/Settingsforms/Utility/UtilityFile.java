package com.Settingsforms.Utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityFile
{
	public static void screenShot(WebDriver driver) 
	{
		DateFormat dateFormate=new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		Date date =new Date();
		String d=dateFormate.format(date);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:\\Users\\BASHA\\eclipse-workspace1\\SettingsForms\\Screenshort\\"+d+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
