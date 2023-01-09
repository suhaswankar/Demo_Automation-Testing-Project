package libraryfile;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class NinjaBaseClass {
	
	public WebDriver driver; 
	public Logger log;
	public ExtentReports extent;
	public ExtentTest test;
	ExtentSparkReporter reporter;
	
	
	@Parameters("browser")
	@BeforeClass
	public void OpenBrowser(String br) throws IOException {
		
		log = Logger.getLogger("Ninja");
		DOMConfigurator.configure("log4j.xml");
		
		
		if(br.equals("chrome")) {
			driver = new ChromeDriver();
			driver.get(NinjaUtilityClass.readpropertyfile("pcurl"));
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
		}
		
		else if(br.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.get(NinjaUtilityClass.readpropertyfile("pcurl"));
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
		}	
	}
	
	
	@BeforeMethod
	public void extendReport() throws IOException {
		
		Random rand = new Random();
		int num = rand.nextInt(111);
		
		// dynamic path the project  
		String path = System.getProperty("user.dir")+"\\tutorialninja\\indexReport"+num+".html";
		
		// report will save to below location
		reporter = new ExtentSparkReporter(path);
		
		// it generate the given text
		reporter.config().setReportName("tutorialNinja E_store");
		reporter.config().setDocumentTitle("Ninja Test Report");
		
		
		// it will create the reports
		extent =  new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Host Name", "localhost");
		extent.setSystemInfo("Operating System", "Window 10");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Test_QA", "suhaswankar");
		
	}
	


			
	
	
}
