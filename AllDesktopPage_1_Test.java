package AllDesktopTest;

import java.awt.AWTException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import SelectAllDesktop.AllDesktop;
import libraryfile.NinjaBaseClass;

public class AllDesktopPage_1_Test extends NinjaBaseClass {
	
	AllDesktop page1;
	
	@Test
	public void AllDesktopmMethdCalling() throws AWTException, InterruptedException {
		
		test = extent.createTest("AllDesktop test execution is started");
		test.info("AllDesktop test execution is started");
		
		AllDesktop page1 = new AllDesktop(driver);
		log.info("Browser is open for allDesktopSelection");
		
		page1.Clickdesktop();
		log.info("Desktop button is clicked");
		
		page1.Clickselectalldesktop();
		log.info("All Desktop is selected");
		
		page1.Clicklist();
		log.info("list view is selected");
		
		page1.selectsortbyoption();
		log.info("sort by option is selected");
		
		page1.selectshowoption();
		log.info("show option is selected");
		
		page1.ClickApplecinema();
		log.info("Apple pc is selected");
		
		page1.selectradiobutton();
		log.info("radio button is selected");
		
		page1.selectcheckbox();
		log.info("check box is selected");
		
		page1.InputTest();
		log.info("text is entered");
		
		page1.SelectpcColor();
		log.info("desktop color is selected");
		
		page1.Inputtestarea();
		log.info("user tex is entered");
		
		Thread.sleep(3000);
		page1.Inputfileupload(driver);
		log.info("file is uploaded");
		test.info("file succesfully loaded");
		
		page1.Inputqty();
		log.info("desktop quantity is entered");
		
		page1.Clickaddtocartbutton();
		log.info("login button is clicked");
		
		test.info("test successfully executed");
		
		
		
	}
	
	@AfterClass
	public void closebrowser() {
		driver.close();
		extent.flush();
	}
	

}
