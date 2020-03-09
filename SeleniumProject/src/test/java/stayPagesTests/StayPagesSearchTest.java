package stayPagesTests;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;
import org.apache.logging.log4j.Logger;
import com.epam.pages.StaySearchPage;
import com.epam.utilities.BaseTestClass;

public class StayPagesSearchTest extends BaseTestClass {

	StaySearchPage page ;

	Logger log;
 
	@Test
	public void validatingLandingPage() {
	 page = new StaySearchPage(driver);
	 log=LogManager.getLogger(StayPagesSearchTest.class);
		assertEquals(page.getMessageText(), "Find deals on hotels, homes, and much ...");
		log.info("validatingLandingPage is passed");
	}

	@Test
	public void isTextFieldEnabled() {

	}
}
