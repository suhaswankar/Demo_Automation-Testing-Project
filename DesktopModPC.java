package DesktopModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopModPC {
	

	@FindBy(xpath="//a[text()='Desktops']") private WebElement desktop;
	@FindBy(xpath="//a[text()='PC (0)']") private WebElement pc;
	@FindBy(xpath="//a[text()='Continue']") private WebElement continuebtn;
	
	
	public DesktopModPC(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickDesktop() {
		desktop.click();
	}
	
	public void Clickpc() {
		pc.click();
	}
	
	public void ClickContinuebtn() {
		continuebtn.click();
	}


}
