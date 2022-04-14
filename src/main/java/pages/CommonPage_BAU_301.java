package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.BaseClass;

public class CommonPage_BAU_301 {

	public CommonPage_BAU_301() {
		PageFactory.initElements(BaseClass.getDriver(), this);

	}

	@FindBy(id = "popup2")
	public WebElement closePopup;

	@FindBy(xpath = "//div[@class='col-lg-6'][2]/div/div[2]/ul/li[1]/a")
	public WebElement facebookIcon;

	@FindBy(xpath = "//div[@class='col-lg-6'][2]/div/div[2]/ul/li[2]/a")
	public WebElement instagramIcon;

	@FindBy(xpath = "//div[@class='col-lg-6'][2]/div/div[2]/ul/li[3]/a")
	public WebElement linkedInIcon;

	@FindBy(xpath = "//div[@class='col-lg-6'][2]/div/div[2]/ul/li[4]/a")
	public WebElement twitterIcon;
	
	@FindBy(xpath = "//a[@aria-label='Facebook']")
	
	
	private WebElement faceBookIcon;

	public boolean verifyFaceBookIcon() {
		return faceBookIcon.isDisplayed();
		
		
		

		
		
		
	}
	
}