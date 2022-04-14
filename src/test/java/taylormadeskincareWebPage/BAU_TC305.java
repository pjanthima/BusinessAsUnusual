package taylormadeskincareWebPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driver.BaseClass;
import methods.CommonMethods;
import utilities.Constants;

public class BAU_TC305 extends CommonMethods {

		@BeforeMethod	
		public void setUp() {
			BaseClass.getDriver().get(BaseClass.getProperty("url2"));
			BaseClass.getDriver().manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
			BaseClass.getDriver().manage().window().maximize();
		}

		@Test(enabled=false)
		public void Test1()    {

			
			wait(2);
			Cpb.ClosePopUP.click();
			wait(2);
			Cpb.SubscriptionPackage.click();
			wait(2);
			Cpb.SubscribeNowBtn.click();
			
			String YourOrderDetail= Cpb.YOurOrderDetail.getText();
			Assert.assertEquals(BaseClass.getProperty("OrderDetail"), YourOrderDetail);
			System.out.println(YourOrderDetail);
			
			Cpb.inputName.sendKeys(BaseClass.getProperty("Name"));
			wait(2);
			Cpb.inputEmail.sendKeys(BaseClass.getProperty("Email"));
			wait(2);
			Cpb.inputPhone.sendKeys(BaseClass.getProperty("Phone"));
			wait(2);
			Cpb.inputAddress.sendKeys(BaseClass.getProperty("Address"));
			wait(2);
			Cpb.inputCity.sendKeys(BaseClass.getProperty("City"));
			wait(2);
			Cpb.inputState.sendKeys(BaseClass.getProperty("State"));
			wait(2);
			Cpb.inputCountry.sendKeys(BaseClass.getProperty("Country"));
			wait(2);
			Cpb.SubscribeNow.click();
			
			String SubscribePaymentPage =Cpb.SubscribePayment.getText();
			Assert.assertEquals(BaseClass.getProperty("SubscribePayment"), SubscribePaymentPage);
			System.out.println(SubscribePaymentPage);
			
			
			}

		@Test(enabled=false)
		public void test2()  {
			
			wait(2);
			Cpb.ClosePopUP.click();
//			Actions act = new Actions(BaseClass.getDriver());

			//Double click on element
//			WebElement ele = BaseClass.getDriver().findElement(By.xpath("//*[@id='popup2']/span")); 
//			act.doubleClick(ele).perform();
			wait(2);
			Cpb.SubscriptionPackage.click();
			wait(2);
			Cpb.SubscribeNowBtn.click();
			
			String YourOrderDetail= Cpb.YOurOrderDetail.getText();
			Assert.assertEquals(BaseClass.getProperty("OrderDetail"), YourOrderDetail);
			System.out.println(YourOrderDetail);
			
			Cpb.inputName.sendKeys(BaseClass.getProperty("Name"));
			wait(2);
			Cpb.inputEmail.sendKeys(BaseClass.getProperty("Email"));
			wait(2);
			Cpb.inputPhone.sendKeys(BaseClass.getProperty("Phone"));
			wait(2);
			Cpb.inputAddress.sendKeys(BaseClass.getProperty("Address"));
			wait(2);
			Cpb.inputCity.sendKeys(BaseClass.getProperty("City"));
			wait(2);
			Cpb.inputState.sendKeys(BaseClass.getProperty("State"));
			wait(2);
			Cpb.inputCountry.sendKeys(BaseClass.getProperty("Country"));
			wait(2);
			Cpb.SubscribeNow.click();
			
			String SubscribePaymentPage =Cpb.SubscribePayment.getText();
			Assert.assertEquals(BaseClass.getProperty("SubscribePayment"), SubscribePaymentPage);
			System.out.println(SubscribePaymentPage);

			scrollDown(400);
			wait(2);
			switchToFrame(0);
			Cpb.PayPalSubscribe.click();
			wait(2);
			
			Set<String> ids = BaseClass.getDriver().getWindowHandles();
	        Iterator<String> it = ids.iterator();
	        String parentID = it.next();
	        String childID = it.next();
	        BaseClass.getDriver().switchTo().window(childID);
	        System.out.println("After Switching to Child window >> " + BaseClass.getDriver().getTitle());
	       
	        String currentUrl =BaseClass.getDriver().getCurrentUrl();
			String nextUrl = BaseClass.getDriver().getCurrentUrl();
			System.out.println(currentUrl);
			System.out.println(nextUrl);
			Assert.assertTrue(currentUrl.equals(nextUrl));
	
			}
		@Test//(enabled=false)
		public void test3() {
		
			wait(2);
			Cpb.ClosePopUP.click();
			wait(2);
//			Double click on element
//			Actions act = new Actions(BaseClass.getDriver());
//			WebElement ele = BaseClass.getDriver().findElement(By.xpath("//*[@id='popup2']/span")); 
//			act.doubleClick(ele).perform();
			Cpb.FacebookIcon.click();
			wait(2);
//			Set<String> ids = BaseClass.getDriver().getWindowHandles();
	        
			
			
			switchToChildWindow(); 
//	        Iterator<String> it = ids.iterator();
//	        String parentID = it.next();
//	        String childID = it.next();
//	        BaseClass.getDriver().switchTo().window(childID);
	        System.out.println("After Switching to Child window >> " + BaseClass.getDriver().getTitle());
	        wait(2);
	        String currentUrl =BaseClass.getDriver().getCurrentUrl();
			String nextUrl = BaseClass.getDriver().getCurrentUrl();
			System.out.println(currentUrl);
			System.out.println(nextUrl);
			Assert.assertTrue(currentUrl.equals(nextUrl));
	
			wait(2);
	        Cpb.EmailFacebook.sendKeys(BaseClass.getProperty("EmailAddress"));
	        wait(2);
	        Cpb.passwordFacebook.sendKeys(BaseClass.getProperty("passwordFacebook"));
	        wait(2);
			Cpb.LogInFacebook.click();
			
			String FacebookAccount=Cpb.AccountFacebook.getText();
			Assert.assertEquals(BaseClass.getProperty("myAccount"),FacebookAccount);
			System.out.println(FacebookAccount);
			System.out.println(FacebookAccount);
			 
		     
			
		}
		}

