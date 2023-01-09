package DesktopModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopMac {
	
	@FindBy(xpath="//a[text()='Desktops']") private WebElement desktop;
	@FindBy(xpath="//a[text()='Mac (1)']") private WebElement  mac1;
	
	
	
	public DesktopMac(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickDesktop() {
		desktop.click();
	}
	
	public void ClickMac() {
		mac1.click();
	}
	
	
	

}
