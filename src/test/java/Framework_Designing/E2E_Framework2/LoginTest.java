package Framework_Designing.E2E_Framework2;

import java.io.IOException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageObjects.LoginPagePF;
import resources.Base;

public class LoginTest extends Base {
	public static Logger log=( LogManager.getLogger(LoginTest.class.getName()));
	@BeforeTest
	public void initialization() throws IOException {
		driver = initialaizeBrowser();
		log.info("Browser initialized for loginTest");
		
	}
	@Test(dataProvider="getData")
	public void loginTest(String email,String pswd) throws IOException
	{driver.get(prop.getProperty("url"));
	LoginPagePF lp=new LoginPagePF(driver);
	lp.login().click();
	lp.email().sendKeys(email);
	lp.pswd().sendKeys(pswd);
	lp.submit().click();
	log.info("loginTest done");
	System.out.println("i clone this project");
	
	}

	
@DataProvider
public Object[][] getData()
{ Object[][] data=new Object[3][2];
data[0][0]="ourlife@gmail.com";
data[0][1]="happyinourlife";
data[1][0]="sanketpriya@gmail.com";
data[1][1]="DNDourlife";
data[2][0]="happyplace@ourworld.com";
data[2][1]="no_oneallowed_itsour_world";

	return data;}

  @AfterTest
  public void teardown() { driver.close();
  } 
}
