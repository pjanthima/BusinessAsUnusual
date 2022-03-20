package driver;

import pages.OpenGooglePractice;

public class PageInitializer extends BaseClass {

	public static OpenGooglePractice oGP;

	public static void initialize() {
		oGP = new OpenGooglePractice();
	}
}
