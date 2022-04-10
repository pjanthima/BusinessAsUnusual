package shopWebPage;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driver.BaseClass;
import methods.CommonMethods;
import utilities.Constants;



	

public class BAU_TC206 extends CommonMethods {
	
	@BeforeMethod
	public void setUp() {
		
//		1.Open the browser 
//		2. enter the URL
		BaseClass.getDriver().get(BaseClass.getProperty("url1"));
		BaseClass.getDriver().manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		BaseClass.getDriver().manage().window().maximize();
	}

	
	@Test(priority = 1)
    public void Test1_BAU_TC206() {
			
        cP.closePopup.click();
       // scrollDown(300); 
	  
	        //3. Click on the Shop local Button
	        case1.SelectShopLocalButton.click();
	        //4 Select the ZipCode
	        scrollDown(300);
	        wait(3);
	        case1.EnterZiPCode.click();
	        case1.EnterZiPCode.clear();
	        case1.EnterZiPCode.sendKeys("22118");    
	        case1.SelectSearchButton.click();   
	        scrollDown(100);
	        wait(5);    
	        String expextedLabel = "357 Offers within 25 miles of 22118";
	        Assert.assertEquals(case1.searchResult(),expextedLabel);
	        wait(3);
	        TakesScreenshot("Test1.//ScreenShot/screen.png");
			scrollDown(1500);
	         
	        
	}   
	


	
	@Test(priority = 2)
    public void Test2_BAU_TC206() {
			wait (2);
        cP.closePopup.click();
        scrollDown(300); 
	        wait (2);
	        //3. Click on the Shop local Button
	        case1.SelectShopLocalButton.click();
	        //4 Select the ZipCode
	        case1.EnterZiPCode.click();
	        //5. Now select the search button on the zipCode
	        case1.EnterZiPCode.clear();
	        case1.EnterZiPCode.sendKeys("22118");    
	        case1.SelectSearchButton.click();   
	        //6. click on Filter button
	        scrollDown(300); 
	        case1.ClickOnFilterButton.click();
	        //7. User can see categories and  click on Asian 
	        case1.SelectCategoriesOfRestaurant.click();
 	        //8. user click in the Apply button
	        case1.ApplyforSearchRestaurant.click();
	       // 9. user will be able to see list of restaurants.
	       
	        
	        
     
	
	}
	        
}






 