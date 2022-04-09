package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.BaseClass;
import methods.CommonMethods;

public class CommonPage_BAU_TC204 {
//	                                    	>>>>>>>>>>>>>>>>>>>TOM<<<<<<<<<<<<<<<<<<<<
	public CommonPage_BAU_TC204() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//div[@id='page']/header/section/section[1]/div[2]/button")
	public WebElement categoriesTab;// Tom

	@FindBy(xpath = "//ul[@id='main-menu']/li[12]")
	public WebElement menuTabForJSViewTrue;

	@FindBy(xpath = "//ul[@id='main-menu']/li[17]/a")
	public WebElement shopTravelButton;

	@FindBy(xpath = "//div[@id='travel-partner-hotel']")
	public WebElement travelPartnerHotelDropDown;

	@FindBy(xpath = "//div[@id='option-drop-down-list-hotel']/ul/li[3]")
	public WebElement selectHotelDotCom;

	@FindBy(xpath = "//div[@class='travel-box']/h1")
	private WebElement shopTravelLabel;

	@FindBy(id = "hotel_city")
	public WebElement cityOrAirportCodeBox;

	@FindBy(xpath = "//div[@class='travel-section margin-top']/form/div[1]/div[2]")
	private WebElement clickOnCheckInBox;

	@FindBy(xpath = "//a[@class='ui-datepicker-next ui-corner-all']")
	private WebElement checkInClickNextArrow;

	@FindBy(xpath = "//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[6]")
	private WebElement clickOnDateCheckIn;

	@FindBy(xpath = "//div[@class='travel-section margin-top']/form/div[1]/div[3]")
	private WebElement clickOnCheckOutBox;

	@FindBy(xpath = "//div[@id='ui-datepicker-div']/div[1]/a[2]")
	private WebElement checkOutClickNextArrow;

	@FindBy(xpath = "//div[@id='ui-datepicker-div']/table/tbody/tr[5]/td[2]")
	private WebElement clickOnDateCheckOut;

	@FindBy(xpath = "//div[@id='rooms-hotel']/div[1]/button[1]")
	public WebElement roomQuantityAdding;

	@FindBy(xpath = "//div[@id='rooms-hotel']/div[2]/div[1]/input")
	private WebElement roomOneAdultQuantity;

	@FindBy(xpath = "//div[@id='rooms-hotel']/div[2]/div[2]/input")
	private WebElement roomOneChildrenQuantity;

	@FindBy(xpath = "//div[@id='rooms-hotel']/div[2]/div[3]/input")
	private WebElement roomTwoAdultQuantity;

	@FindBy(xpath = "//div[@id='rooms-hotel']/div[2]/div[4]/input")
	private WebElement roomTwoChildrenQuantity;

	@FindBy(xpath = "//div[@id='rooms-hotel']/div[2]/div[5]/input")
	private WebElement roomThreeAdultQuantity;

	@FindBy(xpath = "//div[@id='rooms-hotel']/div[2]/div[6]/input")
	private WebElement roomThreeChildrenQuantity;

	@FindBy(xpath = "//input[@id='js-shopper-email']")
	private WebElement enterEmailAddress;

	@FindBy(xpath = "//input[@id='js-travel-search']")
	private WebElement searchButton;

	@FindBy(xpath = "//span[@class='ISKOHc']")
	private WebElement hotelDotComLogo;

	@FindBy(id = "js-shop-travel-flights")
	public WebElement flightsTab;

//   ****************************FLIGHTS**********************************
	@FindBy(xpath = "//div[@id='travel-partner-flights']")
	public WebElement travelPartnerFlightsDropDown;

	@FindBy(xpath = "// div[@id='option-drop-down-list-flights']//child::li[3]")
	public WebElement selectOneTravelDotCom;

	@FindBy(id = "flight-one-way")
	public WebElement oneWayRadioButton;

	@FindBy(id = "flight_origination")
	private WebElement fromCityOrAirportCodeBox;

	@FindBy(xpath = "//li[contains(@data-dest,'IAD')]")
	private WebElement selectFromAirportCode_IAD;

	@FindBy(id = "flight_destination")
	private WebElement toCityOrAirportCodeBox;

	@FindBy(xpath = "//li[contains(@data-dest,'KUL')]")
	private WebElement selectToAirportCode_KUL;

	@FindBy(xpath = "//input[@id='flight_depart_date']")
	private WebElement flightDepartureDateBox;

	@FindBy(xpath = "//div[@id='ui-datepicker-div']/child::div[1]/a[2]")
	private WebElement departureDateNextArrow;

	@FindBy(xpath = "//a[text()='9']")
	private WebElement clickOnDepartureDate;

