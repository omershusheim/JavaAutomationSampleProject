package Tests;

import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Before;

import PageObjects.GenericPageObject;
import drivers.ChromeDriverWrapper;
import drivers.WebDriverWrapper;

public class BasicTest {

	private static final String GRID_URL = "http://localhost:4444/wd/hub";

	GenericPageObject genericPageObject;

	WebDriverWrapper driverWrapper;

	@Before
	public void setup() throws MalformedURLException {

		driverWrapper = new ChromeDriverWrapper();

		driverWrapper.init(GRID_URL);

		genericPageObject = new GenericPageObject(driverWrapper);
	}

	@After
	public void tearDown() {

	}

}
