package libraryfile;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class listener implements ITestListener {
	
	public WebDriver driver;
	
	
	public void onTestStart(ITestResult result) {
		
		System.out.println("test execution is started");
	
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is passed");
		
	}
	
	public void onTestFailure(ITestResult result) {
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\SSK\\eclipse-workspace\\tutorialnin ja\\screenshot");
		try 
		{
			FileHandler.copy(scr, dest);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("test is skipped");
	
	}
	
	
	public void onFinish(ITestContext context) {
		System.out.println("test is finished");
		
	}
		

}
