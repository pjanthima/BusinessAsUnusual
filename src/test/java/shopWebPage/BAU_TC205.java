package shopWebPage;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driver.BaseClass;
import methods.CommonMethods;
import utilities.Constants;

public class BAU_TC205 extends CommonMethods {

	@BeforeMethod
	public void setUp() {
		BaseClass.getDriver().get(BaseClass.getProperty("url1"));
		BaseClass.getDriver().manage().window().maximize();
		BaseClass.getDriver().manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
	}

	@Test(priority = 1)
	public void BAU_TC205_TestCase2() {

		cP.closePopup.click();

//		1. Navigate to URL
//		2. Input "Gloves" in the Search Box in All Departments then press search by click 
//		on magnifying glass icon
		wait(3);
		cPTC205.searchBox.sendKeys(BaseClass.getProperty("item"));
		jsClick(cPTC205.magnifyingGlassIcon);

//		3. Click "Add to Cart" for the first item you're looking for ( 1 Quantity)
		scrollDown(400);
		cPTC205.addToCartButton();

//		4. Click "Continue Shopping
		cPTC205.waitLocatedContinueShoppingBT();
		jsClick(cPTC205.continueShoppingBT);

//		5. Click "Add to Cart" for the Second item you're looking for ( 1 Quantity)
		cPTC205.addToCartButton();

//		6. Click on "View Cart / Checkout"
		cPTC205.waitLocatedViewCartCheckoutBT();
		jsClick(cPTC205.viewCartCheckoutBT);

//		7. in "Order Total" section put your zip code and click on "Estimate Shipping" to see how much it costs for shipping
		wait(3);
		cPTC205.zipCodeBox.sendKeys(BaseClass.getProperty("zipcode"));
		jsClick(cPTC205.estimateShippingBT);

//		8. Click "Proceed to Checkout
		wait(3);
		jsClick(cPTC205.checkOutBT);

//		9. Fill up username and password then Click Sign in
		wait(1);
		cPTC205.usernameFiled.sendKeys(BaseClass.getProperty("username"));
		cPTC205.passwordFiled.sendKeys(BaseClass.getProperty("password"));

//		10. Select Shipping Address
//		11. Click Check out
		// Issues with CAPTCHA
		TakesScreenshot("BAU_TC205_TestCase2.//ScreenShot/screen.png");
	}

	@Test(priority = 2)
	public void BUA_TC205_TestCase3() {

		cP.closePopup.click();

//		1. Navigate to URL 
//		2. Input "Gloves" in the Search Box in All Departments then press search by click 
//		on magnifying glass icon
		wait(3);
		cPTC205.searchBox.sendKeys(BaseClass.getProperty("item"));
		jsClick(cPTC205.magnifyingGlassIcon);

//		3. Click "Add to Cart" for the first item you're looking for ( 2 Quantity)
		scrollDown(400);
		wait(3);
		cPTC205.addToCartButton2time();

//		4. Click "Continue Shopping
		cPTC205.waitLocatedContinueShoppingBT();
		jsClick(cPTC205.continueShoppingBT);

//		5. Click "Add to Cart" for the Second item you're looking for ( 1 Quantity)
		cPTC205.addToCartButton();

//		6. Click on "View Cart / Checkout"		
		cPTC205.waitLocatedViewCartCheckoutBT();
		jsClick(cPTC205.viewCartCheckoutBT);

//		7. Remove the first items by click on "Remove"
		wait(3);
		cPTC205.reMoveButton();

//		8. in "Order Total" section put your zip code and click on "Estimate Shipping" to see how much it costs for shipping
		wait(3);
		cPTC205.zipCodeBox.sendKeys(BaseClass.getProperty("zipcode"));
		jsClick(cPTC205.estimateShippingBT);

//		9. Click "Proceed to Checkout"
		wait(3);
		jsClick(cPTC205.checkOutBT);

//		10. Fill up username and password then Click Sign in
		wait(1);
		cPTC205.usernameFiled.sendKeys(BaseClass.getProperty("username"));
		cPTC205.passwordFiled.sendKeys(BaseClass.getProperty("password"));

//		11. Select Shipping Address
//		12. Click Continue Check out
//		13. Click Continue Check out again
		// Issues with CAPTCHA
		TakesScreenshot("BAU_TC205_TestCase3.//ScreenShot/screen.png");
	}

	@AfterMethod
	public void close() {
		tearDown();
	}

}
