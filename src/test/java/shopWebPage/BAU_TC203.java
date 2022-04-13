package shopWebPage;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driver.BaseClass;
import methods.CommonMethods;
import utilities.Constants;

public class BAU_TC203 extends CommonMethods {

	@BeforeMethod
	public void setUp() {
		BaseClass.getDriver().get(BaseClass.getProperty("url1"));
		BaseClass.getDriver().manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		BaseClass.getDriver().manage().window().maximize();

	}

	@Test(priority = 1)
	public void TestCase1() {
		cP.closePopup.click();

		cP203.searchBox.sendKeys("iphone x");

		cP203.searchBtn.click();

		cP203.searchResult.getText();

		String expResult = "iphone x";
		String actResult = cP203.searchResult.getText();

		Assert.assertEquals(expResult, actResult);

	}

	@Test(priority = 2)
	public void TestCase2() {
		cP.closePopup.click();

		cP203.searchBox.sendKeys("iphone x");

		cP203.searchBtn.click();
		BaseClass.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		cP203.iPhoneX.click();

	}

	@Test(priority = 3)
	public void TestCase3() {
		cP.closePopup.click();

		cP203.searchBox.sendKeys("iphone x");

		cP203.searchBtn.click();

		BaseClass.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cP203.iPhoneX.click();

		BaseClass.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cP203.cellPhones.click();

	}

}
