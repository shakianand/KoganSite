package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Execution extends BaseClass {
	
	
	//launching the site
	@Parameters({"url"})
	@Test
	public void test1(String s1) throws InterruptedException
	{
	
		//launching the website
		Launch(s1);
		Thread.sleep(4000);
		
		
	}
	
	
	@Test
	public void test2() throws InterruptedException
	{
		Thread.sleep(1000);
		//Accessing the television link and navigating
		WebElement tv = driver.findElement(By.xpath("(//a[@class='department-menu__link _6lGWx'])[2]"));
		Thread.sleep(1000);

	}
	
	//selecting the item and adding to cart
	@Test
	public void test3() throws InterruptedException
	{
		Thread.sleep(6000);
		//WebElement tvfirstln = driver.findElement(By.xpath("(//a[@href='/au/buy/kogan-55-smart-hdr-4k-led-tv-android-tv-series-9-xu9210/'])[2]"));
		//tvfirstln.click();

		WebElement tvfirstln = driver.findElement(By.xpath("(//a[@href='/au/buy/kogan-50-smart-hdr-4k-uhd-led-tv-android-tv-series-9-xu9220/'])[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", tvfirstln);
		
		
		Thread.sleep(4000);
		WebElement addtocart = driver.findElement(By.xpath("(//span[@class='buttonText'])[2]"));
		addtocart.click();
		//checking out the item
		Thread.sleep(4000);
		WebElement checkout = driver.findElement(By.xpath("(//span[@class='buttonText'])[1]"));
		checkout.click();
		Thread.sleep(2000);
		WebElement cart2 = driver.findElement(By.xpath("(//button[@class='_3t33I _1v6X8 _1x8rE fullWidth notouch'])[2]"));
		cart2.click();
		//continue
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[3]"));
		email.sendKeys("sakila.m@gmail.com");
        WebElement continuebtn = driver.findElement(By.xpath("(//span[@class='buttonText'])[3]"));
        continuebtn.click();
		
        /*
		//login
        Thread.sleep(2000);
		WebElement loginbtn = driver.findElement(By.xpath("(//span[@class='buttonText'])[3]"));
	    loginbtn.click();
	    */
		
	}
	
	@Test
	public void test4() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement temp1 = driver.findElement(By.xpath("(//div[@class='TXV0A'])[2]"));
		System.out.println("ORDER SUMMARY : ");
		System.out.println("Item Name : ");
		System.out.println(temp1.getText());
		
	    WebElement temp2 = driver.findElement(By.xpath("(//div[@class='_2JH46'])[4]"));
		System.out.println("Item Price : " + temp2.getText());
		
		
		WebElement temp3 = driver.findElement(By.xpath("//div[@class='_2JH46 _2ooZ1']"));
		System.out.println("GST : " + temp3.getText());

	}
	
	//for failed test case example
	//launching the site
		@Parameters({"url"})
		@Test
		public void test5(String s1) throws InterruptedException
		{
		
			//launching the website and making camera link as false by default
			Launch(s1);
			Thread.sleep(4000);
			WebElement camera = driver.findElement(By.xpath("(//a[@class='department-menu__link _6lGWx'])[5]"));
			camera.click();
			Thread.sleep(4000);
			WebElement camlnk = driver.findElement(By.xpath("(//a[@href='/au/buy/kogan-smarterhome-motion-object-tracking-pan-tilt-smart-camera/'])[2]"));
			camlnk.click();
			
		}
		
		
	
	
	
	
	
	/*
	//login functionality
	
	@Parameters({"username","password"})
	@Test
	public void test12(String s1,String s2) throws InterruptedException
	{
		Thread.sleep(6000);
	
		WebElement login = driver.findElement(By.xpath("//div[@class='main-menu__user__action']"));
		login.click();
		driver.findElement(By.id("home_page_view")).click();
		WebElement email = driver.findElement(By.xpath("//input[@id='input-loginbox-email']"));
		email.sendKeys(s1);
		WebElement pass = driver.findElement(By.xpath("//input[@id='input-loginbox-password']"));
		pass.sendKeys(s2);
		driver.findElement(By.xpath("//button[@data-method='Password']")).click();
		Thread.sleep(6000);
		WebElement camera = driver.findElement(By.xpath("(//a[@class='department-menu__link _6lGWx'])[5]"));
		camera.click();
	}

*/

	

}
