package driver;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Constants;

public class BaseClass {

	private static WebDriver driver;
	private static Properties configFile;

	public static WebDriver getDriver() {
		if (driver == null) {

			switch (BaseClass.getProperty("browser")) {

			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();

				// PageInitializer.initialize();
				break;

			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

				break;

			case "safari":
				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();

				break;

			}
			PageInitializer.initialize();
		}

		return driver;
	}

	@AfterMethod
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

	static {

		try {
			String filePath = Constants.CONFIGURATION_FILEPATH;
			FileInputStream input = new FileInputStream(filePath);
			configFile = new Properties();
			configFile.load(input);
			input.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String keyName) {
		return configFile.getProperty(keyName);
	}
}
