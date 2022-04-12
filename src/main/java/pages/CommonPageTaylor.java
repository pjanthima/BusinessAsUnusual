package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.BaseClass;

public class CommonPageTaylor {
	public CommonPageTaylor() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//*[@id=\"popup2\"]/span/span")
	public WebElement closePopup;
	
	@FindBy(xpath = "//*[@id=\"frm_subscribe\"]/form/input")
	public WebElement email;
	
	

}