	@FindBy(id = "flight_number_travelers")
	private WebElement numberOfTravelers;

	@FindBy(xpath = "//header[@id='header']/div[1]/div/a")
	private WebElement oneTravelComLogo;

	public boolean verifyOneTravelComLogo() {
		return oneTravelComLogo.isDisplayed();
	}

	public void validNumberOfTravelers() {
		CommonMethods.sendText(numberOfTravelers, BaseClass.getProperty("validNumberOfTravelers"));
	}

	// checkn 5/9/2022
	public void selectDepartureDate() {
		// click departure date box
		CommonMethods.click(flightDepartureDateBox);
		// click arrow
		CommonMethods.click(departureDateNextArrow);
		// click on date
		CommonMethods.click(clickOnDepartureDate);
	}

	public void toCityOrAirportCode() {
		CommonMethods.sendText(toCityOrAirportCodeBox, BaseClass.getProperty("toCityOrAirportCodeBox"));
//		CommonMethods.click(toCityOrAirportCodeBox);
//		CommonMethods.click(selectToAirportCode_KUL);
	}

	public void fromCityOrAirportCode() {
		CommonMethods.sendText(fromCityOrAirportCodeBox, BaseClass.getProperty("fromCityOrAirportCodeBox"));
//		CommonMethods.click(fromCityOrAirportCodeBox);
//		CommonMethods.click(selectFromAirportCode_IAD);
	}

	public boolean oneWayBUttonIsSelected() {
		return oneWayRadioButton.isSelected();
	}

	public boolean verifyHotelDotComLogo() {
		return hotelDotComLogo.isDisplayed();
	}

	// search button
	public void searchButton() {
		CommonMethods.jsClick(searchButton);
	}

	// enter email address
	public void enterEmailAddress() {
		CommonMethods.sendText(enterEmailAddress, BaseClass.getProperty("enterEmailAddress"));
	}

	// room one
	public void roomOneAdultAndChildren() {
		// roomOneAdultQuantity - 2
		CommonMethods.sendText(roomOneAdultQuantity, BaseClass.getProperty("roomOneAdultQuantity"));
		// roomOneChildrenQuantity - 1
		CommonMethods.sendText(roomOneChildrenQuantity, BaseClass.getProperty("roomOneChildrenQuantity"));
	}

	// room two
	public void roomTwoAdultAndChildren() {
		// roomTwoAdultQuantity - 2
		CommonMethods.sendText(roomTwoAdultQuantity, BaseClass.getProperty("roomTwoAdultQuantity"));
		// roomTwoChildrenQuantity - 2
		CommonMethods.sendText(roomTwoChildrenQuantity, BaseClass.getProperty("roomTwoChildrenQuantity"));
	}

	// room three
	public void roomThreeAdultAndChildren() {
		// roomThreeAdultQuantity - 2
		CommonMethods.sendText(roomThreeAdultQuantity, BaseClass.getProperty("roomThreeAdultQuantity"));
		// roomThreeChildrenQuantity - 0
		CommonMethods.sendText(roomThreeChildrenQuantity, BaseClass.getProperty("roomThreeChildrenQuantity"));
	}

	// room quantity - total 3
	public void roomQuantity() {
		roomQuantityAdding.click();
		roomQuantityAdding.click();
	}

	// checkOut
	public void checkOutDate() {
		// clickOnCheckOutBox
		CommonMethods.click(clickOnCheckOutBox);
		// checkOutClickNextArrow twice
		CommonMethods.click(checkOutClickNextArrow);
		CommonMethods.click(checkOutClickNextArrow);
		// clickOnDateCheckOut
		CommonMethods.click(clickOnDateCheckOut);
	}

	// checkn 4/27/2022
	public void checkInDate() {
		// clickOnCheckInBox
		CommonMethods.click(clickOnCheckInBox);
		// checkInClickNextArrow
		CommonMethods.click(checkInClickNextArrow);
		// clickOnDateCheckIn
		CommonMethods.click(clickOnDateCheckIn);
	}

	// write city = Las Vegas
	public void writeCityOrAirportCodeBox() {
		CommonMethods.sendText(cityOrAirportCodeBox, BaseClass.getProperty("selectCityOrAirportCode"));
	}

	public boolean displayShopTravelLabel() {
		return shopTravelLabel.isDisplayed();
	}

	public void jSScrollDownView() {
		JavascriptExecutor je = (JavascriptExecutor) BaseClass.getDriver();

		WebElement element = menuTabForJSViewTrue;

		je.executeScript("arguments[0].scrollIntoView(true);", element);
	}
}
