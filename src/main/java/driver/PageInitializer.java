package driver;

import pages.CommonPage;
import pages.CommonPage_BAU_301;

public class PageInitializer extends BaseClass {

	
	public static CommonPage cP;
	public static CommonPage_BAU_301 cP301;

	public static void initialize() {
		
		cP = new CommonPage();
		cP301 = new CommonPage_BAU_301();
		

		
	}
}
