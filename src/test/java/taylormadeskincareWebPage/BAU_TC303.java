package taylormadeskincareWebPage;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driver.BaseClass;
import methods.CommonMethods;
import utilities.BroswerUtilities;
import utilities.Constants;

public class BAU_TC303 extends CommonMethods {

	@BeforeMethod
	public void setUp() {
		BaseClass.getDriver().get(BaseClass.getProperty("url2"));
		BaseClass.getDriver().manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		BaseClass.getDriver().manage().window().maximize();
		
	}

  @Test(priority = 1)				
		public void Test1_BAU_TC303() {
	       
	//1.Open browser and enter URL
	//2.User click "X" on the pop up    
	    wait(5); 
	    cP303.closepopup.click();
	//3.Point your cursor to "SHOP" tap   
		wait(5);  
	    BroswerUtilities.hover(cP303.shoptab);
	    cP303.shoptab.click();		    
	//4.Click on "SHOP ALL" button  
		BroswerUtilities.hover(cP303.shopall);
		cP303.shopall.click();
		wait(5);
	//5.Verify an item in "SHOP ALL"	
		cP303.verifySA.click();
		wait(5);
		
		String expectResult = "cP303.verifySA"; 

        String actResult= cP303.shopall.getText();

        Assert.assertEquals(expectResult, actResult);				
	}	
		
  @Test(priority = 2)
	public void Test2_BAU_TC303() {
				
	//1.Open browser and enter URL
   // 2.User click "X" on the pop up    
	    wait(2);
	    cP303.closepopup.click();
	//3.Point your cursor to "SHOP" tap   
	    wait(5);
	    BroswerUtilities.hover(cP303.shoptab);
	    cP303.shoptab.click();		
	//4.Click on "BODY SCRUBS" button
		BroswerUtilities.hover(cP303.bodyscrubs);
		cP303.bodyscrubs.click();
		wait(5);
	//5.Verify an item in "BODY SCRUBS"				
		cP303.verifyBS.click();
		wait(5);
		
	   String expectResult = "cP303.verifyBS";

       String actResult= cP303.bodyscrubs.getText();

       Assert.assertEquals(expectResult, actResult);					
	}
		
	@Test(priority = 3)
	public void Test3_BAU_TC303() {
		
	//1.Open browser and enter URL
	//2.User click "X" on the pop up		
	    wait(2);
        cP303.closepopup.click();
	//3.Point your cursor to "SHOP" tap  
        wait(5);
	    BroswerUtilities.hover(cP303.shoptab);
	    cP303.shoptab.click();		
	//4.Click on "TOOLS" button
		BroswerUtilities.hover(cP303.tools);
		cP303.tools.click();
		wait(5);
	//5.Verify an item in "TOOLS"
		cP303.verifyT.click();
		wait(5);
		
	    String expectResult = "cP303.verifyT";

        String actResult= cP303.tools.getText();

        Assert.assertEquals(expectResult, actResult); 	        
	}

		
		


	
  

}
