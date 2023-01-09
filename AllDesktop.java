package SelectAllDesktop;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AllDesktop {
	
	@FindBy(xpath="//a[text()='Desktops']") private WebElement desktop;
	@FindBy(xpath="//a[text()='Show All Desktops']") private WebElement selectalldesktop;
	@FindBy(xpath="//button[@id='list-view']") private WebElement list;
	@FindBy(xpath="//select[@id='input-sort']") private WebElement sortby;
	@FindBy(xpath="//select[@id='input-limit']") private WebElement show;
	@FindBy(xpath="//a[text()='Apple Cinema 30\"']") private WebElement AppleCinema;
	@FindBy(xpath="//input[@name='option[218]']") private WebElement radiobutton;
	@FindBy(xpath="//input[@name='option[223][]']") private WebElement checkbox1;
	@FindBy(xpath="//input[@id='input-option208']") private WebElement test;
	@FindBy(xpath="//select[@id='input-option217']") private WebElement selectcolor;
	@FindBy(xpath="//textarea[@id='input-option209']") private WebElement textarea;
	@FindBy(xpath="//button[@id='button-upload222']") private WebElement fileupload;
	@FindBy(xpath="//input[@id='input-quantity']") private WebElement qty;
	@FindBy(xpath="//button[@id='button-cart']") private WebElement addtocartbutton;
	
	
	
	// constructor 
	
	public AllDesktop(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//action methods
	public void Clickdesktop () {
		desktop.click();
	}
	
	public void Clickselectalldesktop () {
		selectalldesktop.click();
	}
	
	public void Clicklist () {
		list.click();
	}
	
	public void selectsortbyoption () {
		Select sort = new Select(sortby);
		sort.selectByVisibleText("Price (Low > High)");
		
	}
	
	public void selectshowoption () {
		Select shw = new Select(show);
		shw.selectByVisibleText("25");
	}
	
	public void ClickApplecinema () {
		AppleCinema.click();
	}
	
	public void selectradiobutton () {
		radiobutton.click();
	}
	
	public void selectcheckbox () {
		checkbox1.click();
	}
	
	public void InputTest () {
		test.sendKeys("good condition");
	}
	
	public void SelectpcColor () {
		Select color = new Select(selectcolor);
		color.selectByValue("1");
	}
	
	public void Inputtestarea () {
		textarea.sendKeys("OK");
	}
	
	public void Inputfileupload (WebDriver driver) throws AWTException, InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", fileupload);
		
		Robot rb = new Robot();
		rb.delay(2000);
		
		StringSelection ss = new StringSelection("C:\\Users\\SSK\\eclipse-workspace\\uploadfile.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		
	}
	
	
	public void Inputqty () {
		qty.sendKeys("1");
	}

	public void Clickaddtocartbutton () {
		addtocartbutton.click();
	}

}
