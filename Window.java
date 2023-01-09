package LaptopAndNotebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Window {
	
	@FindBy(xpath="//a[text()='Laptops & Notebooks']") private WebElement LaptopNotbook;
	@FindBy(xpath="//a[text()='Windows (0)']") private WebElement window;
	@FindBy(xpath="//a[text()='Continue']") private WebElement continuebtn;
	
	// construtor
	public Window (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// action method
	
	public void ClickLaptopandNotebook() {
		LaptopNotbook.click();
	}
	
	public void Clickwindow(WebDriver driver) throws InterruptedException {
		
		window.click();
		
		Thread.sleep(2000);
		String expText = "Windows";
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
