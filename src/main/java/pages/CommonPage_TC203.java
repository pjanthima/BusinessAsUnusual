package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.BaseClass;

public class CommonPage_TC203 {
	
	public CommonPage_TC203() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	//TestCase1
	
	//Closes popup
	@FindBy(xpath = "//div[@id='promo-new-session']/button")
	public WebElement closePopup;
	
	//Search Box
	@FindBy(xpath = "//*[@id=\"quick-search-input\"]")
	public WebElement searchBox;
	
	//Search Button
	@FindBy(xpath = "//*[@id=\"search-form\"]/div/button[2]/img")
	public WebElement searchBtn;
	
	//Search Result
	@FindBy(xpath = "//*[@id=\"page\"]/section/section/div[3]/div[1]/h1")
	public WebElement searchResult;
	
	//Compatibility --> iPhone X (left hand side)
	@FindBy(xpath = "//span[normalize-space()='Cell Phones']")
	public WebElement iPhoneX;
	
	//Compatibility --> Cell phones (left hand side)
	@FindBy(xpath = "//span[normalize-space()='Cell Phones']")
	public WebElement cellPhones;
}
