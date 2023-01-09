package desktoptestpage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import DesktopModule.DesktopModPC;
import libraryfile.NinjaBaseClass;

public class desktoppcTest extends NinjaBaseClass {
	
	public DesktopModPC pcpage;
	

	
	@Test
	public void pcmethod() throws InterruptedException {
		
		test = extent.createTest("Test for PC is created");
		
	
		pcpage = new DesktopModPC(driver);
		log.info("Url for pc is opened");
		test.info("browser is launched");
		
	
		pcpage.ClickDesktop();
		log.info("desktop button is selected");
		
	
		pcpage.Clickpc();
		log.info("pc option is selected");
		
	
		pcpage.ClickContinuebtn();
		log.info("login button is clicked");
		
		test.info("pc selection is done");
	}
	
	
	
	
	
	@AfterClass
	public void CloseBrowser() {
		driver.close();
		extent.flush();
	}

}
