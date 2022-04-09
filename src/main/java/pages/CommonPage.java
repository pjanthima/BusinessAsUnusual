package pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.BaseClass;
import methods.CommonMethods;

public class CommonPage {
	public CommonPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//div[@id='promo-new-session']/button")
<<<<<<< HEAD

	public WebElement closePopup;// Tom

	@FindBy(xpath = "//a[@href='/stores-a-z?hsh=2']") // puthea-Store Menu
	public WebElement storeMenuElement;
=======
	public WebElement closePopup;
	
	
	 @FindBy(xpath = "//a[@href='/stores-a-z?hsh=2']") //puthea-Store Menu
     public WebElement storeMenuElement;
>>>>>>> main

	
}

	


