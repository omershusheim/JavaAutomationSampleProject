package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import drivers.WebDriverWrapper;

public class amazonPages {
	public static class AmazonHomePage extends GenericPageObject {

		static By searchTextBox = By.xpath("//input[@id='twotabsearchtextbox']");

		public AmazonHomePage(WebDriverWrapper driverWrapper) {
			super(driverWrapper);
		}

		public static void enterTextToSearch(String text) {
			WebElement element = driverWrapper.findElement(searchTextBox);
			if (element != null) {
				element.sendKeys(text);
			}
		}

		public static void open() {
			driverWrapper.openUrl("http://www.amazon.com");

		}

	}

}
