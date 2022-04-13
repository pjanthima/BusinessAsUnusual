package shopWebPage;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driver.BaseClass;
import methods.CommonMethods;
import utilities.Constants;

public class BAU_TC202 extends CommonMethods {

	@BeforeMethod
	public void setUp() {
		BaseClass.getDriver().get(BaseClass.getProperty("url1"));
		BaseClass.getDriver().manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		BaseClass.getDriver().manage().window().maximize();

	}

	@Test
	public void Test() {
		cP.closePopup.click();
		cp.Signin.click();
		cp.CreateAccount.click();
		cp.FirstName.sendKeys("Bonnie");
		cp.LastName.sendKeys("Bennett");
		cp.EmailAddress.sendKeys("b53913999@gmail.com");
		cp.setPassword.sendKeys("ApplesAreRed12");
		cp.Confirmpassword.sendKeys("ApplesAreRed12");
		cp.submitButton.click();
	}
	
	@AfterMethod
	public void close() {
		tearDown();
	}
}
