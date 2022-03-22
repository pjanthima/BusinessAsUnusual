package driver;

import pages.RegisterPage;

public class PageInitializer extends BaseClass {

	public static RegisterPage rP;

	public static void initialize() {
		rP = new RegisterPage();
	}
}
