package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.BaseClass;

public class CommonPage_BAU_202 {

	public CommonPage_BAU_202() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//div[@id='promo-new-session']/button")
	public WebElement closePopup;
	
	@FindBy(xpath = "//*[@id=\"new-header\"]/section/section[2]/div[2]/div/div[1]/nav/ul[1]/li[6]/a")
	public WebElement CreateAccount;

	@FindBy(xpath = "//*[@id=\"loginHeaderSignin\"]")
	public WebElement Signin;
	
	@FindBy(xpath = "//*[@id=\"new-header\"]/section/section[2]/div[2]/div/div[1]/nav/ul[1]/li[1]/a")
	public WebElement SigninInAccount;
	
	@FindBy(xpath = "//*[@id=\"shop_login_form\"]/label[1]/input")
	public WebElement Email;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	public WebElement Password;
	
	@FindBy(xpath = "//*[@id=\"submit-button\"]")
	public WebElement SigninButton;
	
	@FindBy(xpath = "//*[@id=\"create-account\"]/form/div[1]/label[1]/input")
	public WebElement FirstName;
	
	@FindBy(xpath = "//*[@id=\"create-account\"]/form/div[1]/label[2]/input")
	public WebElement LastName;
	
	@FindBy(xpath = "//*[@id=\"form-email\"]")
	public WebElement EmailAddress;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	public WebElement setPassword;

	@FindBy(xpath = "//*[@id=\"passwordConfirm\"]")
	public WebElement Confirmpassword;;

	@FindBy(xpath = "//*[@id=\"submit-button\"]")
	public WebElement submitButton;
	
	
}
