package DesktopModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DesktopMacAddToCart 
{
	
	@FindBy(xpath="//button[@id='list-view']") private WebElement list ; 
	@FindBy(xpath="//select[@id='input-sort']") private WebElement sortby;
	@FindBy(xpath="//select[@id='input-limit']") private WebElement show;
	@FindBy(xpath="//span[text()='Add to Cart']") private WebElement addtocart;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") private WebElement succesmsg;
	@FindBy(xpath="//button[@data-original-title='Add to Wish List']") private WebElement favorite;
	@FindBy(xpath="//button[@data-original-title='Compare this Product']") private WebElement compare;
	
	
	public DesktopMacAddToCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickList() {
		list.click();
	}
	
	public void Selectsortby() {
		Select s1 = new Select(sortby);
		s1.selectByVisibleText("Name (Z - A)");
	}
	
	public void Selectshow() {
		Select s2 = new Select(show);
		s2.selectByVisibleText("15");
	}
	
	public void Clickaddtocart() {
		addtocart.click();
	}
	
	public void Clickfavorite() {
		favorite.click();
	}
	
	public void Clickcompare() {
		compare.click();
	}
	
	public void ckecksuceesmsg() 
	{
		if(succesmsg.isDisplayed()) 
		{
			System.out.println("Message displayed successfully");	
		}
		else  
		{
			System.out.println("Device can not add");
		}
	}
}
