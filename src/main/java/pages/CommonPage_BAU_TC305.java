package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.BaseClass;

public class CommonPage_BAU_TC305 {
	public CommonPage_BAU_TC305() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//*[@id='popup2']/span")
	public WebElement ClosePopUP;
	
	@FindBy(xpath="//div[@class='main_menu menu_three']/nav/ul/li[5]/a")
	public WebElement SubscriptionPackage;
	
	@FindBy(xpath="/html/body/div[5]/div/div/div[1]/div/div[2]/a")
	public WebElement SubscribeNowBtn;
	
	@FindBy(xpath="//div[@class='customer_login']/div/div/div/h3")
	public WebElement YOurOrderDetail;
	
	@FindBy(xpath="//div[@class='col-md-12 col-lg-12']/p/input")
	public WebElement inputName;
	
	@FindBy(xpath="/html/body/div[5]/div/div/div[2]/div/form/div[1]/div[2]/p/input")
	public WebElement inputEmail;
	
	@FindBy(xpath="/html/body/div[5]/div/div/div[2]/div/form/div[1]/div[3]/p/input")
	public WebElement inputPhone;
	
	@FindBy(xpath="/html/body/div[5]/div/div/div[2]/div/form/div[2]/div[1]/p/input")
	public WebElement inputAddress;
	
	@FindBy(xpath="/html/body/div[5]/div/div/div[2]/div/form/div[2]/div[2]/p/input")
	public WebElement inputCity;
	
	@FindBy(xpath="/html/body/div[5]/div/div/div[2]/div/form/div[2]/div[3]/p/input")
	public WebElement inputState;
	
	@FindBy(xpath="/html/body/div[5]/div/div/div[2]/div/form/div[2]/div[4]/p/input")
	public WebElement inputCountry;
	
	@FindBy(xpath="/html/body/div[5]/div/div/div[2]/div/form/div[3]/button")
	public WebElement SubscribeNow;
	
	@FindBy(xpath="//div[@class='breadcrumb_content']/ul/li[2]/a")
	public WebElement SubscribePayment;
	

	@FindBy(xpath="//div[@id='buttons-container']/div/div[1]")
	public WebElement PayPalSubscribe;
	
	
	@FindBy(xpath="//h1[@id='headerText']")
	public WebElement PayPalPayment;
	
	@FindBy(xpath="//div[@class='header_social']/ul/li/a/i")
	public WebElement FacebookIcon;
	
	@FindBy(xpath="//*[@id='facebook']")
	public WebElement VerifyFacebookHome;
	
	@FindBy(xpath="//*[@id=\"login_form\"]/div[2]/div[1]/label/input")
	public WebElement EmailFacebook;
	
	@FindBy(xpath="//*[@id=\"login_form\"]/div[2]/div[2]/label/input")
	public WebElement passwordFacebook;
	
	@FindBy(xpath="//*[@id=\"login_form\"]/div[2]/div[3]/div/div/div[1]/div/span/span")
	public WebElement LogInFacebook;
	
	@FindBy(xpath="//div[@class='bi6gxh9e aov4n071']/h2/span/span")
	public WebElement AccountFacebook;
	
	
}
