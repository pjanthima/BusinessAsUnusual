package shopWebPage;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driver.BaseClass;
import methods.CommonMethods;
import utilities.Constants;

public class BAU_TC204 extends CommonMethods {
	@BeforeMethod
	public void setUp() {
		BaseClass.getDriver().get(BaseClass.getProperty("url1"));
		BaseClass.getDriver().manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		BaseClass.getDriver().manage().window().maximize();
	}

	@Test(priority = 1)
	public void searchForHotel() {
		// click [X] to exit pop up
		cP.closePopup.click();

		// click on categories tab
		cP204.categoriesTab.click();

		// use jsScroll method for visibility
		cP204.jSScrollDownView();

		// shop travel button
		click(cP204.shopTravelButton);

		scrollDown(100);
		// Verify that currently in shop travel page
		Assert.assertTrue(cP204.displayShopTravelLabel());// isDisplayed

		// click on travel partner drop down box
		click(cP204.travelPartnerHotelDropDown);

		// Select hotel.com
		click(cP204.selectHotelDotCom);

		// write Las Vegas in city or airport code box
		cP204.writeCityOrAirportCodeBox();

		// click city or airport code box
		click(cP204.cityOrAirportCodeBox);

		// CheckInDate - 4/27/2022
		cP204.checkInDate();

		// CheckOutBox - 6/27/2022
		cP204.checkOutDate();

		// Three Room
		cP204.roomQuantity();

		// room one adult - 2 And children - 1
		cP204.roomOneAdultAndChildren();

		// room two adult - 2 And children - 2
		cP204.roomTwoAdultAndChildren();

		// room three adult - 2 And children - 0
		cP204.roomThreeAdultAndChildren();

		// enterEmail
		cP204.enterEmailAddress();

		// searchButton
		cP204.searchButton();// jSClick

		// Switch to new tabs(hotel.com)
		switchToChildWindow();
		// verify Hotel.com logo
		Assert.assertTrue(cP204.verifyHotelDotComLogo());// isDisplayed

	}

	@Test(priority = 2)
	public void searchForFlight() {
		// click [X] to exit pop up
		cP.closePopup.click();

		// click on categories tab
		cP204.categoriesTab.click();

		// use jsScroll method for visibility
		cP204.jSScrollDownView();

		// shop travel button
		click(cP204.shopTravelButton);

		scrollDown(100);
		// Verify that currently in shop travel page
		Assert.assertTrue(cP204.displayShopTravelLabel());// isDisplayed
		click(cP204.flightsTab);

		wait(5);
		// click on travel partner drop down box
		click(cP204.travelPartnerFlightsDropDown);

		// select oneTravel.com
		click(cP204.selectOneTravelDotCom);

		// click one way radio button
		click(cP204.oneWayRadioButton);
		Assert.assertTrue(cP204.oneWayBUttonIsSelected());

		// select from airport code - IAD
		cP204.fromCityOrAirportCode();

		// select to airport code - KUL
		cP204.toCityOrAirportCode();

		// select departure date 5/9/2022
		cP204.selectDepartureDate();

		// enter valid number of travelers - 2
		cP204.validNumberOfTravelers();

		// enterEmail
		cP204.enterEmailAddress();

		// searchButton
		cP204.searchButton();// jSClick

		// Switch to new tabs(onetravel.com)
		switchToChildWindow();

		Assert.assertTrue(cP204.verifyOneTravelComLogo());// isDisplayed

	}

}
