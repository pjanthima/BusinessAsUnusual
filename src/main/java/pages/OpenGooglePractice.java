package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.BaseClass;

public class OpenGooglePractice {
	public OpenGooglePractice() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(name = "q")
	public WebElement openGoogle;

	@FindBy(name = "btnK")
	private WebElement searchButton;

	public void search1() {
		openGoogle.sendKeys(BaseClass.getProperty("searchSelenium"));
		searchButton.click();
	}
}
