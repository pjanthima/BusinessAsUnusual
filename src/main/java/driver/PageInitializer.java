package driver;

import pages.CommonPage;
import pages.CommonPage_BAU_TC303;

public class PageInitializer extends BaseClass {

	public static CommonPage cP;
    public static CommonPage_BAU_TC303 cP303;
	public static void initialize() {
		cP = new CommonPage();
		cP303 = new CommonPage_BAU_TC303();
		
		
	}
}
