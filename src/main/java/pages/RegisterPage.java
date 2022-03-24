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
	@FindBy(id = "country")
	private WebElement selectCountry;// Tom10

	@FindBy(id = "submitbtn")
	private WebElement submitButton;// Tom13

	@FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")
	private WebElement PhoneNumber;
	
	
	//input[@placeholder='First Name']
	
	// (Jandery)1 - fill up first name : "James"
	
	@FindBy(xpath= "//input[@placeholder='First Name']")
	private WebElement firstname;
	
	public void FirstName_Jan(){ 
		firstname.sendKeys(BaseClass.getProperty("firstname"));
		
	}

	
	// This is just for practice
	public void selectCountry_Tom10() {//Tom
		Select select = new Select(selectCountry);
		select.selectByValue(BaseClass.getProperty("country"));
	}

	public void clickSubmitButton13() {//Tom
		submitButton.click();
	}
	
	public void inputPhoneNumber() {
		PhoneNumber.sendKeys(BaseClass.getProperty("phoneNumber"));
	}
}
