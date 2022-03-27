package driver;

import pages.CommonPage;

public class PageInitializer extends BaseClass {

	public static CommonPage cP;

	public static void initialize() {
		cP = new CommonPage();
	}
}
