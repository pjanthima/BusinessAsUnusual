package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.BaseClass;

public class CommonPage_BAU_TC304 {
	
	public CommonPage_BAU_TC304() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//*[@id=\"popup2\"]/span/span")
	public WebElement closePopup;

	@FindBy(xpath = "//*[@id=\"frm_subscribe\"]/form/input")
	public WebElement popupemail;

	@FindBy(xpath = "/html/body/header/div[3]/div/div/div[2]/div[1]/nav/ul/li[6]/a")
	public WebElement contactUs;

	@FindBy(xpath = "/html/body/div[4]/div/div/div/div/ul/li[1]/a")
	public WebElement homeSign;

	@FindBy(xpath = "/html/body/div[5]/div/div[1]/div/div[1]/div/ul/li[2]")
	public WebElement phoneNumber;

	@FindBy(xpath = "/html/body/div[5]/div/div[1]/div/div[1]/div/ul/li[3]")
	public WebElement email;

	@FindBy(xpath = "/html/body/div[5]/div/div[1]/div/div[2]/div/h3")
	public WebElement needHelp;

	@FindBy(xpath = "/html/body/div[5]/div/div[1]/div/div[2]/div/form/p[1]/input")
	public WebElement name;

	@FindBy(xpath = "/html/body/div[5]/div/div[1]/div/div[2]/div/form/p[2]/input")
	public WebElement customerEmail;

	@FindBy(xpath = "/html/body/div[5]/div/div[1]/div/div[2]/div/form/p[3]/input")
	public WebElement subject;

	@FindBy(xpath = "/html/body/div[5]/div/div[1]/div/div[2]/div/form/div/textarea")
	public WebElement message;

	@FindBy(xpath = "/html/body/div[5]/div/div[1]/div/div[2]/div/form/button")
	public WebElement sendButton;

	@FindBy(xpath = "/html/body/div[5]/div/div[2]")
	public WebElement successful;

	@FindBy(xpath = "/html/body/div[5]/div/div[4]/div/button")
	public WebElement okButton;


	public void tripleActMouse() {

		Actions actions = new Actions(BaseClass.getDriver());
		actions.click(closePopup).build().perform();
		actions.doubleClick(closePopup).build().perform();

	}

}
