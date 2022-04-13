package driver;

import pages.CommonPage;
import pages.CommonPage_BAU_201;
import pages.CommonPage_BAU_202;
import pages.CommonPage_BAU_301;
import pages.CommonPage_BAU_TC204;
import pages.CommonPage_BAU_TC205;
import pages.CommonPage_BAU_TC206;
import pages.CommonPage_BAU_TC207;
import pages.CommonPage_BAU_TC304;
import pages.CommonPage_BAU_TC305;
import pages.CommonPage_TC203;
import pages.CommonpageBAU_TC302;
import pages.ContactUsPage;

public class PageInitializer extends BaseClass {

	public static CommonPage cP;

	public static CommonPage_BAU_TC304 cPT304;

	public static CommonPage_BAU_TC206 case1;

	public static CommonPage_BAU_TC204 cP204;

	public static ContactUsPage cU;

	public static CommonpageBAU_TC302 cPG;

	public static CommonPage_BAU_TC207 case2;

	public static CommonPage_BAU_TC305 Cpb;

	public static CommonPage_BAU_201 cP201;

	public static CommonPage_BAU_TC205 cPTC205;

	public static CommonPage_TC203 cP203;

	public static CommonPage_BAU_202 cp;

	public static CommonPage_BAU_301 cP301;

	public static void initialize() {

		cP301 = new CommonPage_BAU_301();

		cP = new CommonPage();

		cPT304 = new CommonPage_BAU_TC304();

		case1 = new CommonPage_BAU_TC206();

		case1 = new CommonPage_BAU_TC206();

		cP204 = new CommonPage_BAU_TC204();

		cP201 = new CommonPage_BAU_201();

		cPTC205 = new CommonPage_BAU_TC205();

		cp = new CommonPage_BAU_202();

		case2 = new CommonPage_BAU_TC207();

		cPG = new CommonpageBAU_TC302();

		Cpb = new CommonPage_BAU_TC305();

		cPG = new CommonpageBAU_TC302();

		Cpb = new CommonPage_BAU_TC305();

		cP203 = new CommonPage_TC203();

	}
}
