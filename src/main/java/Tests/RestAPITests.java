package Tests;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;

import TestObjects.UserObject;

public class RestAPITests {

	@Test
	public void testSendRestRequest() {

		UserObject userObjec = new UserObject(RandomStringUtils.randomAlphabetic(5, 12),
				RandomStringUtils.randomAlphabetic(10), RandomStringUtils.randomAlphabetic(5, 12));

	}

}
