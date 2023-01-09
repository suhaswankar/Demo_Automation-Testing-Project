package LaptopAndNotebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Mac {
	
	@FindBy(xpath="//a[text()='Laptops & Notebooks']") private WebElement LaptopNotbook;
	@FindBy(xpath="//a[text()='Macs (0)']") private WebElement mac;
	//@FindBy(xpath="") private WebElement verifyPage;
	@FindBy(xpath="//a[text()='Continue']") private WebElement continuebtn;
	
	// construtor
	public Mac(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// action method
	
	public void ClickLaptopandNotebook() {
		LaptopNotbook.click();
	}
	
	public void ClickMac(WebDriver driver) throws InterruptedException {
		mac.click();
		
		Thread.sleep(2000);
		String expText = "Macs";
		String ActText = driver.getTitle();
		
			if(expText.equals(ActText)) {
				Assert.assertTrue(true);
				System.out.println("Title is matched");
			}
			else {
				Assert.assertTrue(false);
				System.out.println("Tilr ius not matched");
			}
					
	}
	
	public void ClickContinue() {
		continuebtn.click();
	}
	
	
	
	

}
