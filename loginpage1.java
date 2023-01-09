package loginmodule;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v105.log.Log;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import libraryfile.NinjaBaseClass;
import libraryfile.NinjaUtilityClass;

public class loginpage1 {
	
	@FindBy(xpath="//input[@id='input-email']") public  WebElement username;
	@FindBy(xpath="//input[@id='input-password']") private WebElement password;
	@FindBy(xpath="//input[@class='btn btn-primary']") private WebElement loginbtn;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']") private WebElement warningmsg;
	
	public loginpage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void Inputusername(String ID) {
		username.clear();
		username.sendKeys(ID);
	}
	

	public void Inputpassword(String pas) {
		password.clear();
		password.sendKeys(pas);
	}
	

	public void Clickloginbtn() {
		loginbtn.click();
	}
	
	public void warn(WebDriver driver) throws IOException {
		if(warningmsg.isDisplayed()) {

			System.out.println("warning msg is displayed");
		}
		else 
		{
			
			System.out.println("hame page opend");
		}
	}
	
	
}
