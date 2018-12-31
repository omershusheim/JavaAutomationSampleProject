package drivers;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Enums.ElementConditions;

public class WebDriverWrapper implements Initiable {

	private static final int DEFAULT_WAIT_INTERVAL_MS = 1000;
	private static final int DEFAULT_WAIT_TIMEOUT_S = 10;
	public RemoteWebDriver driver;
	WebDriverWait driverWait;
	WebElement webElement = null;

	public void init(String gridUrl) throws MalformedURLException {
		// TODO Auto-generated method stub

	}

	public WebElement findElement(By by) {
		return findElement(by, ElementConditions.visible);
	}

	public WebElement findElement(By by, ElementConditions condition) {
		driverWait = new WebDriverWait(driver, DEFAULT_WAIT_TIMEOUT_S, DEFAULT_WAIT_INTERVAL_MS);

		try {

			switch (condition) {
			case visible:
				webElement = driverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
				break;
			case clickable:
				webElement = driverWait.until(ExpectedConditions.elementToBeClickable(by));
				break;
			case presence:
				webElement = driverWait.until(ExpectedConditions.presenceOfElementLocated(by));
				break;
			case notVisible:
				boolean isVisible = driverWait.until(ExpectedConditions.invisibilityOfElementLocated(by));
				if (isVisible) {
					webElement = null;
				} else {
					webElement = driver.findElement(by);
				}
				break;
			default:
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return webElement;

	}

	public void findElementAndClick(By by) {
		webElement = findElement(by, ElementConditions.visible);

		if (webElement != null) {
			try {
				webElement.click();
			} catch (Exception e) {
				System.out.println("Exception when clicking element:" + by.toString());
			}
		}
	}

	public void openUrl(String url) {
		driver.get(url);

	}

	public void quit() {
		driver.quit();
		
	}

}
