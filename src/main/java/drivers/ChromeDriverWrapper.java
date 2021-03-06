package drivers;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeDriverWrapper extends WebDriverWrapper implements Initiable {

	public void init(String gridUrl) throws MalformedURLException {

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();

		ChromeOptions chromeOptions = new ChromeOptions();

		/**
		 * Start Chrome maximized
		 */
		chromeOptions.addArguments("--start-maximized");

		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

		driver = new RemoteWebDriver(new URL(gridUrl), capabilities);

	}

}
