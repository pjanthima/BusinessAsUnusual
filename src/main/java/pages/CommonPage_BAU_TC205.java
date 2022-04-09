package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.BaseClass;
import methods.CommonMethods;
import utilities.BroswerUtilities;

public class CommonPage_BAU_TC205 {

	public CommonPage_BAU_TC205() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(id = "quick-search-input")
	public WebElement searchBox;

	@FindBy(xpath = "//img[@alt='Search']")
	public WebElement magnifyingGlassIcon;

	@FindBy(xpath = "//input[contains(@value,'Add to Cart')]")
	public WebElement addToCartBT;

	@FindBy(xpath = "//button[contains(text(),'Continue Shopping')]")
	public WebElement continueShoppingBT;

	@FindBy(xpath = "//a[contains(text(),'View Cart')]")
	public WebElement viewCartCheckoutBT;

	@FindBy(xpath = "//button[contains(text(),'Remove')]")
	public WebElement removeBT;

	@FindBy(xpath = "//input[@name='calc-ship-zip']")
	public WebElement zipCodeBox;

	@FindBy(id = "cart-estimate-shipping")
	public WebElement estimateShippingBT;

	@FindBy(xpath = "//a[contains(@class,'qa-regular-checkout-btn')]")
	public WebElement checkOutBT;

	@FindBy(xpath = "//input[@name='username']")
	public WebElement usernameFiled;

	@FindBy(id = "password")
	public WebElement passwordFiled;
	
	public void addToCartButton() {	
		List<WebElement> adToCartBT = BaseClass.getDriver()
				.findElements(By.xpath("//input[contains(@value,'Add to Cart')]"));
		if (adToCartBT.size() > 0) {
			CommonMethods.waitForClickability(addToCartBT);
			CommonMethods.jsClick(addToCartBT);
		}		
	}
	
	public void addToCartButton2time() {	
		List<WebElement> adToCartBT = BaseClass.getDriver()
				.findElements(By.xpath("//input[contains(@value,'Add to Cart')]"));
		if (adToCartBT.size() > 0) {
			CommonMethods.waitForClickability(addToCartBT);
			CommonMethods.jsClick(addToCartBT);
			CommonMethods.wait(2);
			CommonMethods.jsClick(addToCartBT);			
		}		
	}
	
	public void reMoveButton() {
		List<WebElement> reMoveBT = BaseClass.getDriver()
				.findElements(By.xpath("//button[contains(text(),'Remove')]"));
		if(reMoveBT.size() > 0) {
			CommonMethods.waitForClickability(removeBT);
			CommonMethods.jsClick(removeBT);		
		}
	}

	public void waitLocatedContinueShoppingBT() {		
		BroswerUtilities.waitForVisibility(continueShoppingBT, 30);
	}
	
	public void waitLocatedViewCartCheckoutBT() {
		BroswerUtilities.waitForVisibility(viewCartCheckoutBT, 20);
	}
}
