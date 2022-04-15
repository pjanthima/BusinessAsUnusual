package shopWebPage;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driver.BaseClass;
import methods.CommonMethods;
import utilities.Constants;

public class BAU_TC207 extends CommonMethods {

	@BeforeMethod
	public void setUp() {
		BaseClass.getDriver().get(BaseClass.getProperty("url1"));
		BaseClass.getDriver().manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		BaseClass.getDriver().manage().window().maximize();
		cP.closePopup.click();
	    cP.storeMenuElement.click();
	}

	@AfterMethod
	public void close() {
		tearDown();
	}

    @Test(priority = 1)
    public void Test1_BAU_TC207() {
        
        Assert.assertEquals(case2.allStoreText.getText(), BaseClass.getProperty("allStore"));
        case2.findAStoreBedBathBeyond();
        Assert.assertTrue(case2.bedBathTextElement.isDisplayed());
        case2.clickOnBedBathStore();
        waitForVisibility(case2.bedBathDealInfoText);
        Assert.assertTrue(case2.bedBathDealInfoText.isDisplayed());
        
    }
    
    @Test(priority = 2)
    public void Test2_BAU_TC207() {
     
        case2.findAStoreErrorMsg();
        waitForVisibility(case2.errorMessagElement);
        Assert.assertEquals(case2.errorMessagElement.getText(), BaseClass.getProperty("errorSorryMsg"));    
    }
    
    @Test(priority = 3)
    public void Test3_BAU_TC207() {
        Assert.assertEquals(case2.allStoreText.getText(), BaseClass.getProperty("allStore"));
        case2.findAdidasStore();   
        Assert.assertEquals(case2.adidasStorElement.getText(), BaseClass.getProperty("adidasStore"));      
        case2.clickOnAdidasStore();
        case2.clickHotDealShopNow();
        switchToChildWindow();
        Assert.assertEquals(true, case2.verifyHotDealEmailElement.isDisplayed());
         case2.inputEmail();
        assertEquals(BaseClass.getProperty("adidaspage"), BaseClass.getDriver().getTitle());
        
    }
    
}
