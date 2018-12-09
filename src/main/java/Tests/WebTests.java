package Tests;

import org.junit.Test;

import PageObjects.amazonPages;
import PageObjects.amazonPages.AmazonHomePage;

public class WebTests extends BasicTest {

	@Test
	public void testAmazon() {
		
		AmazonHomePage.open();
		AmazonHomePage.enterTextToSearch("lodge");
	}

}
