package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	public static Properties prop;
public static	WebDriver initialaizeBrowser() throws IOException
{
	 prop=new Properties();
	FileInputStream fis=new FileInputStream("D:\\Eclipes_Selenium\\E2E_Framework2\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
	String browsername=prop.getProperty("browser");
	if(browsername.equals("chrome"))
	{WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	}
	else if(browsername.equals("firefox"))
	{WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();}
	else if(browsername.equals("edge"))
	{WebDriverManager.edgedriver().setup();
	 driver=new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	return driver;
	}


}
