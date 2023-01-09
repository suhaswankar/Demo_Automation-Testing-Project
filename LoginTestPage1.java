package NinjaLoginTestPages;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import libraryfile.NinjaBaseClass;
import libraryfile.NinjaUtilityClass;
import loginmodule.loginpage1;

public class LoginTestPage1 extends NinjaBaseClass {
	
	
	loginpage1 page1;
	
	String name;
	
	@Test
	public void loginmethod() throws IOException, InterruptedException {
		
		page1 = new loginpage1(driver);
		log.info("url is opened");
		
		Thread.sleep(1000);
		page1.Inputusername(NinjaUtilityClass.readpropertyfile("id"));
		log.info("username is accepted");
		
		Thread.sleep(1000);
		page1.Inputpassword(NinjaUtilityClass.readpropertyfile("pass"));
		log.info("password is accepted");
		
		Thread.sleep(1000);
		page1.Clickloginbtn();
		log.info("login button clicked");
		
		
		String ExpTile1 = "My Account";
		String Exptile2 = "Account Login";
		String ActTitle = driver.getTitle();
		name = "failedTC1";
		
	
		if(ExpTile1.equals(ActTitle)) {
			Assert.assertTrue(true);
			log.info("titile is matched");
		}
		
		else if (Exptile2.equals(ActTitle)) {
		
			Assert.assertTrue(true);
			log.info("title does not matched");
			NinjaUtilityClass.screenshot(driver, name);
			log.info("screenshot is takes");
			page1.warn(driver);
		}		
	}
	
//	@AfterMethod
//	public void a(ITestResult tr) throws IOException {
//		if(tr.getStatus() == ITestResult.SUCCESS) {
//			
//			NinjaUtilityClass.screenshot(driver, name);
//			log.info("xyz");
//		}	
//	}
//	
	
	@AfterClass
	public void CloseBrowser() {
		driver.close();
	}

}
