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

		
		cPT304.closePopup1.click();
        

		cPT304.contactUs.click();

		Assert.assertEquals(cPT304.phoneNumber.getText(), BaseClass.getProperty("contactus.phoneNumber"));
		Assert.assertEquals(cPT304.email.getText(), BaseClass.getProperty("contactus.email"));
	}

	@Test
	public void Test2() {


		cPT304.closePopup1.click();

		cPT304.contactUs.click();
		Assert.assertEquals(cPT304.needHelp.getText(), BaseClass.getProperty("contactus.needHelp"));

		cPT304.name.sendKeys(BaseClass.getProperty("contactus.name"));
		cPT304.customerEmail.sendKeys(BaseClass.getProperty("contactus.customerEmail"));
		cPT304.subject.sendKeys(BaseClass.getProperty("contactus.subject"));
		cPT304.message.sendKeys(BaseClass.getProperty("contactus.message"));
		cPT304.sendButton.click();
		Assert.assertEquals(cPT304.successful.getText(), BaseClass.getProperty("contactus.successful"));
		cPT304.okButton.click();
	}

	@Test
	public void Test3() {

		cPT304.closePopup1.click();

		cPT304.contactUs.click();
		Assert.assertEquals(cPT304.needHelp.getText(), BaseClass.getProperty("contactus.needHelp"));

		cPT304.name.sendKeys(BaseClass.getProperty("contactus.name"));
		cPT304.customerEmail.sendKeys(BaseClass.getProperty("contactus.invalidEmail"));
		cPT304.subject.sendKeys(BaseClass.getProperty("contactus.subject"));
		cPT304.message.sendKeys(BaseClass.getProperty("contactus.message"));
		cPT304.sendButton.click();
	}

	@Test
	public void Test4() {

		cPT304.closePopup1.click();

		cPT304.contactUs.click();
		
		Assert.assertEquals(cPT304.needHelp.getText(), BaseClass.getProperty("contactus.needHelp"));
        cPT304.name.sendKeys(BaseClass.getProperty("contactus.name"));
		cPT304.customerEmail.sendKeys(BaseClass.getProperty("contactus.customerEmail"));
        cPT304.sendButton.click();

		takeScreenshot(".//BAU_TC304_ScreenShot/screen.png");
		cPT304.okButton.click();
	}

	@Test
	public void Test5() {

		cPT304.closePopup1.click();
		
		cPT304.contactUs.click();
		Assert.assertEquals(cPT304.needHelp.getText(), BaseClass.getProperty("contactus.needHelp"));
        cPT304.sendButton.click();

		takeScreenshot(".//BAU_TC304_ScreenShot/screen.png");
		cPT304.okButton.click();
	}

}
