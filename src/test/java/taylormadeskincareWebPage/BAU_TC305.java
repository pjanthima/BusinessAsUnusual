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

		@Test//(enabled=false)
		public void Test1() throws InterruptedException   {

			
			Thread.sleep(2000);
			Cpb.ClosePopUP.click();
			Thread.sleep(3000);
			Cpb.SubscriptionPackage.click();
			Thread.sleep(2000);
			Cpb.SubscribeNowBtn.click();
			
			String YourOrderDetail= Cpb.YOurOrderDetail.getText();
			Assert.assertEquals(BaseClass.getProperty("OrderDetail"), YourOrderDetail);
			System.out.println(YourOrderDetail);
			
			Cpb.inputName.sendKeys(BaseClass.getProperty("Name"));
			Thread.sleep(1000);
			Cpb.inputEmail.sendKeys(BaseClass.getProperty("Email"));
			Thread.sleep(1000);
			Cpb.inputPhone.sendKeys(BaseClass.getProperty("Phone"));
			Thread.sleep(1000);
			Cpb.inputAddress.sendKeys(BaseClass.getProperty("Address"));
			Thread.sleep(1000);
			Cpb.inputCity.sendKeys(BaseClass.getProperty("City"));
			Thread.sleep(1000);
			Cpb.inputState.sendKeys(BaseClass.getProperty("State"));
			Thread.sleep(1000);
			Cpb.inputCountry.sendKeys(BaseClass.getProperty("Country"));
			Thread.sleep(1000);
			Cpb.SubscribeNow.click();
			
			String SubscribePaymentPage =Cpb.SubscribePayment.getText();
			Assert.assertEquals(BaseClass.getProperty("SubscribePayment"), SubscribePaymentPage);
			System.out.println(SubscribePaymentPage);
			
			
			}

		@Test//(enabled=false)
		public void test2() throws InterruptedException {
			
			Thread.sleep(3000);
			Cpb.ClosePopUP.click();
//			Actions act = new Actions(BaseClass.getDriver());

			//Double click on element
//			WebElement ele = BaseClass.getDriver().findElement(By.xpath("//*[@id='popup2']/span")); 
//			act.doubleClick(ele).perform();
			Thread.sleep(3000);
			Cpb.SubscriptionPackage.click();
			Thread.sleep(2000);
			Cpb.SubscribeNowBtn.click();
			
			String YourOrderDetail= Cpb.YOurOrderDetail.getText();
			Assert.assertEquals(BaseClass.getProperty("OrderDetail"), YourOrderDetail);
			System.out.println(YourOrderDetail);
			
			Cpb.inputName.sendKeys(BaseClass.getProperty("Name"));
			Thread.sleep(1000);
			Cpb.inputEmail.sendKeys(BaseClass.getProperty("Email"));
			Thread.sleep(1000);
			Cpb.inputPhone.sendKeys(BaseClass.getProperty("Phone"));
			Thread.sleep(1000);
			Cpb.inputAddress.sendKeys(BaseClass.getProperty("Address"));
			Thread.sleep(1000);
			Cpb.inputCity.sendKeys(BaseClass.getProperty("City"));
			Thread.sleep(1000);
			Cpb.inputState.sendKeys(BaseClass.getProperty("State"));
			Thread.sleep(1000);
			Cpb.inputCountry.sendKeys(BaseClass.getProperty("Country"));
			Thread.sleep(1000);
			Cpb.SubscribeNow.click();
			
			String SubscribePaymentPage =Cpb.SubscribePayment.getText();
			Assert.assertEquals(BaseClass.getProperty("SubscribePayment"), SubscribePaymentPage);
			System.out.println(SubscribePaymentPage);

			scrollDown(400);
			Thread.sleep(1000);
			switchToFrame(0);
			Cpb.PayPalSubscribe.click();
			Thread.sleep(2000);
			
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
		public void test3() throws InterruptedException {
		
			Thread.sleep(3000);
			Cpb.ClosePopUP.click();
			Thread.sleep(3000);
//			Double click on element
//			Actions act = new Actions(BaseClass.getDriver());
//			WebElement ele = BaseClass.getDriver().findElement(By.xpath("//*[@id='popup2']/span")); 
//			act.doubleClick(ele).perform();
			Cpb.FacebookIcon.click();
			Thread.sleep(2000);
			Set<String> ids = BaseClass.getDriver().getWindowHandles();
	        
	        Iterator<String> it = ids.iterator();
	        String parentID = it.next();
	        String childID = it.next();
	        BaseClass.getDriver().switchTo().window(childID);
	        System.out.println("After Switching to Child window >> " + BaseClass.getDriver().getTitle());
	        Thread.sleep(2000);
	        String currentUrl =BaseClass.getDriver().getCurrentUrl();
			String nextUrl = BaseClass.getDriver().getCurrentUrl();
			System.out.println(currentUrl);
			System.out.println(nextUrl);
			Assert.assertTrue(currentUrl.equals(nextUrl));
	
			Thread.sleep(3000);
	        Cpb.EmailFacebook.sendKeys(BaseClass.getProperty("EmailAddress"));
	        Thread.sleep(3000);
	        Cpb.passwordFacebook.sendKeys(BaseClass.getProperty("passwordFacebook"));
			Thread.sleep(2000);
			Cpb.LogInFacebook.click();
			
			String FacebookAccount=Cpb.AccountFacebook.getText();
			Assert.assertEquals(BaseClass.getProperty("myAccount"),FacebookAccount);
			System.out.println(FacebookAccount);
			System.out.println(FacebookAccount);
			 
		     
			
		}
		}

