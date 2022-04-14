package shopWebPage;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driver.BaseClass;
import methods.CommonMethods;
import utilities.Constants;

public class BAU_TC207 extends CommonMethods{
    
	@BeforeMethod
    public void setUp() {
        BaseClass.getDriver().get(BaseClass.getProperty("url1"));
        BaseClass.getDriver().manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
        BaseClass.getDriver().manage().window().maximize();
    }

    @Test(priority = 1)
    public void Test1_BAU_TC207() {
        cP.closePopup.click();
        cP.storeMenuElement.click();
        Assert.assertEquals(case2.allStoreText.getText(), BaseClass.getProperty("allStore"));
        case2.verifyStorePage();
        case2.findAStore();
        case2.clickOnBedBath();
        Assert.assertEquals(case2.bedBathDealInfoText.getText(), "Deals and Information");
        
    }
    
    @Test(priority = 2)
    public void Test2_BAU_TC207() {
        cP.closePopup.click();
        cP.storeMenuElement.click();
        Assert.assertEquals(case2.allStoreText.getText(), BaseClass.getProperty("allStore"));
        case2.findAStoreErrorMsg();
        
        
    }
    
    @Test(priority = 3)
    public void Test3_BAU_TC207() {
        cP.closePopup.click();
        cP.storeMenuElement.click();
        Assert.assertEquals(case2.allStoreText.getText(), BaseClass.getProperty("allStore"));
        case2.findAdidasStore();
        Assert.assertEquals(case2.adidasStorElement.getText(), "Adidas");      
        case2.clickOnAdidasStore();
        wait(3);
        case2.clickHotDealShopNow();
        wait(3);
      
        switchToChildWindow();
        Assert.assertEquals(true, case2.verifyHotDealEmailElement.isDisplayed());
        System.out.println(case2.verifyHotDealEmailElement.getText());
        wait(3);
        
        case2.inputEmail();
        //CommonMethods.takeScreenshot("veryEmail");
        assertEquals(BaseClass.getProperty("adidaspage"), BaseClass.getDriver().getTitle());
        
      
    }
    
    
   
    
    
}
