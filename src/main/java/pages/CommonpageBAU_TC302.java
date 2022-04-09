package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.BaseClass;
import utilities.BroswerUtilities;

public class CommonpageBAU_TC302 {

	public CommonpageBAU_TC302() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	//	@FindBy(xpath = "//div[@id='promo-new-session']/button")
	//	public WebElement closePopup;

	//Test1	
	@FindBy(id="popup2")
	public WebElement closingPopup;
	
	
	@FindBy(xpath = "//div[@class='main_menu menu_three']//a[contains(text(),'Shop')]")
	public WebElement shop;

	//	3.Select shop and click Shop All. 
	@FindBy(xpath="(//a[@href='shop.php'][normalize-space()='SHOP ALL'])[1]")
	public WebElement shopAll;

	//4.First, click on a picture of the product. 	
	@FindBy(xpath="//a[@id='182']//img")
	public WebElement product;
	
	//5.  Add to cart. 
		@FindBy(xpath="//button[normalize-space()='Add To Cart']")
		public WebElement addCart;
	
//Test2
	
//6.User click on shopping bag cart icon. 
	@FindBy(xpath="//div[starts-with(@class,'mini')]/a/i")
	public WebElement shoppingBag;

	
	
	//Test3
//	 7.click on delete button  
	@FindBy(xpath="//td[@class='product_update']")
	public WebElement deleteButton;
	

	//Test4
//8.Then the cart is updated.
	@FindBy(xpath="//td[@class='product_update']")
	public WebElement updatedButton;
	



}

	



