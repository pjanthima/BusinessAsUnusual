package shopWebPage;

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
    public void Test1_BAU_TC207() throws InterruptedException {
        cP.closePopup.click();
        cP.storeMenuElement.click();
        case1.verifyStorePage();
        case1.findAStore();
        case1.clickOnBedBath();
        Assert.assertEquals(case1.bedBathDealInfoText.getText(), "Deals and Information");
        
    }
    
    @Test(priority = 2)
    public void Test2_BAU_TC207() throws InterruptedException {
        cP.closePopup.click();
        cP.storeMenuElement.click();
        case1.verifyStorePage();
        case1.findAStoreErrorMsg();
        
        
    }
    
    @Test(priority = 3)
    public void Test3_BAU_TC207() throws InterruptedException {
        cP.closePopup.click();
        cP.storeMenuElement.click();
        case1.verifyStorePage();
        case1.findAdidasStore();
        Assert.assertEquals(case1.adidasStorElement.getText(), "Adidas");      
        case1.clickOnAdidasStore();
        case1.clickHotDealShopNow();
        BaseClass.getDriver().manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
        switchToChildWindow();
        Assert.assertEquals(true, case1.verifyHotDealEmailElement.isDisplayed());
        System.out.println(case1.verifyHotDealEmailElement.getText());
        BaseClass.getDriver().manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
        case1.inputEmail();
        BaseClass.getDriver().manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
    }
    
    
   
    
    
}
