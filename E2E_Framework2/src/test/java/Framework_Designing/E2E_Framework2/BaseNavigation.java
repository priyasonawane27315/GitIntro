package Framework_Designing.E2E_Framework2;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Landingpage;
import resources.Base;

public class BaseNavigation extends Base {
	public static Logger log=LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{driver = initialaizeBrowser();
	driver.get(prop.getProperty("url"));}
		

	@Test
	public void basenavigate() throws IOException {
		
		Landingpage landonpage = new Landingpage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",landonpage.signIn());
		//landonpage.signIn().click();
		landonpage.email().sendKeys("sanketpriya@ourlife.com");
		landonpage.password().sendKeys("dndourspace");
		log.info("Basenavigation tested successfully");

	}
	@AfterTest
	public void teardown()
	{driver.close();
	}
	
	}

