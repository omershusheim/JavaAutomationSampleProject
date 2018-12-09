package PageObjects;

import drivers.WebDriverWrapper;

public class GenericPageObject {

	static WebDriverWrapper driverWrapper;

	public GenericPageObject(WebDriverWrapper driverWrapper) {
		this.driverWrapper = driverWrapper;
	}

}
