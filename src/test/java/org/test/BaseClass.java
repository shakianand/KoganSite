package org.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	static WebDriver driver;
	
	public static void Launch(String s)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand\\eclipse-workspace2\\SampleMaven\\div\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(s);
		driver.manage().window().maximize();
		
	}
	
	public static void CurUrl()
	{
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	public static void Kuit()
	{
		driver.quit();
	}
	
	public static void Klose()
	{
		driver.close();
		
	}
	
	public static void Screenshot() throws IOException
	{
		Date d = new Date();
		String path = d.toString().replaceAll(":", "_");
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Anand\\eclipse-workspace2\\SampleMaven\\ErrorScrenShot\\"+path+".png");
		FileUtils.copyFile(src, des);
		
	}

}
