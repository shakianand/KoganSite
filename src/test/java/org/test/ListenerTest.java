package org.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test case started is : " + result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("The passed test case is : " + result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("The failed test case is : " + result.getName());
		
		Date d = new Date();
		String path = d.toString().replaceAll(":", "_");
		TakesScreenshot tk = (TakesScreenshot) Execution.driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Anand\\eclipse-workspace2\\SampleMaven\\ErrorScrenShot\\"+path+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Execution.driver.quit();
		}

		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("The skipped test case is : " + result.getName());

		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test case on failure but with success percentage");

		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("-----Test Starts------------");

		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("------Test Completed--------");

		
	}

}
