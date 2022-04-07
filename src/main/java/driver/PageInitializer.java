package driver;

import pages.CommonPage;
import pages.CommonpageBAU_TC302;

public class PageInitializer extends BaseClass {

	public static CommonPage cP;
    public static CommonpageBAU_TC302 cPG;

	public static void initialize() {
		cP = new CommonPage();
	   
		cPG = new CommonpageBAU_TC302();
	}
}
