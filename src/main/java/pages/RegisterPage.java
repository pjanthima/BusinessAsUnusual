package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import driver.BaseClass;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class RegisterPage {
	public RegisterPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

//Please sort your webElement ascending order Thank You!!

	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement firstName;// Tom1

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement lastName;// Tom2

	@FindBy(id = "Skills")
	private WebElement selectSkills;// Kalthera9

	@FindBy(id = "msdd")
	private WebElement selectLanguage;// Keaw8

	@FindBy(xpath = "//a[contains(text(),'English')]")
	private WebElement english;// Keaw8

	@FindBy(xpath = "//a[contains(text(),'French')]")
	private WebElement french;// Keaw8

	@FindBy(id = "country")
	private WebElement selectCountry;// Tom10

	@FindBy(id = "submitbtn")
	private WebElement submitButton;// Tom13

	// Select Year 1968
	@FindBy(id = "yearbox")
	private WebElement selectYearOfBirthElement; // Puthea 11

	// Select Month April
	@FindBy(xpath = "//option[@value='April']")
	private WebElement selectMonthOfBirth; // Puthea 11

	// Select Month April
	@FindBy(xpath = "//option[@value='13']")
	private WebElement selectDateOfBirth; // Puthea 11

	@FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")
	private WebElement PhoneNumber;
	
	@FindBy(xpath = "//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")
	private WebElement selectGender;

	// This is just for practice

	public void fullName() {
		firstName.sendKeys(BaseClass.getProperty("firstName"));
		lastName.sendKeys(BaseClass.getProperty("lastName"));
	}

	public void selectSkills_Kalthera9() {
		Select s = new Select(selectSkills);
		s.selectByValue(BaseClass.getProperty("skills"));
	}
	
	public void selectLanguage_Keaw8() {// Keaw8
		selectLanguage.click();
		english.click();
		french.click();
	}

	public void selectCountry_Tom10() {// Tom
		Select select = new Select(selectCountry);
		select.selectByValue(BaseClass.getProperty("country"));

	}

	@FindBy(id = "checkbox2") // karaket
	private WebElement selectHobbies;

	public void selectHobbies7() {
		selectHobbies.click();
	}

	public void clickSubmitButton13() {// Tom
		submitButton.click();
	}

	public void selectYearOfBirth() {
		selectYearOfBirthElement.click();
	}

	public void selectMonthOfBirth() {
		selectMonthOfBirth.click();
	}

	public void selectDateOfBirth() {
		selectDateOfBirth.click();
	}

	public void inputPhoneNumber() {
		PhoneNumber.sendKeys(BaseClass.getProperty("phoneNumber"));
	}
	
	public void selectGender() { //Danny
		selectGender.click();
	}
}
