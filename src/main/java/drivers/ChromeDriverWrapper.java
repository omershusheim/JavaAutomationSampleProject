package drivers;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeDriverWrapper extends WebDriverWrapper implements Initiable {

	public void init(String gridUrl) throws MalformedURLException {

		Capabilities capabilities = DesiredCapabilities.chrome();//

		driver = new RemoteWebDriver(new URL(gridUrl), capabilities);

	}

}
