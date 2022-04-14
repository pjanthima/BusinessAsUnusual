package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.BaseClass;

public class CommonPage_BAU_TC303 {
	
	public CommonPage_BAU_TC303() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	
	@FindBy(xpath = "//*[@id=\"popup2\"]")
	public WebElement closepopup;

	@FindBy(id = "/html/body/header/div[3]/div/div/div[2]/div[1]/nav/ul/li[3]/a")
	public WebElement shoptab ;
	
	

	@FindBy(xpath ="/html/body/header/div[3]/div/div/div[2]/div[1]/nav/ul/li[3]/ul/li[1]/a")
	public WebElement shopall;

	@FindBy(xpath = "//*[@id=\"182\"]/img")
	public WebElement verifySA ;
	
	

	@FindBy(xpath = "/html/body/header/div[3]/div/div/div[2]/div[1]/nav/ul/li[3]/ul/li[2]/a")
	public WebElement bodyscrubs;
	
	@FindBy(xpath = "//*[@id=\"181\"]/img")
	public WebElement verifyBS;
	
	
	
	@FindBy(xpath = "/html/body/header/div[3]/div/div/div[2]/div[1]/nav/ul/li[3]/ul/li[3]/a")
	public WebElement tools;
	
	@FindBy(xpath = "//*[@id=\"172\"]/img")
	public WebElement verifyT;
	


}
