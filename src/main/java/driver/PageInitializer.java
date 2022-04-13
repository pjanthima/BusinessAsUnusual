package driver;

import pages.CommonPage;
import pages.CommonpageBAU_TC302;
import pages.CommonPage_BAU_TC207;
import pages.CommonPage_BAU_TC304;
import pages.CommonPage_BAU_TC305;

public class PageInitializer extends BaseClass {

	public static CommonPage cP;

	public static CommonPage_BAU_TC304 cPT304;

	public static CommonpageBAU_TC302 cPG;

	public static CommonPage_BAU_TC207 case1;

	public static CommonPage_BAU_TC305 Cpb;

	public static void initialize() {

		cP = new CommonPage();

		cPT304 = new CommonPage_BAU_TC304();

		

		case1 = new CommonPage_BAU_TC207();
		
		cPG = new CommonpageBAU_TC302();

		Cpb = new CommonPage_BAU_TC305();

	}
}
