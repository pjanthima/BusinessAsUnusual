package taylormadeskincareWebPage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driver.BaseClass;
import methods.CommonMethods;
import utilities.Constants;

public class BAU_TC305 extends CommonMethods {

	@BeforeMethod
	public void setUp() {
		BaseClass.getDriver().get(BaseClass.getProperty("url2"));
		BaseClass.getDriver().manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		BaseClass.getDriver().manage().window().maximize();
	}

	@Test // (enabled=false)
	public void Test1() throws InterruptedException {

		wait(2);
		Cpb.ClosePopUP.click();
		wait(3);

		Cpb.SubscriptionPackage.click();
		wait(2);
		Cpb.SubscribeNowBtn.click();

		String YourOrderDetail = Cpb.YOurOrderDetail.getText();
		Assert.assertEquals(BaseClass.getProperty("OrderDetail"), YourOrderDetail);
		System.out.println(YourOrderDetail);

		Cpb.inputName.sendKeys(BaseClass.getProperty("Name"));
		wait(1);
		Cpb.inputEmail.sendKeys(BaseClass.getProperty("Email"));
		wait(1);
		Cpb.inputPhone.sendKeys(BaseClass.getProperty("Phone"));
		wait(1);
		Cpb.inputAddress.sendKeys(BaseClass.getProperty("Address"));
		wait(1);
		Cpb.inputCity.sendKeys(BaseClass.getProperty("City"));
		wait(1);
		Cpb.inputState.sendKeys(BaseClass.getProperty("State"));
		wait(1);
		Cpb.inputCountry.sendKeys(BaseClass.getProperty("Country"));
		wait(1);
		Cpb.SubscribeNow.click();

		String SubscribePaymentPage = Cpb.SubscribePayment.getText();
		Assert.assertEquals(BaseClass.getProperty("SubscribePayment"), SubscribePaymentPage);
		System.out.println(SubscribePaymentPage);

	}

	@Test // (enabled=false)
	public void test2() {

		wait(3);

		Cpb.ClosePopUP.click();

		wait(3);

		Cpb.SubscriptionPackage.click();
		wait(2);

		Cpb.SubscribeNowBtn.click();

		String YourOrderDetail = Cpb.YOurOrderDetail.getText();
		Assert.assertEquals(BaseClass.getProperty("OrderDetail"), YourOrderDetail);
		System.out.println(YourOrderDetail);

		Cpb.inputName.sendKeys(BaseClass.getProperty("Name"));
		wait(1);

		Cpb.inputEmail.sendKeys(BaseClass.getProperty("Email"));
		wait(1);

		Cpb.inputPhone.sendKeys(BaseClass.getProperty("Phone"));
		wait(1);

		Cpb.inputAddress.sendKeys(BaseClass.getProperty("Address"));
		wait(1);

		Cpb.inputCity.sendKeys(BaseClass.getProperty("City"));
		wait(1);

		Cpb.inputState.sendKeys(BaseClass.getProperty("State"));
		wait(1);

		Cpb.inputCountry.sendKeys(BaseClass.getProperty("Country"));
		wait(1);

		Cpb.SubscribeNow.click();

		String SubscribePaymentPage = Cpb.SubscribePayment.getText();
		Assert.assertEquals(BaseClass.getProperty("SubscribePayment"), SubscribePaymentPage);
		System.out.println(SubscribePaymentPage);

		scrollDown(400);
		wait(1);

		switchToFrame(0);
		Cpb.PayPalSubscribe.click();
		wait(2);

		Set<String> ids = BaseClass.getDriver().getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentID = it.next();
		String childID = it.next();
		BaseClass.getDriver().switchTo().window(childID);
		System.out.println("After Switching to Child window >> " + BaseClass.getDriver().getTitle());

		String currentUrl = BaseClass.getDriver().getCurrentUrl();
		String nextUrl = BaseClass.getDriver().getCurrentUrl();
		System.out.println(currentUrl);
		System.out.println(nextUrl);
		Assert.assertTrue(currentUrl.equals(nextUrl));

	}

	@Test // (enabled=false)
	public void test3() {

		wait(3);

		Cpb.ClosePopUP.click();
		wait(3);

		Cpb.FacebookIcon.click();
		wait(2);

		Set<String> ids = BaseClass.getDriver().getWindowHandles();

		Iterator<String> it = ids.iterator();
		String parentID = it.next();
		String childID = it.next();
		BaseClass.getDriver().switchTo().window(childID);
		System.out.println("After Switching to Child window >> " + BaseClass.getDriver().getTitle());
		wait(2);

		String currentUrl = BaseClass.getDriver().getCurrentUrl();
		String nextUrl = BaseClass.getDriver().getCurrentUrl();
		System.out.println(currentUrl);
		System.out.println(nextUrl);
		Assert.assertTrue(currentUrl.equals(nextUrl));

		wait(3);

		Cpb.EmailFacebook.sendKeys(BaseClass.getProperty("EmailAddress"));
		wait(3);

		Cpb.passwordFacebook.sendKeys(BaseClass.getProperty("passwordFacebook"));
		wait(3);

		Cpb.LogInFacebook.click();

		String FacebookAccount = Cpb.AccountFacebook.getText();
		Assert.assertEquals(BaseClass.getProperty("myAccount"), FacebookAccount);
		System.out.println(FacebookAccount);
		System.out.println(FacebookAccount);

	}
}
