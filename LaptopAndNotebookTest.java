package LaptopAndNotebookTestPKG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import LaptopAndNotebook.Mac;
import LaptopAndNotebook.Window;
import libraryfile.NinjaBaseClass;

public class LaptopAndNotebookTest extends NinjaBaseClass {
	
	Mac page1;
	Window page2;
	
	@Test
	public void MacmethodCalling() throws InterruptedException {
		test = extent.createTest("Mac test execution is started.");
		test.info("mac test execution is successfully started.");
		
		Mac page1 = new Mac(driver);
		log.info("mac url is opened");
		test.info("url is successfully opened");
		
		page1.ClickLaptopandNotebook();
		log.info("laptopNotebook is clicked");
		test.info("laptopAndNotebook option is successfully clicked");
		
		page1.ClickMac(driver);
		log.info("mac option is clicked");
		test.info("mac option is successfully clicked");
		
		page1.ClickContinue();
		log.info("continue button is clicked");
		test.info("continue is successfully clicked");
		
		test.info("mac test execution is successfully finished.");
		
		extent.flush();
	}
	
	@Test
	public void windowmethodcalling() throws InterruptedException {
		
		test = extent.createTest("Mac test execution is started.");
		test.info("mac test execution is successfully started.");
		
		Window page2 = new Window(driver);
		log.info("mac url is opened");
		test.info("url is successfully opened");
		
		page2.ClickLaptopandNotebook();
		log.info("laptopNotebook is clicked");
		test.info("laptopAndNotebook option is successfully clicked");
		
		page2.Clickwindow(driver);
		log.info("mac option is clicked");
		test.info("mac option is successfully clicked");
		
		page2.ClickContinue();
		log.info("continue button is clicked");
		test.info("continue is successfully clicked");
		
		test.info("mac test execution is successfully finished.");
		
		extent.flush();
	}
	
	
	@AfterClass
	public void Closebrowser() {
		driver.close();
		
	}
	
	
	

}
