package shopWebPage;

import java.util.concurrent.TimeUnit;

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

    @Test
    public void Test1_BAU_TC207() throws InterruptedException {
        cP.closePopup.click();
        case1.verifyHomePage();
        case1.storeMenuElement.click();
        case1.verifyStorePage();
        case1.findAStore();
        case1.clickOnBedBath();
        
    }
    
    
}
