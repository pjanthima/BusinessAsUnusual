package practice;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driver.BaseClass;
import methods.CommonMethods;
import utilities.Constants;

public class DemoSite_Register extends CommonMethods {
	@BeforeMethod
	public void setUp() {
		BaseClass.getDriver().get(BaseClass.getProperty("url"));
		BaseClass.getDriver().manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		BaseClass.getDriver().manage().window().maximize();
	}

	@Test
	public void register() {
//          >>>>>>>>>>>>>>>>No hard code Here<<<<<<<<<<<<<

		// (Jandery)1 - fill up first name : "James"

		// (Sarah)2 - fill up last name : "Bond"

		// (hilale)3 - fill up address : "007 Casino Royal ST, Las Vegas, NV, 89109"

		// (Brekhna)4 - fill up email address : "james_bond007@gmail.com"

		// (Jenny)5 - fill up phone number : "9198805671"
         rP.inputPhoneNumber();
		// (Danny)6 - select gender : male
         rP.selectGender();

		// (Karaket)7 - select hobbies : movie

		// (Keaw)8 - select language : English and French

		// (Kalthera)9 - select skills : Javascript

		// (Tom)10 - select country : Hong Kong
		rP.selectCountry_Tom10();

		// (Puthea)11 - select birhtday : 1968 April 13

		// (Vgomez)12 - enter password and confirm password

		// (Tom)13 - click submit

	}

}
