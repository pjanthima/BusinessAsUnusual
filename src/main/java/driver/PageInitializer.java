package driver;

import pages.CommonPage;
import pages.CommonPageTaylor;
import pages.ContactUsPage;

public class PageInitializer extends BaseClass {

	public static CommonPage cP;
	
	public static CommonPageTaylor cPT;
	public static ContactUsPage cU;//TC304


	public static void initialize() {
		cP = new CommonPage();
		cPT = new CommonPageTaylor();
		cU = new ContactUsPage();
	}
}
