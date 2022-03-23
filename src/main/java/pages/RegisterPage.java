package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import driver.BaseClass;

public class RegisterPage {
	public RegisterPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

//Please sort your webElement ascending order Thank You!!
	
	@FindBy(id = "Skills")
	private WebElement selectSkills;//Kalthera9
	
	@FindBy(id = "country")
	private WebElement selectCountry;// Tom10

	@FindBy(id = "submitbtn")
	private WebElement submitButton;// Tom13

	// This is just for practice
	public void selectSkills_Kalthera9() {
		
		Select s = new Select(selectSkills);
		s.selectByValue(BaseClass.getProperty("skills"));
	}
	
	public void selectCountry_Tom10() {//Tom
		Select select = new Select(selectCountry);
		select.selectByValue(BaseClass.getProperty("country"));
	}

	public void clickSubmitButton13() {//Tom
		submitButton.click();
	}
}
