package shopWebPage;

import java.util.concurrent.TimeUnit;

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

	@Test(enabled = true)
	public void Test01() {
		cP201.closePopup.click();
		cP201.seacrchBox.sendKeys("iphone case");
		cP201.magnifyingGlass.click();
		scrollDown(500);
		jsClick(cP201.colorBlack);
		jsClick(cP201.iphone6Button);
		
		
	}

	@Test(enabled = true)
	public void Test02() {
		cP201.closePopup.click();
		cP201.seacrchBox.sendKeys("shaker bottle");
		cP201.magnifyingGlass.click();
		scrollDown(1500);
		jsClick(cP201.proSeriesButton);		
  		waitForClickability(cP201.seeMoreButton);
		jsClick(cP201.seeMoreButton);
		TakesScreenshot("Test02.//ScreenShot/screen.png");
		scrollDown(1500);
		cP201.letterP.click();
		cP201.proSeriesButton.click();
		
	}

	@Test(enabled = true)
	public void Test03() {
		cP201.closePopup.click();
		cP201.seacrchBox.sendKeys("desk");
		waitForClickability(cP201.PrepacComputerDesk);
		jsClick(cP201.PrepacComputerDesk);
		TakesScreenshot("Test04.//ScreenShot/screen.png");
		
	}

	@Test(enabled = true)
	public void Test04() {
		cP201.closePopup.click();
		cP201.seacrchBox.sendKeys("beach ball");
		cP201.magnifyingGlass.click();
		waitForClickability(cP201.seeMoreButton_04);
		jsClick(cP201.seeMoreButton_04);
		TakesScreenshot("Test04.//ScreenShot/screen.png");
		jsClick(cP201.disneyButton);
		cP201.addToCartButton.click();
		cP201.viewCart_Checkout.click();
		

	}
}
