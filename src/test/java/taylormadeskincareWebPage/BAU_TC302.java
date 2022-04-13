package taylormadeskincareWebPage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import driver.BaseClass;
import methods.CommonMethods;
import utilities.BroswerUtilities;
import utilities.Constants;

public class BAU_TC302 extends CommonMethods {

	
	
	@BeforeMethod
	public void setUp() {
		BaseClass.getDriver().get(BaseClass.getProperty("url2"));
		BaseClass.getDriver().manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		BaseClass.getDriver().manage().window().maximize();

	}

	@Test(priority = 1)
	public void BAU_TC302_TestCase1() {
		// 1.User go to URL
		// 2.close on shop tap
		wait(2);
		cPG.closingPopup.click();

		wait(5);
		BroswerUtilities.hover(cPG.shop);
//		cPG.shop.click();

//      3.Select shop and click Shop All.
		wait(5);
		BroswerUtilities.hover(cPG.shopAll);
		cPG.shopAll.click();

//      4.First, click on a picture of the product.
		BroswerUtilities.hover(cPG.product);
		cPG.product.click();
		wait(5);

//      5.  Add to cart.  
		BroswerUtilities.hover(cPG.addCart);
		cPG.addCart.click();
		wait(5);

	}

	@Test(priority = 2)
	public void BAU_TC302_TestCase2() {

		// 1.User go to URL
		// 2.close on shop tap
		wait(2);
		cPG.closingPopup.click();

		wait(5);
		BroswerUtilities.hover(cPG.shop);
//		cPG.shop.click();

//      3.Select shop and click Shop All.
		wait(5);
		BroswerUtilities.hover(cPG.shopAll);
		cPG.shopAll.click();

//      4.First, click on a picture of the product.
		wait(5);
		BroswerUtilities.hover(cPG.product);
		cPG.product.click();

//      5.Add to cart.
		wait(5);
		BroswerUtilities.hover(cPG.addCart);
		cPG.addCart.click();

//     6.User click on shopping bag cart icon. 
		wait(5);
		BroswerUtilities.waitForVisibility(cPG.shoppingBag, 15);
		cPG.shoppingBag.click();
	}

	@Test
	public void BAU_TC302_TestCase3() {

		// 1.User go to URL
		// 2.close on shop tap
		wait(2);
		cPG.closingPopup.click();

		wait(5);
		BroswerUtilities.hover(cPG.shop);
//		cPG.shop.click();

//      3.Select shop and click Shop All.
		wait(5);
		BroswerUtilities.hover(cPG.shopAll);
		cPG.shopAll.click();

//      4.First, click on a picture of the product.
		wait(5);
		BroswerUtilities.hover(cPG.product);
		cPG.product.click();

//      5.Add to cart.
		wait(5);
		BroswerUtilities.hover(cPG.addCart);
		cPG.addCart.click();

//     6.User click on shopping bag cart icon. 
		wait(5);
		BroswerUtilities.waitForVisibility(cPG.shoppingBag, 15);
		cPG.shoppingBag.click();

//      7.click on delete button
		wait(5);
		BroswerUtilities.hover(cPG.deleteButton);
		cPG.deleteButton.click();

	}

	@Test
	public void BAU_TC302_TestCase4() {
//      1.User go to URL 
//      2.close  on shop tap
		wait(2);
		cPG.closingPopup.click();

		wait(5);
		BroswerUtilities.hover(cPG.shop);
//		cPG.shop.click();

//      3.Select shop and click Shop All.
		wait(5);
		BroswerUtilities.hover(cPG.shopAll);
		cPG.shopAll.click();

//4.    First, click on a picture of the product.
		wait(5);
		BroswerUtilities.hover(cPG.product);
		cPG.product.click();

//5.    Add to cart.
		wait(5);
		BroswerUtilities.hover(cPG.addCart);
		cPG.addCart.click();

//6.    User click on shopping bag cart icon. 
		wait(5);
		BroswerUtilities.waitForVisibility(cPG.shoppingBag, 15);
		cPG.shoppingBag.click();

//7.    click on delete button
		wait(5);
		BroswerUtilities.hover(cPG.deleteButton);
		cPG.deleteButton.click();

//8.   click on update button
		wait(5);
		BroswerUtilities.hover(cPG.updatedButton);
		cPG.updatedButton.click();

	}

}
