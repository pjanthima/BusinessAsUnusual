package utilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.BaseClass;

public class BroswerUtilities {
	/*
	 * switches to new window by the exact title
	 */
	public static void switchToWindow(String targetTitle) {
		String origin = BaseClass.getDriver().getWindowHandle();
		for (String handle : BaseClass.getDriver().getWindowHandles()) {
			BaseClass.getDriver().switchTo().window(handle);
			if (BaseClass.getDriver().getTitle().equals(targetTitle)) {
				return;
			}
		}
		BaseClass.getDriver().switchTo().window(origin);
	}

	public static void switchToWindow(Integer tab) {
		ArrayList<String> tabs = new ArrayList<String>(BaseClass.getDriver().getWindowHandles());
		try {
			BaseClass.getDriver().switchTo().window(tabs.get(tab));
		} catch (Exception e) {
			System.out.println("Tab: " + tab + " not found!");
		}
	}

	public static String fn_TakeSnapshot(WebDriver driver, String DestFilePath) throws IOException {
		// String TS=fn_GetTimeStamp();
		TakesScreenshot tss = (TakesScreenshot) driver;
		File srcfileObj = tss.getScreenshotAs(OutputType.FILE);
		// DestFilePath=DestFilePath+TS+".png";
		File DestFileObj = new File(DestFilePath);
		FileUtils.copyFile(srcfileObj, DestFileObj);
		return DestFilePath;
	}

	public static void hover(WebElement element) {
		Actions actions = new Actions(BaseClass.getDriver());
		actions.moveToElement(element).perform();
	}

	public static void dragAndDrop(WebElement source, WebElement target) {
		Actions actions = new Actions(BaseClass.getDriver());
		actions.dragAndDrop(source, target).perform();
	}

	public static void doubleClick(WebElement source) {
		Actions actions = new Actions(BaseClass.getDriver());
		actions.doubleClick(source).perform();
	}

	/**
	 * return a list of string from a list of elements ignores any element with no
	 * text
	 * 
	 * @param list
	 * @return
	 */
	public static List<String> getElementsText(List<WebElement> list) {
		List<String> elemTexts = new ArrayList<String>();
		for (WebElement el : list) {
			if (!el.getText().isEmpty()) {
				elemTexts.add(el.getText());
			}
		}
		return elemTexts;
	}

	public static List<String> getElementsText(By locator) {

		List<WebElement> elems = BaseClass.getDriver().findElements(locator);
		List<String> elemTexts = new ArrayList<String>();

		for (WebElement el : elems) {
			if (!el.getText().isEmpty()) {
				elemTexts.add(el.getText());
			}
		}
		return elemTexts;
	}

	public static void searchTextBox(String searchText) {

	}

	public static void waitFor(int sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
		WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), timeToWaitInSec);
		return wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static WebElement waitForVisibility(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), timeout);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static WebElement waitForClickablility(WebElement element, int timeout) {
		WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), timeout);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static WebElement waitForClickablility(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), timeout);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
}
