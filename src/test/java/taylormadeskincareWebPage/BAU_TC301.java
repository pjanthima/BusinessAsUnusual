package taylormadeskincareWebPage;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driver.BaseClass;
import methods.CommonMethods;
import utilities.Constants;

public class BAU_TC301 extends CommonMethods {

	@BeforeMethod
	@BeforeTest
	public void setUp() {
		BaseClass.getDriver().get(BaseClass.getProperty("url2"));
		BaseClass.getDriver().manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		BaseClass.getDriver().manage().window().maximize();

	}

	@Test(enabled = true)
	public void facebookPageOpen() {

		click(cP301.closePopup);
		jsClick(cP301.facebookIcon);
		switchToChildWindow();
		Assert.assertTrue(cP301.verifyFaceBookIcon());

	}

	@Test(enabled = true)
	public void instagramPageOpen() {

		click(cP301.closePopup);
		jsClick(cP301.instagramIcon);
		switchToChildWindow();
		wait(5);

	}

	@Test(enabled = true)
	public void linkedInPageOpen() {

		click(cP301.closePopup);
		jsClick(cP301.linkedInIcon);
		switchToChildWindow();

	}

	@Test(enabled = true)
	public void twitterPageOpen() {

		click(cP301.closePopup);
		jsClick(cP301.twitterIcon);
		switchToChildWindow();
	}

}
