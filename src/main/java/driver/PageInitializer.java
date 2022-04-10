package driver;

import pages.CommonPage;

import pages.CommonPage_BAU_TC206;

public class PageInitializer extends BaseClass {

	public static CommonPage cP;
	public static CommonPage_BAU_TC206 case1;

	public static void initialize() {
		cP = new CommonPage();
		case1 = new CommonPage_BAU_TC206();
		
		
		
		
	}
}

