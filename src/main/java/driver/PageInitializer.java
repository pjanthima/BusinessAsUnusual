package driver;

import pages.CommonPage;
import pages.CommonPage_BAU_TC204;

public class PageInitializer extends BaseClass {

	public static CommonPage cP;
	public static CommonPage_BAU_TC204 cP204;

	public static void initialize() {
		cP = new CommonPage();
		cP204 = new CommonPage_BAU_TC204();
	}
}
