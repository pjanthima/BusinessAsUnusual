package taylormadeskincareWebPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driver.BaseClass;
import methods.CommonMethods;
import utilities.Constants;

public class BAU_TC304 extends CommonMethods {

	@BeforeMethod
	public void setUp() {
		BaseClass.getDriver().get(BaseClass.getProperty("url2"));
		BaseClass.getDriver().manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		BaseClass.getDriver().manage().window().maximize();
	}

	@Test
	public void Test1() {

		cPT.email.sendKeys("hello");
		Actions actions = new Actions(BaseClass.getDriver());
		actions.click(cPT.closePopup).build().perform();
		actions.doubleClick(cPT.closePopup).build().perform();

		cU.contactUs.click();
		Assert.assertEquals(cU.homeSign.getText(), "HOME");
		Assert.assertEquals(cU.phoneNumber.getText(), "985 326 1880");
		Assert.assertEquals(cU.email.getText(), "taylormadeskincare.us@gmail.com");
	}

	@Test
	public void Test2() {

		cPT.email.sendKeys("hello");
		Actions actions = new Actions(BaseClass.getDriver());
		actions.click(cPT.closePopup).build().perform();
		actions.doubleClick(cPT.closePopup).build().perform();

		cU.contactUs.click();
		Assert.assertEquals(cU.needHelp.getText(), "Need Help");

		cU.name.sendKeys(BaseClass.getProperty("contactus.name"));
		cU.customerEmail.sendKeys(BaseClass.getProperty("contactus.customerEmail"));
		cU.subject.sendKeys(BaseClass.getProperty("contactus.subject"));
		cU.message.sendKeys(BaseClass.getProperty("contactus.message"));
		cU.sendButton.click();
		Assert.assertEquals(cU.successful.getText(), "Congratulations!");
		cU.okButton.click();
	}

	@Test
	public void Test3() {

		cPT.email.sendKeys("hello");
		Actions actions = new Actions(BaseClass.getDriver());
		actions.click(cPT.closePopup).build().perform();
		actions.doubleClick(cPT.closePopup).build().perform();

		cU.contactUs.click();
		Assert.assertEquals(cU.needHelp.getText(), "Need Help");

		cU.name.sendKeys(BaseClass.getProperty("contactus.name"));
		cU.customerEmail.sendKeys(BaseClass.getProperty("contactus.invalidEmail"));
		cU.subject.sendKeys(BaseClass.getProperty("contactus.subject"));
		cU.message.sendKeys(BaseClass.getProperty("contactus.message"));
		cU.sendButton.click();
	}

	@Test
	public void Test4() {

		cPT.email.sendKeys("hello");
		Actions actions = new Actions(BaseClass.getDriver());
		actions.click(cPT.closePopup).build().perform();
		actions.doubleClick(cPT.closePopup).build().perform();

		cU.contactUs.click();
		Assert.assertEquals(cU.needHelp.getText(), "Need Help");

		cU.name.sendKeys(BaseClass.getProperty("contactus.name"));
		cU.customerEmail.sendKeys(BaseClass.getProperty("contactus.customerEmail"));

		cU.sendButton.click();

		takeScreenshot(".//BAU_TC304_ScreenShot/screen.png");
		cU.okButton.click();
	}

	@Test
	public void Test5() {

		cPT.email.sendKeys("hello");
		Actions actions = new Actions(BaseClass.getDriver());
		actions.click(cPT.closePopup).build().perform();
		actions.doubleClick(cPT.closePopup).build().perform();

		cU.contactUs.click();
		Assert.assertEquals(cU.needHelp.getText(), "Need Help");

		cU.sendButton.click();

		takeScreenshot(".//BAU_TC304_ScreenShot/screen.png");
		cU.okButton.click();
	}

}
