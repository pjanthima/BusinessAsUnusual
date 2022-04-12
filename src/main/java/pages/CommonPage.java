package pages;

import org.openqa.selenium.support.PageFactory;

import driver.BaseClass;

public class CommonPage {

	public CommonPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	
	
}
}