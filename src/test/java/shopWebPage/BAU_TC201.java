package shopWebPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driver.BaseClass;
import methods.CommonMethods;
import utilities.Constants;

public class BAU_TC201 extends CommonMethods {
	@BeforeMethod
	public void setUp() {
		BaseClass.getDriver().get(BaseClass.getProperty("url1"));
		BaseClass.getDriver().manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		BaseClass.getDriver().manage().window().maximize();
	}

	@Test
	public void Test() throws InterruptedException {
		cP.closePopup.click();

	}

}
