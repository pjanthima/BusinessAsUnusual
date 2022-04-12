package pages;



import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import driver.BaseClass;




public class CommonPage_BAU_TC206 {
  
     

	

		public CommonPage_BAU_TC206() {
            PageFactory.initElements(BaseClass.getDriver(), this);
        }
        
       
        @FindBy(xpath= "//*[@id=\"new-header\"]/section/section[2]/div[2]/section/nav/ul/li[7]/a")
    	public WebElement  SelectShopLocalButton;
       
        @FindBy(id = "//input[@id='near']")
        public WebElement clearZipCodeBox;
        
        @FindBy (xpath = "//input[@id='near']")
        public WebElement EnterZiPCode;
        
        @FindBy(xpath= "//*[@id=\"near\"]")
    	public WebElement  SelectZipCode;
        
        
        @FindBy(xpath= "//div[@id='shoplocal-searchbar']/form/div[2]/div/button")
    	public WebElement  SelectSearchButton;
        
     
        
        @FindBy(xpath= "")
    	public WebElement  ClickOnFilterButton;
        
        //(//h2[contains(text(),'357 Offers')])[1]


        @FindBy(xpath= "//*[@id=\"asian\"]")
    	public WebElement  SelectCategoriesOfRestaurant;
        
        @FindBy(xpath= "//*[@id='asian']")
    	public WebElement  ApplyforSearchRestaurant;
       
     
        @FindBy(xpath= "//div[@class='shoplocal-results__header-center']")
		private WebElement  searchResult;
       
   
    
		public String searchResult() {
			
			return searchResult.getText();
		}


}
		
        
      
	


