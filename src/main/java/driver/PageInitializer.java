package driver;

import org.openqa.selenium.interactions.Actions;

import pages.CommonPage;
import pages.CommonPage_BAU_201;

public class PageInitializer extends BaseClass {

	public static CommonPage cP;
     
	public static CommonPage_BAU_201 cP201;
	
	public static void initialize() {
		cP = new CommonPage();
		cP201 = new CommonPage_BAU_201();
		
	}
}
