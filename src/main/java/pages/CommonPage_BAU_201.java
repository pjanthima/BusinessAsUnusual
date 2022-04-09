package pages;

import static driver.BaseClass.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.BaseClass;

public class CommonPage_BAU_201 {
	
	public CommonPage_BAU_201() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	//Test case 01
	@FindBy(xpath = "//div[@id='promo-new-session']/button")
	public WebElement closePopup;

	@FindBy(id = "quick-search-input")
	public WebElement seacrchBox;
	
	@FindBy(xpath ="//*[@id=\"search-form\"]/div/button[2]/img")
	public WebElement magnifyingGlass;
	
	@FindBy(xpath = "//ul[@class='qa-search-filter-list js-second-level second-level '][4]/li[1]/a/span")
	public WebElement colorBlack;

	@FindBy(xpath = "//ul[@class='qa-search-filter-list js-second-level second-level ']/li/a/span")
	public WebElement iphone6Button;
	
	//Test case 02
	@FindBy(xpath = "//ul[@class='qa-search-filter-list js-second-level second-level '][3]/li[11]")
	public WebElement seeMoreButton;
	
	@FindBy(xpath = "//*[@id=\"alphabet\"]/li[16]/a")
	public WebElement letterP;
	
	@FindBy(xpath = "//ul[@class='qa-search-filter-list js-second-level second-level '][2]/li[5]")
	public WebElement proSeriesButton;
	
	//Test Case 03
	@FindBy(xpath = "@FindBy(xpath = \"//ul[@class='qa-search-filter-list js-second-level second-level '][9]/li[4]\")\r\n"
			+ "	public WebElement proSeriesButton;")
	public WebElement PrepacComputerDesk;
	
	
	//Test case 04 
	@FindBy(xpath = "//*[@id=\"right-panel-menu-jPanel\"]/div/ul[10]/li[11]/a")
	public WebElement seeMoreButton_04;
	
	@FindBy(xpath = "//ul[@class='qa-search-filter-list js-second-level second-level '][6]/li[3]")
	public WebElement disneyButton;
	
	@FindBy(xpath = "//*[@id=\"page\"]/section/section/section/section/section[2]/section[1]/ul/li[1]/section[2]/input")
	public WebElement addToCartButton;
	
	@FindBy(xpath = "//*[@id=\"new-header\"]/section/section[2]/div[2]/div/div[3]/section/section/section[3]/section[2]/div/a")
	public WebElement viewCart_Checkout;
	
}
