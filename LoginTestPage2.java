package NinjaLoginTestPages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import libraryfile.NinjaBaseClass;
import libraryfile.NinjaExcelData;
import libraryfile.NinjaUtilityClass;
import loginmodule.loginpage1;

public class LoginTestPage2 extends NinjaBaseClass {
	
	
	loginpage1 page1;
	String name;
	int p;
	
	@Test(dataProvider = "suhas")
	public void loginmethod(String UID, String PWS) throws IOException, InterruptedException {
		
		page1 = new loginpage1(driver);
		log.info("url is opened");
		
	
		page1.Inputusername(UID);
		log.info("username is accepted");
		
		
		page1.Inputpassword(PWS);
		log.info("password is accepted");
		

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
			NinjaUtilityClass.screenshot(driver, name+ p++);
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
	
	@DataProvider(name = "suhas")
	public String [][] getalldata() throws EncryptedDocumentException, IOException{
		
		String Filepath = "C:\\Users\\SSK\\eclipse-workspace\\tutorialninja\\ExcelFile\\ninjadatafile.xlsx";
		NinjaExcelData demo = new NinjaExcelData(Filepath);
		
		int rowcount = demo.getRowCount("sheet1");
		int colcount = demo.getCellCount("Sheet1", 1);
		
		String suhasData [][] = new String[rowcount][colcount];
		
		for(int i=1; i<rowcount; i++) {
			
			for(int j=0; j<colcount; j++) {
				suhasData[i-1][j] = demo.getData("Sheet1", i, j);
			}
		}
		
		return suhasData;		
	}
	
	
	@AfterClass
	public void CloseBrowser() {
		driver.close();
	}


}
