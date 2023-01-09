package desktoptestpage;


import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import DesktopModule.DesktopMac;
import DesktopModule.DesktopMacAddToCart;
import libraryfile.NinjaBaseClass;


public class desktopmacTest extends NinjaBaseClass {
	
	DesktopMac macpage1;
	DesktopMacAddToCart macpage2;
	
	
	
	@Test(priority=1) 
	public void desktopmac() throws InterruptedException {
		
		test = extent.createTest("Test one for MacPC is created");
		
		macpage1 = new  DesktopMac(driver);
		macpage2 = new  DesktopMacAddToCart(driver);
		log.info("url for mac is opened");
		test.info("adding mac into cart is started");
		
		
		macpage1.ClickDesktop();
		log.info("desktop option is selected");
		
		
		macpage1.ClickMac();
		log.info("mac option is selected");
		
		
		macpage2.ClickList();
		log.info("list view is selected");
		
	
		macpage2.Selectsortby();
		log.info("sort option is selected");
		
		
		macpage2.Selectshow();
		log.info("show option is selected");
		
	
		macpage2.Clickaddtocart();
		log.info("added to the card successfully");
		
		
		macpage2.ckecksuceesmsg();
		
		test.info("adding mac into cart is finished");
		
		extent.flush();
		
	}
	
	@Test(priority=2)
	public void favorite() throws InterruptedException {
		
		test = extent.createTest("Test two for MacPC is created");
		
		macpage1 = new  DesktopMac(driver);
		macpage2 = new  DesktopMacAddToCart(driver);
		log.info("url for mac is opened");
		test.info("adding mac into favorite is started");
		
		
		macpage1.ClickDesktop();
		log.info("desktop option is selected");
		
		
		macpage1.ClickMac();
		log.info("mac option is selected");
		
		
		macpage2.ClickList();
		log.info("list view is selected");
		
		
		macpage2.Selectsortby();
		log.info("sort option is selected");
		
		
		macpage2.Selectshow();
		log.info("show option is selected");
		
		
		macpage2.Clickfavorite();
		log.info("added to the favorite successfully");
		
		
		macpage2.ckecksuceesmsg();
		
		test.info("adding mac into favorite is finished");
		
		extent.flush();
		
	}
	
	@Test(priority=3)
	public void compare() throws InterruptedException {
		
		
		test = extent.createTest("Test three for MacPC is created");
		
		macpage1 = new  DesktopMac(driver);
		macpage2 = new  DesktopMacAddToCart(driver);
		log.info("url for mac is opened");
		test.info("adding mac into compare is started");
		
		macpage1.ClickDesktop();
		log.info("desktop option is selected");
		
		
		macpage1.ClickMac();
		log.info("mac option is selected");
		
		
		macpage2.ClickList();
		log.info("list view is selected");
		
		
		macpage2.Selectsortby();
		log.info("sort option is selected");
		
	
		macpage2.Selectshow();
		log.info("show option is selected");
		
		
		macpage2.Clickcompare();
		log.info("added to the compare successfully");
		
	
		macpage2.ckecksuceesmsg();
		
		test.info("adding mac into compare is finished");
		
		extent.flush();
		
	}
	

	@AfterClass
	public void CloseBrow() {
		driver.close();
		extent.flush();
	}
	
	

}
