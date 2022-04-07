package driver;

import pages.CommonPage;
import pages.CommonPage_BAU_TC205;

public class PageInitializer extends BaseClass {

	public static CommonPage cP;
	public static CommonPage_BAU_TC205 cPTC205;

	public static void initialize() {
		cP = new CommonPage();
		cPTC205 = new CommonPage_BAU_TC205();
	}
}
