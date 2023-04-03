package Framework_Designing.E2E_Framework2;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Landingpage;
import resources.Base;

public class NavigationBarTest extends Base {
	public static Logger log=( LogManager.getLogger(NavigationBarTest.class.getName()));
	
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initialaizeBrowser();
		driver.get(prop.getProperty("url"));
	log.info("browser initialized and url lauched");
	System.out.println("made some changes");}

	@Test
	public void menuTest() {

		Landingpage lp = new Landingpage(driver);
		boolean result = lp.navBar().isDisplayed();
		//System.out.println(result);
		log.info("navigationbar test's result is: "+result);

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
