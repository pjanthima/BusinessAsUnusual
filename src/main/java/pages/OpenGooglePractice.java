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
	public WebElement googleSearch;

	@FindBy(name = "btnK")
	private WebElement searchButton;

	// This is just for practice
	public void search1() {
		googleSearch.sendKeys(BaseClass.getProperty("searchSelenium"));
		searchButton.click();
	}
}
